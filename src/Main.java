// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import com.myparser.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStreams;

import javax.swing.*;
import java.io.ByteArrayInputStream;


public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        try{
            var inputOptionPane = JOptionPane.showInputDialog("Ingrese valor a calcular:");
            //var expression = "((2+2)+(log(3)+exp(1)))*((2+2)+(log(3)+exp(1)))";
            var inputStream = new ByteArrayInputStream(inputOptionPane.getBytes());

            var lexer = new mathLexer(CharStreams.fromStream(inputStream));
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new mathParser(tokenStream);
            var startrule = parser.expr();
            var visitor = new CustomVisitor();
            visitor.visit(startrule);
            System.out.println(visitor.visitExpr(startrule).toString());

            JOptionPane.showMessageDialog(null
                    , "Resultado: " + visitor.visitExpr(startrule).toString()
                    , "Math"
                    , JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}