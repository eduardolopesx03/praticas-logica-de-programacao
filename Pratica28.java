package praticas;

import java.util.Scanner;

public class Pratica28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int limite, elementos = 0, numerospares = 0, numerosimpares = 0, numeros_impares_divisiveis_por_3 = 0, soma = 0;
		double media_aritmetica, media_ponderada;
		int pa = 10;

		System.out.println("Informe o limite da Progressão Aritmética (um número entre 50 a 100): ");
		limite = sc.nextInt();

		//VALIDAÇÃO
		while(limite < 50 || limite > 100) {
			System.out.println("\nVocê digitou um limite (número) fora do intervalo solicitado!!");

			System.out.println("\nInforme o limite da Progressão Aritmética (um número entre 50 a 100): ");
			limite = sc.nextInt();
		}

		//a)Apresente a sequência formada
		System.out.print("\nSequência formada (Progressão Aritmética): ");
		while (pa <= limite) {
			System.out.print(pa + " ");
			soma = soma + pa;
			pa = pa + 6;
			elementos++;
			if (pa %2 == 0) {
				numerospares++;
			}
			else {
				numerosimpares++;
			}
			if(pa %2 != 0 && pa %3 == 0) {
				numeros_impares_divisiveis_por_3++;
			}
		}


		//b)Calcule a quantidade de elementos da sequência
		System.out.println("\n\nQuantidade de elementos da sequência: " + elementos);


		//c)Calcule a média aritmética do primeiro e último valor da sequência.
		media_aritmetica = (10 + (pa - 6)) / 2; //mesmo não imprimindo o último valor da "pa", ela ficará acima do limite estabelecido
		//(+6) e para solucionar isso é só subtrair -6.
		System.out.println("\nA média aritmética do primeiro e último valor da sequencia é: " + media_aritmetica);


		//d)Identifique a quantidade de números pares existentes na sequência
		System.out.println("\nA quantidade de números pares existentes na sequência é: " + numerospares);


		//e)Identifique a quantidade de números ímpares existentes na sequência
		System.out.println("\nA quantidade de números ímpares existentes na sequencia é: " + numerosimpares);


		//f)Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequência
		System.out.println("\nA quantidade de números ímpares divisíveis por 3 existentes na sequência é: " + numeros_impares_divisiveis_por_3++);


		//g)Calcule a soma de todos os elementos da sequência
		System.out.println("\nA soma de todos os elementos da sequência é: " + soma);


		//h) Calcule a média ponderada do 4º e do 10º número da sequência, considerando os pesos 4 e 6 respectivamente, quando for possível.
		if ((pa - 6) >= 64) {
			media_ponderada = (10 * 4 + 64 * 6) / (4 + 6);
			System.out.println("\nA média ponderada do 4º e do 10º número da sequência, considerando os pesos 4 e 6 é respectivamente: " + media_ponderada);
		}
		else {
			System.out.println("\nNão foi possível efetuar a média ponderada, pois não existe um dos (os) valores necessários para se fazer!!");
		}

	}

}
