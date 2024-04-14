package praticas;

import java.util.Scanner;

public class Pratica17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String resposta;

		System.out.println("Questão 01: Indique, entre as opções abaixo, o animal invertebrado:\n"
				+ "(a) lesmas\n"
				+ "(b) ostras\n"
				+ "(c) cachorro\n"
				+ "(d) gato");
		resposta = sc.next();

		switch (resposta) {
		case "a":
			System.out.println("Alternativa correta!");
			System.out.println("Pontuação: máxima");
			break;
		case "b":
			System.out.println("Alternativa correta!");
			System.out.println("Pontuação: máxima");
			break;
		case "c":
			System.out.println("Alternativa errada!");
			System.out.println("Pontuação: zero");
			break;
		case "d":
			System.out.println("Alternativa errada!");
			System.out.println("Pontuação: zero");
			break;
		default:
			System.out.println("Aternativa não existe!");
		}

	}

}
