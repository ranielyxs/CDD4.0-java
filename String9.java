package fundamentos;
import java.util.Scanner;
import java.util.StringTokenizer;

public class String9 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma Frase:");
        String frase = entrada.nextLine();		
		
		StringTokenizer exemplo = new StringTokenizer(frase);
		System.out.println(exemplo.countTokens());

	}

}
