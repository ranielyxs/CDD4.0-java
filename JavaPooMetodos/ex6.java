package JavaPooMetodos;

public class Carro {
	private String cor;
	private String modelo;
	private double preco;
	//conturtor padrao
	public Carro() {
		
	}
	// 2 paramentros
	public Carro(String modelo,double preco) {
		this.cor = "Preta";
		this.modelo = modelo;
		this.preco = preco;
		
	}
	// 3 paramentros
	public Carro(String modelo,double preco,String cor) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}

	
}
