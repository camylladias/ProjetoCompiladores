grammar atribuicao;

init: cmd+;

cmd: cmdAtribui | cmdLeia| cmdImprime | cmdExpressao | cmdSe | cmdPara | cmdEnquanto;

cmdAtribui: tipo id operadorAtri (id|numero) fim;

cmdLeia: 'leia' leftParen id rightParen fim;

cmdImprime: 'imprime' leftParen (texto|id) rightParen fim;

cmdExpressao: id operadorAtri expressao fim;

cmdSe: 'se' leftParen expressao comparador expressao rightParen '{' cmd+ '}' senao '{' cmd+ '}';

cmdPara: 'para' leftParen id '=' numero ';' id comparador numero ';' id '++' rightParen '{' cmd+'}';

cmdEnquanto: 'enquanto' leftParen expressao comparador expressao rightParen '{'cmd+'}';

tipo: 'booleano' | 'inteiro' | 'flutuante' | 'palavra';
operadorMat: '+' | '-' | '*' | '/' ; 
operadorAtri: '=';
fim: ';' ;
comparador: '==' | '<' | '>' | '<=' | '>=' | '!=';
numero: NUM;
NUM: [0-9]+;
id: ID;
ID: [a-zA-Z0-9]+;
texto: TEXTO; 
TEXTO:'"' [a-zA-Z0-9]+ '"';
leftParen: '(';
rightParen: ')';
expressao: termo expreLinha;
termo: fator termoLinha;
expreLinha: '+' termo expreLinha | '-' termo expreLinha | |;
fator: numero | id | leftParen expressao rightParen;
termoLinha: '*' fator termoLinha | '/' fator termoLinha | |;

Ws:[ \t\r\n]+ -> skip;

