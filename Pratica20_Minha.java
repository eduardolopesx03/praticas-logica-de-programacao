package praticas;

public class Pratica20_Minha {

	public static void main(String[] args) {

		int valor = 1;
		
		
		while (valor >= 1 && valor <= 100) {
			valor = valor + 1;
			if (valor %3 == 0 && valor %5 == 0) {
				System.out.println(valor);
			}
		}

	}

}