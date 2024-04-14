package br.ucsal;
import java.util.Scanner;

public class prat28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int inicial = 10;
		int n = 0;
		int quantidade = 0;
		int soma = 0;
		int media = 0;
		int pares = 0;
		int impares = 0;
		int mediapond = 0;
		int quartovalor = 0;
		int decimovalor = 0;
		final int peso1 = 4;
		final int peso2 = 6;
		
		do{
			System.out.println("Informe o limite da sequência: ");
			n = sc.nextInt();
			}while (n <50 || n>100);
		
		for (int x = 0; x < n; x++) {
			if (inicial <= n) {
				if(inicial%3==0) {
					impares++;
				}
				if(inicial%2==0) {
					pares++;
				}if (inicial >=28) {
					quartovalor = 28;
				}if (inicial >= 64) {
					decimovalor = 64;
				}
				
				System.out.print(inicial + " ");
				inicial = inicial + 6;
				quantidade++;
				soma += inicial;
				mediapond = (quartovalor * peso1 + decimovalor * peso2)/(peso1+peso2);
				
			}
			media = (10 + (inicial - 6))/2;
		}
		
		System.out.print( "\nNúmeros na sequência: " + quantidade);
		System.out.print( "\nSoma: " + soma);
		System.out.print( "\nMédia aritimética: " + media);
		System.out.print( "\nNúmeros pares: " + pares);
		System.out.print( "\nNúmeros impares: " + impares);
		System.out.print( "\nNúmeros impares e divisiveis por 3: " + impares);
		System.out.print( "\nMédia Ponderada: " + mediapond);
		
		
		
	
	}
}

