package faculdade;

import java.util.Scanner;

public class Cadastramento {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		String nome;
		String rua;
		int numero;
		String bairro;
		String cep;
		String cidade;
		String estado;
		
		
		System.out.println("Qual é o seu nome? ");
		nome = sc.next();
		
		System.out.println("Agora digite o seu endereço completo.\nRua: ");
		rua = sc.next();
		
		System.out.println("Número: ");
		numero = sc.nextInt();
		
		System.out.println("Bairro: ");
		bairro = sc.next();
		
		System.out.println("Cep: ");
		cep = sc.next();
		
		System.out.println("Cidade: ");
		cidade = sc.next();
		
		System.out.println("Estado: ");
		estado = sc.next();
		

	}

}
