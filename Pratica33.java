package praticas;

public class Pratica33 {

	public static void main(String[] args) {
		Imprimir(ArrayString(ArrayBidimensional()));
	}
	
	//Elabore uma solução para que um método retorne um array bidimensional com tamanho 5x8 que deverá ser preenchido com valores inteiros 
	//formando uma sequencia Fibonacci iniciada com 0 e 1.
	public static int[][] ArrayBidimensional () {
		int ArrayBidimensional[][] = new int [5][8];
		int valor1 = 0, valor2 = 1;
		for (int il = 0; il < ArrayBidimensional.length; il++) {
			for (int ic = 0; ic < ArrayBidimensional[il].length; ic++) {
				ArrayBidimensional[il][ic] = valor1;
				valor1 = valor1 + valor2;
				valor2 = valor1 - valor2;
			}
		}
		return ArrayBidimensional;
	}
	
	//O array retornado deverá ser passado como parâmetro para um outro método que deverá retornar um novo array do tipo String contendo 
	//os mesmos valores do array recebido no parâmetro, porém preenchidos com zeros a esquerda de forma que todos os elementos tenham uma 
	//quantidade padronizada de 9 unidades. Ex: 000000000, 000000001, 000000001 até 102334155.
	public static String[][] ArrayString (int ArrayBidimensional[][]){
		String ArrayString[][] = new String [ArrayBidimensional.length][ArrayBidimensional[0].length];
		for (int il = 0; il < ArrayBidimensional.length; il++) {
			for (int ic = 0; ic < ArrayBidimensional[il].length; ic++) {
				if (ArrayBidimensional[il][ic] <= 10) {
					ArrayString[il][ic] = "00000000";
				}
				else if (ArrayBidimensional[il][ic] <= 100) {
					ArrayString[il][ic] = "0000000";
				}	
				else if (ArrayBidimensional[il][ic] <= 1000) {
					ArrayString[il][ic] = "000000";
				}
				else if (ArrayBidimensional[il][ic] <= 10000) {
					ArrayString[il][ic] = "00000";
				}
				else if (ArrayBidimensional[il][ic] <= 100000) {
					ArrayString[il][ic] = "0000";
				}
				else if (ArrayBidimensional[il][ic] <= 1000000) {
					ArrayString[il][ic] = "000";
				}	
				else if (ArrayBidimensional[il][ic] <= 10000000) {
					ArrayString[il][ic] = "00";
				}
				else if (ArrayBidimensional[il][ic] < 100000000) {
					ArrayString[il][ic] = "0";
				}
				else if (ArrayBidimensional[il][ic] >= 100000000) {
					ArrayString[il][ic] = "";
				}
				ArrayString[il][ic] +=  ArrayBidimensional[il][ic];
			}
		}
		return ArrayString;
	}

	//Método de impressão
	public static void Imprimir (String[][] ArrayString) {
		for (int il = 0; il < ArrayString.length; il++) {
			for (int ic = 0; ic < ArrayString[il].length; ic++) {
				System.out.print(ArrayString[il][ic] + " ");
			}
			System.out.println();
		}
	}

}


