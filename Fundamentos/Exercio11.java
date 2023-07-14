package fundamentos;

import java.util.Scanner;

public class Exercio11 {

	public static void main(String[]args) { 
	  Scanner palavra= new Scanner(System.in);
		System.out.println("Informe F ou M:");
		char letra = palavra.next().charAt(0);
		
        System.out.println(letra == 'F' ? "Feminino" : letra == 'M' ? "Masculino" : "Caractere inválido.");
		
	}
}

