grammar miniSysY;

Int: 'int';
Main: 'main';
Return: 'return';

LPar: '(';
RPar: ')';
LBrace: '{';
RBrace: '}';
Semicolon: ';';
Add: '+';
Sub: '-';
Mul: '*';
Div: '/';
Mod: '%';
DecimalNumber: [1-9][0-9]*;
OctalNumber: [0][0-7]*;
HexadecimalNumber: [0][xX][0-9a-fA-F]+;

WHITE_SPACE : [ \t\n\r] -> skip;
COMMENT : '/*' .*? '*/' ->skip;
COMMENT_LINE : '//' ~[\r\n]* ->skip;

compUnit: funcDef;
funcDef: funcType ident LPar RPar block;
funcType: Int;
ident: Main;
block: LBrace stmt RBrace;
stmt: Return exp Semicolon;
exp: addExp;
addExp: mulExp addExp0;
addExp0: addOp mulExp addExp0 | ;
addOp: Add | Sub;
mulExp: unaryExp mulExp0;
mulExp0: mulOp unaryExp mulExp0 | ;
mulOp: Mul | Div | Mod;
unaryExp: primaryExp | unaryOp unaryExp;
unaryOp: Add | Sub;
primaryExp: LPar exp RPar | number;
number: DecimalNumber | OctalNumber | HexadecimalNumber;

