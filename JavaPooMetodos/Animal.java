package JavaPooMetodos;

public class Animal {
	String nome;
	int idade;
	
	public Animal() {
		
	}
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Animal(String nome) {
		this.nome = nome;
	}
	public void emitirSom() {
		System.out.println("O animal emite som.");
	}
}

