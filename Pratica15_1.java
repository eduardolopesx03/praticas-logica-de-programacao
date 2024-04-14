package praticas;

import java.util.Scanner;

public class Pratica15_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int mes;

		System.out.println("Digite um número que corresponde a seu respectivo mês: ");
		mes = sc.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Janeiro. Este mês tem 31 dias!");
			break;
		case 2:
			System.out.println("Fevereiro. Este mês tem 28 ou 29 dias!");
			break;
		case 3:
			System.out.println("Março. Este mês tem 31 dias!");
			break;
		case 4:
			System.out.println("Abril. Este mês tem 30 dias!");
			break;
		case 5:
			System.out.println("Maio. Este mês tem 31 dias!");
			break;
		case 6:
			System.out.println("Junho. Este mês tem 30 dias!");
			break;
		case 7:
			System.out.println("Julho. Este mês tem 31 dias!");
			break;
		case 8:
			System.out.println("Agosto. Este mês tem 31 dias!");
			break;
		case 9:
			System.out.println("Setembro. Este mês tem 30 dias!");
			break;
		case 10:
			System.out.println("Outubro. Este mês tem 31 dias!");
			break;
		case 11:
			System.out.println("Novembro. Este mês tem 30 dias!");
			break;
		case 12:
			System.out.println("Dezembro. Este mês tem 31 dias!");
			break;
		default:
			System.out.println("ESSE MÊS NÃO EXISTE!");
			break;
		}
	}
}