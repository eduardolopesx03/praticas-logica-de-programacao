package praticas;

public class Pratica22 {

	public static void main(String[] args) {

		int valor = 101;
		
		while (valor >= 15 && valor <= 101) {
			valor = valor - 2;
			if (valor %3 == 0) {
				System.out.print(valor + " ");
			}
		}

	}

}