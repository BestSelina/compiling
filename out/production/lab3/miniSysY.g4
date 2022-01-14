grammar miniSysY;

Int: 'int';
Main: 'main';
Return: 'return';
Const: 'const';

LPar: '(';
RPar: ')';
LBrace: '{';
RBrace: '}';
Comma: ',';
Semicolon: ';';
Add: '+';
Sub: '-';
Mul: '*';
Div: '/';
Mod: '%';
Assign: '=';

DecimalNumber: [1-9][0-9]*;
OctalNumber: [0][0-7]*;
HexadecimalNumber: [0][xX][0-9a-fA-F]+;
Ident: [_a-zA-Z][_0-9a-zA-Z]*;

WHITE_SPACE : [ \t\n\r] -> skip;
COMMENT : '/*' .*? '*/' ->skip;
COMMENT_LINE : '//' ~[\r\n]* ->skip;

compUnit: funcDef;
funcDef: funcType ident LPar RPar block;
funcType: Int;
ident: Main;
block: LBrace ( blockItem )* RBrace;
blockItem: decl | stmt;
decl: constDecl | varDecl;
constDecl: Const bType constDef ( Comma constDef )* Semicolon;
bType: Int;
constDef: Ident Assign constInitVal;
constInitVal: constExp;
constExp: addExp;
varDecl: bType varDef ( Comma varDef )* Semicolon;
varDef: Ident | Ident Assign initVal;
initVal: exp;
stmt: lVal Assign exp Semicolon | Return exp Semicolon | exp Semicolon | Semicolon;
lVal: Ident;
exp: addExp;
addExp: mulExp addExp0;
addExp0: addOp mulExp addExp0 | ;
addOp: Add | Sub;
mulExp: unaryExp mulExp0;
mulExp0: mulOp unaryExp mulExp0 | ;
mulOp: Mul | Div | Mod;
unaryExp: primaryExp | unaryOp unaryExp | Ident LPar funcRParams RPar | Ident LPar RPar;
funcRParams: exp;
unaryOp: Add | Sub;
primaryExp: LPar exp RPar | lVal | number;
number: DecimalNumber | OctalNumber | HexadecimalNumber;

