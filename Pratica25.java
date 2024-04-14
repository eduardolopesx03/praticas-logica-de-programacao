package praticas;

public class Pratica25 {

	public static void main(String[] args) {
		
		for (int valor1 = 0, valor2 = 1, aux = 0; aux < 20 ; aux++) {
			valor1 = valor1 + valor2;
			valor2 = valor1 - valor2;
			System.out.print(valor2 + " ");
		}
		
	}

}
