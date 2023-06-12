import com.myparser.parser.mathBaseVisitor;
import com.myparser.parser.mathParser;

public class CustomVisitor extends mathBaseVisitor<Object> {
    @Override public Object visitExpr(mathParser.ExprContext ctx) {
        if(ctx.children.size() == 3){
            var l = visitProd(ctx.prod(0)).toString();
            var m = ctx.children.get(1).getText();
            var r = visitProd(ctx.prod(1)).toString();

            switch (m) {
                case "+" -> {
                    return Double.parseDouble(l) + Double.parseDouble(r);
                }
                case "-" -> {
                    return Integer.parseInt(l) - Integer.parseInt(r);
                }
            }
        }
        return visitProd(ctx.prod(0));
    }

    @Override public Object visitProd(mathParser.ProdContext ctx) {
        if(ctx.children.size() == 3){
            var l = visitFactor(ctx.factor(0)).toString();
            var m = ctx.children.get(1).getText();
            var r = visitFactor(ctx.factor(1)).toString();

            switch (m) {
                case "*" -> {
                    return Double.parseDouble(l) * Double.parseDouble(r);
                }
                case "/" -> {
                    return Double.parseDouble(l) / Double.parseDouble(r);
                }
            }
        }
        return visitFactor(ctx.factor(0));
    }

    @Override public Object visitFactor(mathParser.FactorContext ctx) {
        if(ctx.children.size() == 3){
            //var left = visit(ctx.LPAREN());
            //var middle = visit(ctx.expr());
            //var right = visit(ctx.RPAREN());
            // ( visitExpr )
            return visitExpr(ctx.expr());
        }

        var logCheck = ctx.log();
        var expCheck = ctx.exp();
        if(logCheck != null){
            return visitLog(ctx.log());
        }
        if(expCheck != null){
            return visitExp(ctx.exp());
        }
        return ctx.INT();
    }


    @Override public Object visitLog(mathParser.LogContext ctx) {
        var value = visitFactor(ctx.factor()).toString();
        return Math.log(Double.parseDouble(value));
    }

    @Override public Object visitExp(mathParser.ExpContext ctx) {
        var value = visitFactor(ctx.factor()).toString();
        return Math.exp(Double.parseDouble(value));
    }

}
