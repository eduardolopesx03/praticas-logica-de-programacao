package praticas;

import java.util.Scanner;

public class Pratica12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); //serve para atribuir um valor para a variável através da resposta do print.    


		//variáveis
		int valor1;
		int valor2;
		int valor3;
		double media;

		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();


		//vai servir para as decisões, no caso os valores atribuidos a variável não podem ser menor que 0 e maior que 10.
		if (valor1 >=0 && valor1 <= 10) {
			System.out.println("Digite o segundo valor: ");
			valor2 = sc.nextInt();
			if (valor2 >= 0 && valor2 <= 10) {
				System.out.println("Digite o terceiro valor:" );
				valor3 = sc.nextInt();
				if (valor3 >= 0 && valor3 <= 10) {
					media = (valor1 + valor2 + valor3) / 3;
					if (media >= 6) {
						System.out.println("APROVADO!");
					}
					else {
						System.out.println("REPROVADO!");
					}
				}
				else {
					System.out.println("VALOR FORA DO INTERVALO!");
				}
			}
			else {
				System.out.println("VALOR FORA DO INTERVALO!");
			}

		}
		else {
			System.out.println("VALOR FORA DO INTERVALO!");
		}

	}

}
