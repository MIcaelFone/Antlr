//Nomes: Bruno Feliciano, Micael Daniel, Pedro Antonio,Thiago Rosa
grammar Expr;

//Analise lexica

NUMERO_INTEIRO_POSITIVO : [1-9] [0-9]* ; // token representa números inteiros positivos  maiores de zero podendo ter mais de um ou mais digitos 
NUMERO_INTEIRO_NEGATIVO : '-' [1-9] [0-9]* ; // token representa números inteiros negativos maiores de zero podendo ter mais de um ou mais digitos 
NUMERO_FLOAT_POSITIVO : [1-9] [0-9]* ('.' [0-9]+)? | NUMERO_ZERO '.' [0-9]+ ; // um token representa números decimais positivo e maiores do que 0 com um mais digitos antes do ponto e um ou mais digitos depois do ponto
NUMERO_FLOAT_NEGATIVO : '-' [1-9] [0-9]* ('.' [0-9]+)? | '-' NUMERO_ZERO '.' [0-9]+ ; // um token representa  números decimais negativo e maiores do que 0 com um mais digitos antes do ponto e um ou mais digitos depois do ponto
NUMERO_ZERO : [0] ;  // token representa o digito zero
NOVALINHA: [\r\n]+ ; // token de quebra de linha 

//Analise sintatica

prog: (expr NOVALINHA)* ;

expr:  
     '(' numero_inteiro numero_inteiro_semzero '/'  ')' //operação de divisão real de um numero numero inteiro por outro numero inteiro que não seja zero
     | '(' numero_inteiro numero_inteiro_semzero '|' ')' // operação de divisão real com numero numero inteiro por outro numero inteiro que não seja zero
     | '(' numero_inteiro numero_float_semzero '|' ')'// operação de divisão real com numero inteiro por outro numero float que não seja zero  
     | '(' numero_float numero_inteiro_semzero '|' ')' // operação de divisão real com numero float  por outro numero inteiro  que não seja zero
     | '(' numero_float numero_float_semzero '|' ')' //  operação de divisão real com numero float  por outro numero float  que não seja zero
     | '(' numero_inteiro numero_inteiro_semzero '%' ')' // operação de resto de um numero inteiro por outro numero inteiro que não seja zero
     | '(' numero_real numero_inteiro_positivo '^' ')' //operação de potenciação de um numero real elevado a  um numero inteiro positivo
     | '(' numero_real numero_real '+' ')' // operacao de soma de um numero real com outro numero real
     | '(' numero_real numero_real '-' ')' // operacao de subtração de um numero real com outro numero real
     | '(' numero_real numero_real '*' ')' // operacao de multiplicação de um numero real com outro numero real
     | '(' expr expr operador ')' // operacao matematica entre duas expressões
     | '(' numero_real expr  operador ')' // operacao mateematica entre um numero real e uma expressão
     | '(' numero_real 'MEM' ')' // Amarzenar um numero real na memoria
     | '(' 'MEM' ')'  // Traz um numero real que estava amazenado na memoria
     | '(' expr 'MEM' ')' // Amazena uma expressão na memoria
     | '(' 'MEM' expr ')' // Traz um numero real em que estava amazenado na memoria e  ao seu lado aparece uma  expressão
     | '(' 'MEM' expr operador ')' // operação matematica entre um numero real que estava amazenado na memoria com uma expressão
     | '(' numero_real 'MEM' expr operador ')' // Traz o resultado de uma expressão de uma linha especifica e logo ápos aparece uma expressão com uma operação matematica
     | '(' numero_inteiro_positivo 'RES' ')'  // traz o resultado de uma expessão de uma linha especifica 
     | '(' numero_inteiro_positivo 'RES' expr operador ')'  // traz o resultado de uma expessão de uma linha especifica e logo ápos  aparece uma expressão com uma operação matematica
     | '(' expr numero_inteiro_positivo 'RES' ')'  // traz o resultado de uma expessão de uma linha especifica e antes é acompanhado por uma expressão
     | '(' expr 'RES'  ')'  // traz o resultado de uma expessão  
     | '(' expr 'RES' expr  ')' // traz o resultado de uma expessão e logo ápos pode aparecer uma outra expressão
     | '(' expr 'RES' expr operador  ')' // traz o resultado de uma expessão e logo ápos pode aparecer uma outra expressão com uma operação matematica
     | '(' expr 'RES' expr 'RES' operador  ')'; // traz o resultado de duas expessoes e logo ápos aparece uma outra expressão com uma operação matematica

//Outras regras
operador : '+' | '-' | '*' | '/' | '%' | '^' | '|' ; // operadores matematicos

numero_real: numero_inteiro | numero_float ; // numero real pode ser um numero inteiro ou um numero float

numero_inteiro_semzero : NUMERO_INTEIRO_POSITIVO | NUMERO_INTEIRO_NEGATIVO ; // numero inteiro sem o digito zero pode ser um numero inteiro positivo que não seja zeri ou negativo que nao seja zero 

numero_inteiro: numero_inteiro_semzero | numero_zero ; // numero inteiro pode ser um  numero inteiro tanto positivo e negativo com ou sem o numero zero

numero_zero:NUMERO_ZERO;

numero_float_semzero : NUMERO_FLOAT_POSITIVO | NUMERO_FLOAT_NEGATIVO ; // numero float sem o digito zero pode ser um numero decimal positivo que não seja zero ou negativo que nao seja zero

numero_float: numero_float_semzero | numero_zero ;// numero float pode ser um  numero decimal tanto positivo e negativo com ou sem o numero zero

numero_inteiro_positivo: NUMERO_INTEIRO_POSITIVO;

WS: [ \t]+ -> skip ; // Esse token serve para ignorar espaços em branco e tabulações	 
