package praticas;

public class Pratica30 {

	public static void main(String[] args) {
		System.out.println("Progressão Aritmética");
		Imprimir(RetornarArray());

		System.out.println("");
		System.out.println("");
		System.out.println("Soma de todos elementos da Progressão Aritmética");

		Imprimir2(Soma(RetornarArray()));

		System.out.println("");
		System.out.println("Elementos pares da Progressão Aritmética");

		Imprimir(ElementosPares(RetornarArray()));

		System.out.println("");
		System.out.println("");
		System.out.println("Progressão Aritmética decrescente");

		Imprimir(ArrayDecrescente(RetornarArray()));

		System.out.println("");
		System.out.println("");
		System.out.println("Média Aritmética do 2º e 15º");
		Imprimir3(MediaAritmetica());

		System.out.println("");
		System.out.println("Média Ponderada do 5º e 11º");
		Imprimir3(MediaPonderada());

	}

	//a)retornar o array construído dinamicamente com a sequencia solicitada.
	public static int[] RetornarArray () {
		int pa = 3;
		int vetorPA[] = new int [20];
		for (int i = 0; i < vetorPA.length; i++) {
			vetorPA[i] = pa;
			pa = pa + 6;
		}
		return vetorPA;
	}

	//b)retornar a soma de todos os elementos da sequencia elaborada no item "a"
	public static int Soma (int vetor[]) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		return soma;
	}

	//c)retornar um array construído dinamicamente apenas com os elementos pares da sequencia do item "a".
	//obs: 
	public static int[] ElementosPares (int vetor[]) {
		int ElementosPares[] = new int [vetor.length];
		int y = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] %2 == 0) {
				ElementosPares[y] = vetor[i];
				y++;
			}
		}
		return ElementosPares;
	}

	//d)retornar um array construído dinamicamente com os mesmos elementos do item "a" em ordem decrescente.
	public static int[] ArrayDecrescente (int vetor[]) {
		int ArrayDecrescente[] = new int [vetor.length];
		for (int i = ArrayDecrescente.length - 1, Contador = 0; i >= 0; Contador++, i--) {
			ArrayDecrescente[Contador] = vetor[i];
		}
		return ArrayDecrescente;
	}

	//e)retornar a média aritmética do 2º e 15º elementos do array elaborado no item "a"
	public static double MediaAritmetica () {
		int SegundoElemento = 9, Decimoquinto = 87;
		double MediaAritmetica;
		MediaAritmetica = (SegundoElemento + Decimoquinto) / 2;
		return MediaAritmetica;
	}

	//f)retornar a média ponderada do 5º e 11º elementos do array, considerando os pesos 7 e 3 respectivamente.
	public static double MediaPonderada () {
		int QuintoElemento = 27, Decimoprimeiro = 63, Peso1 = 7, Peso2 = 3;
		double MediaPonderada;
		MediaPonderada = (QuintoElemento * Peso1 + Decimoprimeiro * Peso2) / (Peso1 + Peso2);
		return MediaPonderada;
	}

	//Método para imprimir o vetor.
	public static void Imprimir (int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	//Método para imprimir um valor int.
	public static void Imprimir2 (int a) {
		System.out.println(a);
	}

	//Método para imprimir um valor double.
	public static void Imprimir3 (double a) {
		System.out.println(a);
	}

}
