package fundamentos;

public class String7 {
	public static void main(String[] args) {
		
		String Valor = "CDD - Java";
		System.out.println(Valor.endsWith("Java"));
		//pergunta se a ultima palavra é "Java"
		System.out.println(Valor.startsWith("C"));
		//pergunta se inicia com "C"
		System.out.println(Valor.startsWith("DD",1));
		// pergunta  se inicia com "DD" depois da primeira letra
		
	}

}
