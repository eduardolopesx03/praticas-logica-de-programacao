package praticas;

public class Pratica22_Professor {

	public static void main(String[] args) {
		int valor = 99;

		while (valor > 9 && valor <= 99) {
			valor = valor - 2;
			if (valor %3 == 0) {
				System.out.print(valor + " ");
			}
		}
	}
}
