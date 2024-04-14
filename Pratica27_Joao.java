package praticas;

public class Pratica27_Joao {

	public static void main(String[] args) {
		int inicial = 10;

		for (int x = 0; x < 10; x++) {
			System.out.print(inicial + " ");
			inicial = inicial * 3;
		}
		
		inicial = inicial/3;
		System.out.println();
		do {
			System.out.print(inicial + " ");
			inicial = inicial / 3;

		}while(inicial >= 9);
		
		System.out.println();
		int cont = 0;
		inicial = 10;
		while (cont <= 9) {
			System.out.print(inicial + " ");
			inicial = inicial * 3;
			cont++;
			
		
		}

	}

}



