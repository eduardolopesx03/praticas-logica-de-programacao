package praticas;

public class Pratica31 {

	public static void main(String[] args) {
		System.out.println("Array Bidimensional contendo Fibonacci");
		Imprimir(ArrayBidimensionalFibonacci(4, 5));
	}
	
	//Crie um método para retornar um array bidimensional de tamanho 4 x 5 contendo uma sequencia fibonacci.
	public static int[][] ArrayBidimensionalFibonacci (int a, int b){
		int valor1 = 0, valor2 = 1;
		int Fibonacci[][] = new int[a][b];
		for (int il = 0; il < Fibonacci.length; il++) {
			for (int ic = 0; ic < Fibonacci[il].length; ic++) {
				Fibonacci[il][ic] = valor1;
				valor1 = valor1 + valor2;
				valor2 = valor1 - valor2;
			}
		}
		return Fibonacci;
	}
	
	//Método de impressão de um array bidimensional.
	public static void Imprimir (int[][] vetor) {
		for (int il = 0; il < vetor.length; il++) {
			for (int ic = 0; ic < vetor[il].length; ic++) {
				System.out.print(vetor[il][ic] + " ");
			}
			System.out.println();
		}
	}
	
	
	//Observações para o método de imprimir
	//Neste caso, por ser array bidimensional, vai ser necessário a utilização de dois loop for, o primeiro
	//para linha (il = índice linha) e dentro desse loop um outro loop for para coluna (ic = índice coluna).
	
	//o último "System.out.println();" dentro do loop for índice linha (il) e fora do loop for índice
	//coluna (ic) serve para assim que ele chegar no limite estabelecido pelo tamanho da quantidade de li-
	//nhas fazer uma quebra. Aassim pritando todos os elementos corretamente nas suas devidas linhas e
	//colunas estabelecidas anterioremente.	

}
