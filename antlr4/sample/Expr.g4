grammar Expr;
// Tokens (Análise léxica)
Operador_soma: '+';
Operador_subtracao: '-';
Operador_multiplicacao: '*';
Operador_divisao_inteiros: '/';
Operador_resto_divisao: '%';
Operador_potencia: '^';
Operador_divisao_real: '|';
Numero: '-'? Digito+ ('.' Digito+)?;
Parentese_esquerda: '(';
Parentese_direita: ')';
Comando_res: 'RES';
Comando_mem: 'MEM';

fragment Digito: [0-9];

// Regras da gramática
Espaco: [ \t]+ -> skip; // Trata espaços em branco e tabulações

NovaLinha: [\r\n]+ -> skip; // Trata novas linhas

prog: linha+ EOF;

linha: expr  ; 


expr: Numero
     | Numero? Comando_mem
     | Numero?Comando_res
     | expr Comando_mem
     | expr Comando_res
     | Comando_mem expr?
     | Comando_res expr?
     | Parentese_esquerda expr Parentese_direita
     | expr expr operador
     ;
operador: Operador_soma | Operador_subtracao | Operador_multiplicacao | Operador_divisao_inteiros | Operador_resto_divisao | Operador_potencia | Operador_divisao_real;

