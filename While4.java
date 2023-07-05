package fundamentos;

import java.util.Scanner;

public class While4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número:");
		
		int numero = entrada.nextInt();
		
		int i = 1;
		int j = 1;
		
		System.out.println("Os números ímpares são:");
		while (i <= numero) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		System.out.println("Os números pares são:");
		while (j <= numero) {
			if (j % 2 == 1) {
				System.out.print(j + " ");
				}
			j++;
		}
	}
}
