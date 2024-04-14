package praticas;

import java.util.Scanner;

import java.util.Random;

import java.util.Arrays;

public class Pratica34_Joao {

	public static void main(String[] args) {
		System.out.println("Escolha 06 dezenas:");
		imprimir(cartela());
		comparar();
	
	}
	public static int[][] cartela () {

		int[][] cartela = new int [7][11];
		int v1 = 1;
		for (int il = 0; il < cartela.length -1 ; il++) {
			for (int ic = 0; ic <cartela[il].length -1; ic++) {
				cartela[il][ic] = v1;
				v1++;	
			}	
		}
		return cartela;
	}
	public static void imprimir (int [][] vetor) {
		for (int il = 0; il < vetor.length-1; il++) {
			for (int ic = 0; ic < vetor[il].length -1; ic++) {
				if(vetor[il][ic]<10)
					System.out.print("0");
				System.out.print(vetor[il][ic]+ " ");
			}
			System.out.println();
		}
	}
	
public static void imprimir (int [] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}

	}
	// método que permite ao usuário escolher suas dezenas
public static int[] escolherdezenas() {

		Scanner sc = new Scanner (System.in);
		System.out.println("Escolha suas dezenas: ");
		int [] dezenasescolhidas = new int [6];
		for(int i = 0; i < dezenasescolhidas.length;i++) {
			dezenasescolhidas[i] = sc.nextInt();
		}
		
		return dezenasescolhidas;
	}
	//método para gerar os resultados
public static int [] resultado() {
Random rand = new Random();


		int [] resultados = new int [6];
		for(int i = 0; i < resultados.length;i++) {
			resultados[i] = rand.nextInt(61);
		}
		return resultados;
	}
//	Nesse método precisei colocar algumas impressões para resumir no método main e evitar erros . Esse método aqui
//	chama o método para escolher as dezenas e o método que gera o resultado aleatório. Em seguida comparar os dois
	public static void comparar() {
		int [] a = escolherdezenas();
		int [] b = resultado();
		System.out.println("Dezenas escolhidas");
		imprimir(a);
		System.out.println("\nResultado:");
		imprimir(b);
		if(Arrays.equals(a, b)) {
			System.out.println("Parabéns, você ganhou!");
		}else {
			System.out.println("\nPerdeu, tente novamente !");
		}
	}

}
