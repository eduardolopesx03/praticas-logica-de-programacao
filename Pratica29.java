package praticas;

//1. Crie uma classe com nome Sequencias
public class Pratica29 {

	
	//3. No método "main" execute o método 01 e use o resultado obtido como parâmetro para 
	//executar o método 02. Em seguida execute o método 03 e use o resultado obtido como parâmetro 
	//para executar o método 02.
	public static void main(String[] args) {
		System.out.println("Fibonacci");
		imprimir(fibonacci());
		
		System.out.println("");
		
		System.out.println("Progressão Geométrica");
		imprimir(PG());
	}

	
	//* Método 01: Criar, preencher e retornar um vetor com uma sequência Fibonacci de 20 elementos.
	public static int[] fibonacci () {
		int num1 = 0; int num2 = 1;
		int[] fibonacciVetor = new int [20];
		for (int i = 0; i < fibonacciVetor.length; i++) {
			fibonacciVetor[i] = num1;
			 num1 = num1 + num2;
			 num2 = num1 - num2;
		}
		return fibonacciVetor;
	}
	//Criar a lógica e depois atribuir ela no vetor.
	
	
	
	//* Método 02: imprimir o vetor recebido no parâmetro
	public static void imprimir(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor [i]);
		}
	}
	
	
	//* Método 03: Criar, preencher e retornar um vetor com uma Progressão Geométrica cujo termo 
	//inicial é 3 e razão é 2, sendo que o último valor da PG não pode ultrapassar 5000
	public static int[] PG () {
		int pg = 3, razao = 2;
		int pgVetor[] = new int [11];
		for (int i = 0; i < pgVetor.length; i++) {
			pgVetor[i] = pg;
			pg = pg * razao;
		}
		return pgVetor;
		
	}
	
	
}
