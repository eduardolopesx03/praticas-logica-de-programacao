package praticas;

import java.util.Scanner;

public class Pratica18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double valor1;
		double valor2;
		int peso1 = 4;
		int peso2 = 6;
		int media;

		System.out.println("Digite um valor: ");
		valor1 = sc.nextInt();
		if (valor1 >= 0 && valor1 <= 10) {
			System.out.println("Digite outro valor: ");
			valor2 = sc.nextInt();
			if (valor2 >= 0 && valor2 <= 10) {
				System.out.println("Qual o tipo de média você vai querer usar?\n"
						+ "Digite (1) para Média Aritmética\n"
						+ "Digite (2) para Média Ponderada");
				media = sc.nextInt();
				switch(media) {
				case 1:
					System.out.println("A média aritmética é: " + ((valor1 + valor2) / 2));
					break;
				case 2:
					System.out.println("A média ponderada é: " + ((valor1 * peso1 + valor2 * peso2) / (peso1 + peso2)));
					break;
				default:
					System.out.println("Tipo de média não encontrada!");
				}	

			}
			else {
				System.out.println("VALOR INFORMADO FORA DO INTERVALO VÁLIDO!");
			}
		}
		else {
			System.out.println("VALOR INFORMADO FORA DO INTERVALO VÁLIDO!"); 
		}

	}

}
