package JavaPoo;

public class UsoDeAtributos {
	public static void main (String[] args) {
		
		Atributos cliente1 = new Atributos();
		System.out.println(cliente1.fnome);
		System.out.println(cliente1.inome);
		System.out.println(cliente1.idade);
		System.out.printf("A aluna %s %s tem %d anos",cliente1.fnome,cliente1.inome,cliente1.idade);

	}


}
