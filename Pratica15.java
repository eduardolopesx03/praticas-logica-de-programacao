package praticas;

import java.util.Scanner;

public class Pratica15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String mes;

		System.out.println("Digite um mês: ");
		mes = sc.next();

		switch(mes) {
		case "Janeiro":
		case "Março":
		case "Maio":
		case "Julho":
		case "Agosto":
		case "Outubro":
		case "Dezembro":
			System.out.println("Este mês tem 31 dias!");
			break;
		case "Abril":
		case "Junho":
		case "Setembro":
		case "Novembro":
			System.out.println("Este mês tem 30 dias!");
			break;
		case "Fevereiro":
			System.out.println("Este mês tem 28 ou 29 dias!");
			break;
		default:
			System.out.println("ESSE MÊS NÃO EXISTE!");
		}
	}
}
