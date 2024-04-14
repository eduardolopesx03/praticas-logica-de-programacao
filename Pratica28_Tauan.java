package praticas;

import java.util.Scanner;

public class Pratica28_Tauan {

	public static void main(String[] args) {
		int v1 = 10, r = 6, aux = 0, pares = 0, impares = 0, div3 = 0, soma = 0;
		int lim, maior, menor;
		int v4 = 0, v10 = 0;
		int peso1 = 4, peso2 = 10;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Informe o limite da sequência:");
			lim = sc.nextInt();

		}while(lim < 50 || lim > 100);
		int x = 0;
		maior = v1;
		menor = v1;
		for(; v1 <= (100 - r) ;) {
			// x++ é só pra fins de consulta
			System.out.print(v1 + " ");
			if(v1 > maior) {
				maior = v1;
			}
			if(v1 > menor) {
				menor = menor;
			}
			if(v1 %2 == 0) {
				pares++;
			}else {
				impares++;
				if(v1 %3 == 0) {
					div3++;
				}
			}
			if(x == 4) {
				v4 = v1;
			}
			if(x == 10) {
				v10 = v1;
			}
			soma = soma + v1;

			v1 = v1 + r;
			x++;

		}
		int MP = (((v4*peso1)+(v10*peso2)))/(peso1+peso2);
		int MA = ((maior+menor)/2);
		System.out.println();
		System.out.println("Média Aritmética: " + MA);		
		System.out.println("Quantidade de elementos: " + x + " ");
		System.out.println("Números pares na sequencia: " + pares);
		System.out.println("Números impares na sequencia: " + impares);
		System.out.println("Números ímpares divisíveis por 3: " + div3);
		System.out.println("Soma de todos os elementos: " + soma);
		System.out.println("Média ponderada: " + MP);

	}

}
