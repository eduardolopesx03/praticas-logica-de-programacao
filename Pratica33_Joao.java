package praticas;

public class Pratica33_Joao {

	public static void main(String[] args) {
			imprimir(construirtabela(5,8));

	}

	public static int[][] construirtabela (int l, int c){

		int [][] tabelafibo = new int [l][c];
		int v1 = 0, v2 = 1;

		for(int il = 0; il<tabelafibo.length -1 ;il++) {
			for(int ic = 0; ic <tabelafibo[il].length -1 ;ic++) {
				tabelafibo[il][ic] = v1;
				v1 = v2 + v1;
				v2 = v1 - v2;
			}	
		}
		return tabelafibo;
	}

	public static void imprimir (int [][] tabela ) {
		//impressão da tabela.
		for (int il = 0; il < tabela.length - 1; il++) {
			for (int ic = 0; ic <  tabela[il].length - 1; ic++) {
				
				if(tabela[il][ic] <= 10)
					System.out.print("00000000");
				else if( tabela[il][ic] <= 100)
					System.out.print("0000000");
				else if( tabela[il][ic] <= 1000)
					System.out.print("000000");
				else if( tabela[il][ic] <= 10000)
					System.out.print("00000");
				else if( tabela[il][ic] <= 100000)
					System.out.print("0000");
				else if( tabela[il][ic] <= 1000000)
					System.out.print("000");
				else if( tabela[il][ic] <= 10000000)
					System.out.print("00");
				else if( tabela[il][ic] <= 100000000)
					System.out.print("0");
				else if( tabela[il][ic] <= 100000000)
					System.out.print("");
				else if( tabela[il][ic] < 0)
					System.out.print("");
			
				System.out.print( tabela[il][ic]+ " ");
			}
			System.out.println();
		}
	}
}

