package fundamentos;

import java.util.Scanner;

public class Exercio6 {		
	public static void main(String[]args) { 
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite um número:");
		double resposta = valor.nextDouble();
		System.out.println(resposta);
	
		if (resposta > 0) {
		 System.out.println("Positivo");
		}
		else {
		 System.out.println("Negativo");
		}
		
}

}
