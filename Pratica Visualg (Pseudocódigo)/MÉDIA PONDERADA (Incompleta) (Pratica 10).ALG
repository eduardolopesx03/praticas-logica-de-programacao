Algoritmo "M�dia Ponderada"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/09/2022
Var
valor1: real
valor2: real
resultado: real


Inicio
escreva ("Digite um valor entre 0 e 10: ")
   leia (valor1)
se (valor1 > 10) entao
   escreval ("Valor n�o informado no intervalo solicitado!")
se (valor1 < 0) entao
   escreval ("Valor n�o informado no intervalo solicitado!")
fimse
fimse

escreva ("Digite outro valor entre 0 e 10: ")
   leia(valor2)
se (valor2 > 10) entao
   escreval ("Valor n�o informado no intervalo solicitado!")
se (valor2 < 0) entao
   escreval ("Valor n�o informado no intervalo solicitado!")
fimse
fimse

resultado <- (valor1*4+valor2*6)/(4+6)

se (resultado >= 6) ent�o
   escreval ("Sua m�dia ponderada �:", resultado, ". Voc� foi aprovado!")
sen�o
   escreval ("Sua m�dia ponderada �:", resultado, ". Voc� foi reprovado!")
fimse
fimalgoritmo