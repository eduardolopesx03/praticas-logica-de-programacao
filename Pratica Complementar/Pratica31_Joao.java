package br.ucsal;

public class pratica311 {

	public static void main(String[] args) {

		imprimir(vetorfibo());
	}
	public static void imprimir (int[][] vetor) {
		//impressão do vetor como uma tabela
		for (int il = 0; il < vetor.length; il++) {
			for (int ic = 0; ic < vetor[il].length; ic++) {
			//tentativa de organizar a tabela
			if(vetor[il][ic] < 10)
					System.out.print(" ");
				if(vetor[il][ic] < 100)
					System.out.print(" ");
				System.out.print(vetor[il][ic]+ " ");
			}
			System.out.println();
		}
	} 

	public static int[][] vetorfibo(){

		int[][] vetorfibo = new int[4][5];
		//variáveis para fibonacci
		int v1=0,v2=1;
		for (int il = 0; il < vetorfibo.length; il++) {
			for (int ic = 0; ic < vetorfibo[il].length; ic++) {
				vetorfibo[il][ic] = v1;
				v1 = v1 + v2;
				v2 = v1 - v2;
			}
		}
		return vetorfibo;
	}
}



