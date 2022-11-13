grammar atribuicao;

init: cmd+;

cmd: cmdDeclara | cmdLeia| cmdImprime | cmdExpressao | cmdSe | cmdPara | cmdEnquanto | cmdSenao;

cmdDeclara: (tipo id fim)| cmdAtribui;

cmdAtribui:(tipo id operadorAtri (id|numero|texto|booleano) fim)|(id operadorAtri (id|numero|texto|booleano) fim);

cmdLeia: 'leia(' id ')' complementoLeia fim;

complementoLeia: | |;

cmdImprime: 'imprime' leftParen (texto|id) rightParen fim;

cmdExpressao: expr fim;

cmdSe: 'se' leftParen expressao (compIgual|compMaior|compMenor|compMeIgual|compMaIgual|compDifer) expressao rightParen leftChave cmd+ rightChave cmdSenao?;

cmdSenao: 'senao' leftChave cmd+ rightChave ;

cmdPara: 'para' leftParen tipo id operadorAtri numero fim id (compIgual|compMaior|compMenor|compMeIgual|compMaIgual|compDifer) numero fim expr rightParen leftChave cmd+ rightChave;

cmdEnquanto: 'enquanto' leftParen ((expr (compIgual|compMaior|compMenor|compMeIgual|compMaIgual|compDifer) expr)| booleano) rightParen leftChave cmd+ rightChave;

tipo: 'booleano' | 'inteiro' | 'flutuante' | 'palavra';
operadorAtri: '=';
fim: ';' ;
compIgual: '==';
compMaior: '>';
compMenor: '<';
compMeIgual: '<=';
compMaIgual: '>=';
compDifer: '!=';
numero: NUMINT | NUMFLOAT;
NUMINT: [0-9]+;
NUMFLOAT: [0-9]+ '.' [0-9]+;
booleano: BOOLEANOtrue|BOOLEANOfalse;
BOOLEANOtrue:  'true';
BOOLEANOfalse: 'false';
id: ID;
ID: [a-zA-Z0-9]+;
texto: TEXTO; 
TEXTO:'"' [a-zA-Z0-9]+ '"';
leftParen: '(';
rightParen: ')';
leftChave: '{';
rightChave: '}';
plus: '+';
menus: '-';
div: '/';
mult: '*';
expr: id operadorAtri expressao;
expressao: termo expreLinha;
termo: fator termoLinha;
expreLinha: plus termo expreLinha | menus termo expreLinha | |;
fator: numero | id | leftParen expressao rightParen;
termoLinha: mult fator termoLinha | div fator termoLinha | |;

Ws:[ \t\r\n]+ -> skip;