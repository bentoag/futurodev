package week3_exerc3;

public class Erros {
	
	public static void main(String[] args) {
		try {
			  int[] numeros = {1, 2, 3};
			  System.out.println(numeros[10]);
			} catch (Exception e) {
			  System.out.println("Erro! Operação inválida!");
			}
	}
}
