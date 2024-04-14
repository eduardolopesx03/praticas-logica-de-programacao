package br.ucsal;
import java.util.Scanner;

public class pratica32 {




	public static void main(String[] args) {

		System.out.println("tabela fibonacci:");
		imprimir(tabelafibo(4,7));
		System.out.println("Média aritimética dos elementos:");
		media(tabelafibo(4,7));
		System.out.println("Média ponderada dos termos 4 e 7 da tabela:");
		mediapond(tabelafibo(4,7));
		System.out.println("Vetor reverso:");
		imprimir(arrayreverso(tabelafibo(4,7)));
	}

	public static void imprimir (int[][] tabela) {
		//impressão do vetor como uma tabela
		for (int il = 0; il < tabela.length; il++) {
			for (int ic = 0; ic < tabela[il].length; ic++) {
				//tentativa de organizar a tabela
				if(tabela[il][ic] < 10)
					System.out.print(" ");
				if(tabela[il][ic] < 100)
					System.out.print(" ");
				System.out.print(tabela[il][ic]+ " ");
			}
			System.out.println();
		}
	} 

	public static int[][] tabelafibo(int l, int c){

		int[][] tabelafibo = new int[l][c];

		int inicial=8;

		for (int il = 0; il < tabelafibo.length; il++) {
			for (int ic = 0; ic < tabelafibo[il].length;) {
				if(inicial%2==0) {
					tabelafibo[il][ic] = inicial;
					//o incremeto precisa ficar aqui para evitar zeros entre os elementos.	
					ic++;
				}	
				inicial++;
			}
		}
		return tabelafibo;
	}

	public static void media(int[][]tabelafibo) {

		double media = 0,soma = 0,quantidade=0;

		for (int il = 0; il < tabelafibo.length; il++) {
			for (int ic = 0; ic < tabelafibo[il].length; ic++) {

				soma+=tabelafibo[il][ic];
				quantidade++;
			}
		}
		media = soma/quantidade;
		System.out.println(media);

	}
	public static void mediapond(int[][]tabelafibo) {
		double quartoValor = 0,setimoValor = 0,cont=0,mediaPonderada=0;
		final int PESO1 =4,PESO2=6;

		for (int il = 0; il < tabelafibo.length; il++) {
			for (int ic = 0; ic < tabelafibo[il].length; ic++) {
				if(cont == 4) {
					quartoValor = tabelafibo[il][ic];
				}if(cont == 7) {
					setimoValor = tabelafibo[il][ic];
				}
				cont++;
			}
		}
		System.out.println(mediaPonderada =(quartoValor*PESO1+setimoValor*PESO2)/PESO1+PESO2);


		//		double mediapond=0;
		//		final double PESO1 =4,PESO2=7;
		//		mediapond = (tabelafibo[0][3]*PESO1+tabelafibo[0][6]*PESO2)/PESO1+PESO2;
		//		System.out.println(mediapond);
	}

	public static int[][] arrayreverso(int[][] tabelafibo){

		int[][] tabelareversa = new int[tabelafibo.length][tabelafibo[0].length];

		for (int il = 0,ilr =tabelareversa.length-1;il <tabelareversa.length; il++,ilr--) {
			for (int ic = 0,icr =tabelareversa[0].length-1;ic <tabelareversa[il].length;ic++,icr--) {
				tabelareversa[il][ic] = tabelafibo[ilr][icr];
			}
		}
		return tabelareversa;
	}
}




