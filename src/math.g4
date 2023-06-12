grammar math;

expr: prod ((ADD | SUB) prod)*;
prod: factor((MUL | DIV) factor)*;
factor: LPAREN expr RPAREN | INT | log | exp;
log: 'log' LPAREN factor RPAREN;
exp: 'exp' LPAREN factor RPAREN;
INT: [0-9]+ ;
LPAREN: '(';
RPAREN: ')';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';