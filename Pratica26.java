package praticas;

public class Pratica26 {

	public static void main(String[] args) {
		int ano = 1900;
		
		System.out.println("Anos Bissextos");
		
		for (; ano <= 2032; ano++ ) {
			if ((ano %4 == 0 && ano %100 != 0) || ano %400 == 0){
				System.out.print(ano + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Descrescente"); 
		
		do {
			if ((ano %4 == 0 && ano %100 != 0) || ano %400 == 0){
				System.out.print(ano + " ");
		}
			ano--;	
		
		}
		while (ano > 1900);
		
		System.out.println("");
		System.out.println("");
		System.out.println("Crescente"); 
		
		while (ano <= 2032) {
			if ((ano %4 == 0 && ano %100 != 0) || ano %400 == 0) {
				System.out.print(ano + " ");
			}
			ano++;
		}
		
	}

}
