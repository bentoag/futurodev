package week3;

/*
 * @Autor: Bento Almeida Gonzaga
 * Escreva um c�digo que conte todos os n�meros que s�o m�ltiplos de 3 entre 0 e 300. Exiba quantos n�meros foram contados ao final do programa.

 */
public class MultiplosDeTres {
	public static void main(String[] args) {
		int cont = 0, numero = 0;
		for (int i = 3; i <= 300; i++) {
			if (i % 3 == 0) {
				numero = i;
				System.out.println(numero);
				cont++;
			}
		}
		System.out.println("Temos " + cont + " numeros multiplos de 3 entre 3 e 300");
	}

}
