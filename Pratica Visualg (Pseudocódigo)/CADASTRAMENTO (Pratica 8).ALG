Algoritmo "Cadastramento"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 31/08/2022
Var
nome: caractere
rua: caractere
numero: inteiro
bairro: caractere
cep: caractere
cidade: caractere
estado: caractere
Inicio

escreva ("Digite o seu nome: ")
   leia (nome)
   
escreva ("escreva o seu endere�o, come�ando pela rua: ")
   leia (rua)

escreva ("N�mero: ")
   leia (numero)

escreva ("Bairro: ")
   leia (bairro)

escreva ("Cep: ")
   leia (cep)

escreva ("Cidade: ")
   leia (cidade)
se (cidade = "Salvador") ent�o
   escreval ("(Cidade Modelo)")
      fimse

escreva ("Estado: ")
   leia (estado)

escreval (nome, ", seu endere�o completo �: ")
escreval ("Rua: ", rua)
escreval ("N�mero: ", numero)
escreval ("Bairro: ", bairro)
escreval ("Cep: ", cep)
escreval ("Cidade: ", cidade)
escreval ("Estado: ", estado)
Fimalgoritmo
