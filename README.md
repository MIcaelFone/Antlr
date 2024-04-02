# Construção de Interpretadores - Projeto Avaliativo RA1

Este repositório contém os códigos desenvolvidos pelo grupo composto por Bruno Feliciano, Micael Fone, Pedro Nazario e Thiago Rosa, como parte do projeto avaliativo RA1 da disciplina "Construção de Interpretadores".

## Descrição

O objetivo deste projeto foi criar analisadores léxicos e sintáticos para uma calculadora utilizando a ferramenta Antlr. Os analisadores são capazes de interpretar expressões matemáticas conforme definido na gramática desenvolvida.

## Estrutura do Repositório

- **lib**: Contém o arquivo JAR com os binários do Antlr.
- **bin**: Contém os scripts shell utilizados para trabalhar com o Antlr, incluindo `antlr4.bat`, `compile.bat` e `grun.bat`.
- **sample**: Contém a gramática desenvolvida e os arquivos de teste para a calculadora.

## Utilização

Para utilizar os códigos neste repositório, siga os passos abaixo:

1. Configure as variáveis de ambiente necessárias para o Antlr.
2. Compile a gramática utilizando o script `antlr4.bat`.
3. Compile os arquivos gerados e as classes Java necessárias utilizando o script `compile.bat`.
4. Execute os testes utilizando o comando `type arquivo_de_calculo.txt | grun Expr prog -gui`.

## Disciplina

Este projeto foi desenvolvido como parte da disciplina "Construção de Interpretadores", como projeto avaliativo RA1, correspondendo a 60% da nota da referida avaliação.

