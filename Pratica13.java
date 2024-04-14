package praticas;

import java.util.Scanner;

public class Pratica13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);


		double valor1;
		double valor2;
		int operacao;

		
		System.out.println("Digite um valor: ");
		valor1 = sc.nextDouble();

		
		if (valor1 >= 0 && valor1 <= 10) {
			System.out.println("Digite outro valor: ");
			valor2 = sc.nextDouble();
			if (valor2 >= 0 && valor2 <= 10) {
				System.out.println("Qual operação você quer fazer? \n"
						+ "Digite (1) para SOMA\n"
						+ "Digite (2) para SUBTRAÇÃO\n"
						+ "Digite (3) para MULTIPLICAÇÃO\n"
						+ "Digite (4) para DIVISÃO");
				operacao = sc.nextInt();
				if (operacao == 1) {
					System.out.println("A soma é: " + (valor1 + valor2));
				}
				else if (operacao == 2) {
					System.out.println("A subtração é: "+ (valor1 - valor2));
				}
				else if (operacao == 3) {
					System.out.println("A multiplicação é: "+ (valor1 * valor2));
				}
				else if (operacao == 4) {
					System.out.println("A divisão é: "+ (valor1 / valor2));
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
