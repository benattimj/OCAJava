package fundamentos;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}
		

		if(media >= 7) {
			System.out.println("Aprovado");
		}
		
		boolean criterioReprovacao = media <4.5 && media >= 0;
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}
		

}

}
