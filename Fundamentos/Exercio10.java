package fundamentos;

import java.util.Scanner;

public class Exercio10 {
	public static void main(String[]args) { 
			Scanner nota = new Scanner(System.in);
		System.out.println("Digite suas notas:");
		double nota1 = nota.nextDouble();
		
		double nota2 = nota.nextDouble();
		
		double nota3 = nota.nextDouble();

		
		System.out.println("Sua media é:" + nota1+nota2+nota3/3);
		
		
	}

}
