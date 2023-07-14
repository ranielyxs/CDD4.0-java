package fundamentos;

import java.util.Scanner;

public class Exercio8 {	
	public static void main(String[]args) { 
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite TRÊS número:");
		double resposta1 = numero.nextDouble();

		double resposta2 = numero.nextDouble();
		
		double resposta3 = numero.nextDouble();
		
		
		if (resposta1 > resposta2 && resposta1 > resposta3) {
			 System.out.println(resposta1+"É Maior");
			}
			else {
			}
		if (resposta2 > resposta1 && resposta2 > resposta3) {
			 System.out.println(resposta2+"É Maior");
			}
			else {
			}
		if (resposta3 > resposta1 && resposta3 > resposta2) {
			 System.out.println(resposta3+"É Maior");
			}
			else {
	
			}
	}
}
