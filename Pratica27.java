package praticas;

public class Pratica27 {

	public static void main(String[] args) {
		int inicio = 10, razao = 3, aux = 0;
		
		System.out.println("Progressão Geométrica");
		
		for (; aux < 10; aux++) {
			System.out.print(inicio + " ");
			inicio = inicio * razao;
		}
		inicio++;
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Descrescente");
		
		do {
			inicio = inicio / razao;
			System.out.print(inicio + " " );
		}
		while(inicio > 10);
		
		System.out.println("");
		System.out.println("");
		System.out.println("Crescente");
		
		while(inicio <= 196830) {
			System.out.print(inicio + " ");
			inicio = inicio * razao;
		}
		inicio++;
		
		
		
		

	}

}
