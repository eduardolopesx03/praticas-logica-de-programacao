package praticas;

import java.util.Scanner;

public class Pratica14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int DiaDaSemana;

		System.out.println("Digite um número entre 1 a 7 para saber o dia da semana: ");
		DiaDaSemana = sc.nextInt();

		switch(DiaDaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("ESSE DIA NÃO EXISTE!!");
			break;
		}
	}

}
