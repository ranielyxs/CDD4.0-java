package JavaPooMetodos;

public class exMetodos {
	public static void main (String[] args) {
		Metodos p1 = new Metodos();
		String nome = p1.nome();
		int idade = p1.idade();
		double valor = p1.valor();
		
		System.out.printf("%s tem %d anos e %.2f R$ na carteira",nome,idade,valor);
		
	}
}
