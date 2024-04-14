package praticas;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float valor1;
		float valor2;
		float peso1 = 4;
		float peso2 = 6;
		float resultado;




		System.out.println("Digite um valor entre 0 e 10: ");
		valor1 = sc.nextFloat();
		while (valor1 > 10 || valor1 < 0) {
			System.out.println("Valor não informado no intervalo solicitado!");
			valor1 = sc.nextFloat();
		}




		System.out.println("Digite outro valor entre 0 e 10: ");
		valor2 = sc.nextFloat();
		while (valor2 > 10 || valor1 < 0) {
			System.out.println("Valor não informado no intervalo solicitado!");
			valor2 = sc.nextFloat();
		}





		resultado = (valor1*peso1 + valor2*peso2) / (peso1 + peso2);



		if (resultado >= 6) {
			System.out.println("Você foi aprovado!");
		}

		else {
			System.out.println("Você foi reprovado!");    
		}







	}


}
