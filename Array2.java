package fundamentos;

public class Array2 {
	public static void main(String[] args) {
		int[]arrayUm = {7,17,27,37,47,57,67,77,87,97,107};
		int[] arrayDois = {1,11,21,31,41,51,61,};
		
		if (arrayDois.length > 8) {
			System.out.println("\nTamanho do ArrayDois - Maior que 8! ");
		}else {
			System.out.println("\n Tamanho do ArrayDois - Menor que 8!");
		}
		System.out.println("\n Tamanho do ArrayUm = "+arrayUm.length);
	}

}
