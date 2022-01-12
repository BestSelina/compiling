grammar miniSysY;

Int: 'int';
Main: 'main';
Return: 'return';

LPar: '(';
RPar: ')';
LBrace: '{';
RBrace: '}';
Semicolon: ';';
UnaryOp: '+' | '-';
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
addExp: mulExp;
mulExp: unaryExp;
unaryExp: primaryExp | UnaryOp unaryExp;
primaryExp: LPar exp RPar | number;
number: DecimalNumber | OctalNumber | HexadecimalNumber;

