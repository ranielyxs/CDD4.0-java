package fundamentos;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos:");
		
		int numAlunos = entrada.nextInt();
		
		int i = 0;
		float media = 0;
		
		while(i < numAlunos){
		System.out.println("Insira a nota:");
		float nota = entrada.nextFloat();
			
			
			media += nota;
			i++;
		}
	System.out.println("A média da turma é: " + media/numAlunos);

	}


}
