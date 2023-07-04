package fundamentos;


///**
// * Essa classe representa soma de dois números....
// * 
// * @author Murilo Benatti
// * @Since JDK1.0
// * 
// */

import java.util.Scanner;

public class Addition 

{
	//Metodo main inicia a execução do aplicativo Java
	
	public static void main(String[] args)
	{
		
		//Cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1; // Primeiro número a somar
		int number2; // Segundo número a somar
		int sum;    // Soma dos dois numero
		
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
	
		sum = number1 + number2; // Calculo da soma dos números
		
		System.out.printf("Sum is %d%n", sum);
		
		
		
	input.close();
	}
}
