grammar miniSysY;

Int: 'int';
Main: 'main';
Return: 'return';
Const: 'const';
If: 'if';
Else: 'else';

LPar: '(';
RPar: ')';
LBrace: '{';
RBrace: '}';
Comma: ',';
Semicolon: ';';

Not: '!';
Add: '+';
Sub: '-';
Mul: '*';
Div: '/';
Mod: '%';

Assign: '=';
Lt: '<';
LtEq: '<=';
Gt: '>';
GtEq: '>=';
Eq: '==';
NotEq: '!=';
And: '&&';
Or: '||';

DecimalNumber: [1-9][0-9]*;
OctalNumber: [0][0-7]*;
HexadecimalNumber: [0][xX][0-9a-fA-F]+;
Ident: [_a-zA-Z][_0-9a-zA-Z]*;

WHITE_SPACE : [ \t\n\r] -> skip;
COMMENT : '/*' .*? '*/' ->skip;
COMMENT_LINE : '//' ~[\r\n]* ->skip;

compUnit: ( globalDecl )* funcDef;
globalDecl: constDecl | globalVarDecl;
globalVarDecl: bType globalVarDef ( Comma globalVarDef )* Semicolon;
globalVarDef: Ident | Ident Assign constExp;

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
stmt: lVal Assign exp Semicolon
        | Return exp Semicolon
        | exp Semicolon
        | Semicolon
        | block
        | If LPar cond RPar stmt
        | If LPar cond RPar stmt Else stmt;
lVal: Ident;
cond: lOrExp;
exp: addExp;
addExp: mulExp addExp0;
addExp0: addOp mulExp addExp0 | ;
addOp: Add | Sub;

mulExp: unaryExp mulExp0;
mulExp0: mulOp unaryExp mulExp0 | ;
mulOp: Mul | Div | Mod;

relExp: addExp relExp0;
relExp0: relOp addExp relExp0 | ;
relOp: Lt | Gt | LtEq | GtEq;

eqExp: relExp eqExp0;
eqExp0: eqOp relExp eqExp0 | ;
eqOp: Eq | NotEq;

lAndExp: eqExp lAndExp0;
lAndExp0: lAndOp eqExp lAndExp0 | ;
lAndOp: And;

lOrExp: lAndExp lOrExp0;
lOrExp0: lOrOp lAndExp lOrExp0 | ;
lOrOp: Or;

unaryExp: primaryExp
            | unaryOp unaryExp
            | Ident LPar funcRParams RPar
            | Ident LPar RPar;
funcRParams: exp;
unaryOp: Add | Sub | Not;
primaryExp: LPar exp RPar | lVal | number;
number: DecimalNumber | OctalNumber | HexadecimalNumber;



