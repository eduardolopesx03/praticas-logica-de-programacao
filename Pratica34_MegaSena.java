package praticas;

import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

public class Pratica34_MegaSena {

	public static void main(String[] args) {
		ImprimirCartela(Cartela());

		ImprimirNumerosEscolhidos(EscolherNumeros());

		ImprimirNumerosAleatorios(NumerosAleatorios());

		Comparacao(EscolherNumeros(), NumerosAleatorios());
	}

	//Método para fazer a cartela do jogo mega-sena
	public static int[][] Cartela () {
		int ArrayBidimensional[][] = new int [6][10];
		int valor = 1;
		for (int il = 0; il < ArrayBidimensional.length; il++) {
			for (int ic = 0; ic < ArrayBidimensional[il].length; ic++) {
				ArrayBidimensional[il][ic] = valor;
				valor += 1;
			}
		}
		return ArrayBidimensional;
	}

	//Método que o usuário irá escolher o número que irá efetuar a sua jogada.
	public static int[] EscolherNumeros () {
		Scanner sc = new Scanner (System.in);
		int NumerosEscolhidos[] = new int [6];

		System.out.println("\nQuais números você irá jogar?");
		for (int i = 0; i < NumerosEscolhidos.length; i++) {
			NumerosEscolhidos[i] = sc.nextInt();
		}
		return NumerosEscolhidos;
	}

	//Método para gerar os números aleatórios.
	public static int[] NumerosAleatorios () {
		Random NumerosAleatorios = new Random();
		int Numeros[] = new int [6];
		for (int i = 0; i < Numeros.length; i++) {
			Numeros[i] = NumerosAleatorios.nextInt(60);
		}
		return Numeros;
	}

	//Método para comparar os números escolhidos pelo usuário com os números aleatórios gerados e falar se o usuário ganhou ou não o jogo.
	public static void Comparacao (int EscolherNumeros[], int NumerosAleatorios[]) {	
		if (Arrays.equals(EscolherNumeros, NumerosAleatorios)) {
			System.out.println("Parabéns, você ganhou o jogo da Mega-Sena!");
		}
		else {
			System.out.println("Infelizmente você perdeu!");
		}
	}

	//Método para imprimir a cartela.
	public static void ImprimirCartela (int ArrayBidimensional[][]) {
		System.out.println("Cartela do Jogo da Mega-Sena");
		for (int il = 0; il < ArrayBidimensional.length; il++) {
			for (int ic = 0; ic < ArrayBidimensional[il].length; ic++) {
				if (ArrayBidimensional[il][ic] < 10) {
					System.out.print("0");
				}
				System.out.print(ArrayBidimensional[il][ic] + " ");
			}
			System.out.println("");
		}
	}

	//Método para imprimir os números escolhidos pelo usuário.
	public static void ImprimirNumerosEscolhidos (int vetor[]) {
		System.out.print("\nVocê escolheu os números: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	//Método para imprimir os números aleatórios.
	public static void ImprimirNumerosAleatorios (int vetor[]) {
		System.out.print("\n\nOs números sorteados foram: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
