grammar Expr;

NUMERO_INTEIRO_POSITIVO : [1-9] [0-9]* ;
NUMERO_INTEIRO_NEGATIVO : '-' [1-9] [0-9]* ;
NUMERO_FLOAT_POSITIVO : [1-9] [0-9]* ('.' [0-9]+)? | '0' '.' [0-9]+ ;
NUMERO_FLOAT_NEGATIVO : '-' [1-9] [0-9]* ('.' [0-9]+)? | '-' '0' '.' [0-9]+ ;
NUMERO_ZERO : '0' ;
NOVALINHA: [\r\n]+ ;


prog: (expr NOVALINHA)* EOF ;


expr: '(' numero_inteiro numero_inteiro_semzero '/'  ')'
     | '(' numero_zero numero_zero '/' ')'
     | '(' numero_inteiro numero_inteiro_semzero '|' ')'
     | '(' numero_inteiro numero_float_semzero '|' ')'
     | '(' numero_float numero_inteiro_semzero '|' ')'
     | '(' numero_float numero_float_semzero '|' ')'
     | '(' numero_zero numero_zero '|' ')'
     | '(' numero_inteiro numero_inteiro_semzero '%' ')'
     | '(' numero_zero numero_zero '%' ')'
     | '(' numero_real numero_inteiro_positivo '^' ')'
     | '(' numero_real numero_real '+' ')'
     | '(' numero_real numero_real '-' ')'
     | '(' numero_real numero_real '*' ')' 
     | '(' numero_real numero_real '*' ')'     
     | '(' expr expr operador ')'
     | '(' numero_real expr  operador ')'
     | '(' expr* ')'
     | '(' numero_real 'MEM' ')' 
     | '(' 'MEM' ')'
     | '(' expr 'MEM' ')'
     | '(' 'MEM' expr ')'
     | '(' 'MEM' expr operador ')'
     | '(' numero_real 'MEM' expr operador ')'  
     | '(' numero_inteiro_positivo 'RES' ')'  
     | '(' numero_inteiro_positivo 'RES' expr ')' 
     | '(' expr 'RES' ')'  
     | '(' expr 'RES' expr ')' ;

operador : '+' | '-' | '*' | '/' | '%' | '^' | '|' ;

numero_real: numero_inteiro | numero_float ;

numero_inteiro_semzero : NUMERO_INTEIRO_POSITIVO | NUMERO_INTEIRO_NEGATIVO ;

numero_inteiro: numero_inteiro_semzero | numero_zero ;

numero_zero:NUMERO_ZERO;

numero_float_semzero : NUMERO_FLOAT_POSITIVO | NUMERO_FLOAT_NEGATIVO ;

numero_float: numero_float_semzero | numero_zero ;

numero_inteiro_positivo: NUMERO_INTEIRO_POSITIVO;

WS: [ \t]+ -> skip ;