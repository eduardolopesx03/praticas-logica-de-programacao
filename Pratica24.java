package praticas;

public class Pratica24 {

	public static void main(String[] args) {
		
		int valor1 = 0, valor2 = 1;
		
		do {
			valor1 = valor1 + valor2;
			valor2 = valor1 - valor2;
			System.out.print(valor2 + " ");
		}
		while (valor1 <= 5000);
		
		
		
		
		
		

	}

}
