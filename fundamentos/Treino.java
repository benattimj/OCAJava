package fundamentos;

import java.util.Scanner;



public class Treino {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a,b,soma;
		
		System.out.println("Digite um numero: ");
		a = scan.nextInt();

		System.out.println("Digite segundo numero: ");
		b = scan.nextInt();
		
		
	
	
	if (a == b) {
		
		System.out.println("Voce nao pode digitar 2 numeros iguais");
		
	}
	
	else {
		
		System.out.println("Não são iguais.");

		soma = a + b;
		
		System.out.println(soma + " Top.");
		
	}

	}

}