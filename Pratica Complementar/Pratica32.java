package faculdade;

public class Pratica32 {

	public static void main(String[] args) {
		System.out.println("Array Bidimensional de uma Sequência");
		Imprimir(ArrayBidimensional(4, 7));

		System.out.println();
		System.out.println("Média Aritmética");
		Imprimir2(MediaAritmetica(ArrayBidimensional(4, 7)));
		
		System.out.println();
		System.out.println("Média Ponderada");
		Imprimir2(MediaPonderada(ArrayBidimensional(4, 7)));
		
		System.out.println();
		System.out.println("Sequência Decrescente");
		Imprimir(ArrayBidimensionalDecrescente(4, 7));
		
		/*
		 * System.out.println(); System.out.println("Sequência Decrescente2");
		 * Imprimir(ArrayBidimensionalDecrescente2(ArrayBidimensional(4, 7), 4, 7));
		 */
		
		

	}
	//Elabore uma solução para preencher dinamicamente um array bidimensional de tamanho 4 x 7 com uma sequência
	//crescente de valores inteiros, pares iniciados por 8. 
	//1. O array deve ser retornado em um método específico, cujo parâmetros serão os valores que irão definir 
	//o seu tamanho.
	public static int[][] ArrayBidimensional (int a, int b){
		int ArrayBidimensional[][] = new int [a][b];
		int valor = 8;
		for (int il = 0; il < ArrayBidimensional.length; il++) {
			for (int ic = 0; ic < ArrayBidimensional[il].length; ic++) {
				ArrayBidimensional[il][ic] = valor;
				valor = valor + 2;		
			}
		}
		return ArrayBidimensional;
	}

	//a)retornar a média aritmética de todos os elementos da sequência
	public static double MediaAritmetica (int[][] vetor) {
		int soma = 0;
		double MediaAritmetica = 0;
		for (int il = 0; il < vetor.length; il++) {
			for (int ic = 0; ic < vetor[il].length; ic++) {
				soma = vetor[il][ic];
				MediaAritmetica = soma / 28;
			}
		}
		return MediaAritmetica;
	}

	//b)retornar a média ponderada do 4º e 7º elementos da sequência formada, considerando os pesos 4 e 6 
	//respectivamente.
	public static double MediaPonderada (int[][] vetor) {
		int Peso1 = 4, Peso2 = 6, QuartoElemento = 14, SetimoElemento = 20;
		double MediaPonderada = 0;
		MediaPonderada = (QuartoElemento * Peso1 + SetimoElemento * Peso2) / (Peso1 + Peso2);
		return MediaPonderada;
	}
	
	//c)retornar a sequência obtida com o array recebido no parâmetro em ordem decrescente
	public static int[][] ArrayBidimensionalDecrescente (int a, int b){
		int ArrayBidimensional[][] = new int [a][b];
		int valor = 62;
		for (int il = 0; il < ArrayBidimensional.length; il++) {
			for (int ic = 0; ic < ArrayBidimensional[il].length; ic++) {
				ArrayBidimensional[il][ic] = valor;
				valor = valor - 2;		
			}
		}
		return ArrayBidimensional;
	}
	
	//c)retornar a sequência obtida com o array recebido no parâmetro em ordem decrescente
	/*
	 * public static int[][] ArrayBidimensionalDecrescente2 (int[][] vetor){ int
	 * valor = 62; int ArrayBidimensionalDecrescente[][] = new int
	 * [vetor.length][vetor[0].length]; for (int il =
	 * ArrayBidimensionalDecrescente.length; il > 0; il--) { for (int ic =
	 * ArrayBidimensionalDecrescente[il].length; ic > 0; ic--) {
	 * ArrayBidimensionalDecrescente[il][ic] = valor; valor = valor - 2; } } return
	 * ArrayBidimensionalDecrescente; }
	 */

	

	//Método para imprimir o array bidimensional
	public static void Imprimir (int[][] vetor) {
		for (int il = 0; il < vetor.length; il++) {
			for (int ic = 0; ic < vetor[il].length; ic++) {
				System.out.print(vetor[il][ic] + " ");
			}
			System.out.println();
		}
	}

	//Método para imprimir um double
	public static void Imprimir2 (double a) {
		System.out.println(a);
	}

}


