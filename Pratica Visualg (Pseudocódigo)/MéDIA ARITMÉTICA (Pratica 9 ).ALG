Algoritmo "M�dia Aritm�tica"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/09/2022
Var
valor1: real
valor2: real
valor3: real
resultado: real


Inicio
escreva ("Digite o primeiro valor: ")
   leia (valor1)

escreva ("Digite o segundo valor: ")
   leia (valor2)
   
escreva ("Digite o terceiro valor: ")
   leia (valor3)

resultado <- (valor1 + valor2 + valor3)/3
se resultado >= 6 ent�o
   escreval ("A sua m�dia �:", resultado, ". Voc� est� Aprovado!")
senao
   escreval ("A sua m�dia �:", resultado, ". Voc� est� Reprovado!")
      fimse
      
Fimalgoritmo