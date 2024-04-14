package praticas;

import java.util.Scanner;

public class Pratica16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double valor1;
		double valor2;
		int operacao;

		System.out.println("Digite um valor: ");
		valor1 = sc.nextInt();
		if (valor1 >= 1 && valor1 <= 100) {
			System.out.println("Digite outro valor: ");
			valor2 = sc.nextInt();
			if (valor2 >= 1 && valor2 <= 100) {
				System.out.println("Qual operacão você vai utilizar?\n"
						+ "Digite (1) para SOMAR\n"
						+ "Digite (2) para SUBTRAÇÃO\n"
						+ "Digite (3) para MULTIPLICAÇÃO\n"
						+ "Digite (4) para DIVISÃO");
				operacao = sc.nextInt();
				switch(operacao) {
				case 1:
					System.out.println("A soma dos valores é: " + (valor1 + valor2));
					break;
				case 2:
					System.out.println("A subtração dos valores é: " + (valor1 - valor2));
					break;
				case 3:
					System.out.println("A multiplicação dos valores é: " + (valor1 * valor2));
					break;
				case 4:
					System.out.println("A divisão dos valores é: " + (valor1 / valor2));
					break;
				default:
					System.out.println("Operação inválida!");
				}
			}
			else {
				System.out.println("Valor digitado fora do intervalo!");
			}
		}
		else {
			System.out.println("Valor digitado fora do intervalo!");
		}

	}

}
