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
PontoEVirgula: ';';

fragment Digito: [0-9];


// Regras da gramática
Espaco: [ \t]+ -> skip; // Trata espaços em branco e tabulações
NovaLinha: [\r\n]+ -> skip; // Trata novas linhas

// Regras da gramática
prog: expr+ EOF;


expr: termo
    | Parentese_esquerda expr expr operador Parentese_direita;

termo: fator
     | Parentese_esquerda termo termo operador Parentese_direita;

fator: numero;

numero: Numero;

operador: Operador_soma | Operador_subtracao | Operador_multiplicacao | Operador_divisao_inteiros | Operador_resto_divisao | Operador_potencia | Operador_divisao_real;
