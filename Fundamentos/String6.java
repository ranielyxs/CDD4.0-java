package fundamentos;

public class String6 {
	public static void main(String[] args) {
		
		String valor = "CDD4.0 - Java";
		
		System.out.println(valor.compareTo("CDD4.0 - Java")== 0 ? true: false);
        // compareTo determina a ordem das strings

		System.out.println(valor.compareTo("CDD4.0 - Java")== 0 ? true: false);
		System.out.println(valor.compareToIgnoreCase("CDD4.0 - Java")== 0 ? true: false);

	}

}
