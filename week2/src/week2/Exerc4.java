package week2;

/*
 @Autor: Bento Almeida Gonzaga
 Fa�a um c�digo em Java para determinar o resultado da express�o: " !(a + b == c) || ((c != 0) && (b - c >= 19) )" onde para a = 34, b = 12 e c = 8. 
 Apresente de maneira clara e sequencial ao usu�rio o passo a passo at� o resultado.
 */
public class Exerc4 {

	public static void main(String[] args) {
		int a = 34, b = 12, c = 8, prt1, prt2;

		prt1 = (a + b);
		prt2 = (b - c);

		System.out.println("O valor de A �: " + a);
		System.out.println("O valor de B �: " + b);
		System.out.println("O valor de C �: " + c + "\n");

		System.out.println("O valor de (a+b) �: " + prt1);
		System.out.println("!(a + b == c) : " + !(prt1 == c) + "\n");

		System.out.println("O valor de (b-c) �: " + prt2);
		System.out.println("(c != 0) : " + (c != 0) + "\n");

		System.out.println("(b - c >= 19) : " + (prt2 >= 19));
		System.out.println("(c != 0) && (b - c >= 19): " + ((c != 0) && (prt2 >= 19)) + "\n");
		System.out.println("!(a + b == c) || ((c != 0) && (b - c >= 19) ) : " + (!(prt1 == c) || ((c != 0) && (prt2 >= 19))));

	}

}
