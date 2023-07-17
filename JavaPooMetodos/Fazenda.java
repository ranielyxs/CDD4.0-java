package JavaPooMetodos;

public class Fazenda {
		public static void main(String[] args) {
			
			Animal A1 = new Animal();
			Animal A2 = new Animal("Bethoveen", 5);
			
			Cachorro C1 = new Cachorro("Pipoca", 10);
			Pombo P1 = new Pombo("Bily",10);
			
			A1.emitirSom();
			C1.emitirSom();
			P1.Andar();
		}


}
