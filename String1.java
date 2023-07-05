package fundamentos;

public class String1 {
	public static void main(String[] args) {
		String texto = "Hello world";
		String resultado = texto.replace("l", "w");
		System.out.println(resultado);
		
		char c = texto.charAt(1);
		System.out.println(c);
	
		
		String resultado1 = texto.toUpperCase();
		System.out.println(resultado1);

}
}
