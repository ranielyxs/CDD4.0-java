package fundamentos;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
Scanner lerNumeros = new Scanner(System.in);
		
		int arrayA [] = new int [10];
		int arrayB [] = new int [10];
		int arrayC [] = new int [10];
		int arrayD [] = new int [10];
		
		System.out.print("Digite 10 números para array A:");
		for (int x = 0; x < 10; x++) {	
			arrayA [x] = lerNumeros.nextInt();	
		}
				
		for (int i = 0; i < 10; i++) {
			System.out.print(arrayA[i]+", ");
		}
		System.out.println();
		
		for (int j = 0; j < 10; j++) {
			System.out.printf("Digite o %dº número para array B:", j+1);
			arrayB [j] = lerNumeros.nextInt();
		}
		for (int k = 0; k < 10; k++) {
			System.out.print(arrayB[k]+", ");
		}
		System.out.println();
		
		for (int l = 0; l < 10; l++) {
			System.out.printf("Digite o %d° número para array C:", l+1);
			arrayC [l] = lerNumeros.nextInt();
		}
		for (int m = 0; m < 10; m++) {
			System.out.print(arrayC[m]+", ");
		}
		System.out.println();
		
		for (int n = 0; n < 10; n++) {
			System.out.printf("Digite o %d° número para array D:", n+1);
			arrayD [n] = lerNumeros.nextInt();
		}
		for (int o = 0; o < 10; o++) {
			System.out.print(arrayD[o]+", ");
		}

}
}
