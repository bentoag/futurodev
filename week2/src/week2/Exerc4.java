package week2;

/*
 @Autor: Bento Almeida Gonzaga
 Faça um código em Java para determinar o resultado da expressão: " !(a + b == c) || ((c != 0) && (b - c >= 19) )" onde para a = 34, b = 12 e c = 8. 
 Apresente de maneira clara e sequencial ao usuário o passo a passo até o resultado.
 */
public class Exerc4 {

	public static void main(String[] args) {
		int a = 34, b = 12, c = 8, prt1, prt2;

		prt1 = (a + b);
		prt2 = (b - c);

		System.out.println("O valor de A é: " + a);
		System.out.println("O valor de B é: " + b);
		System.out.println("O valor de C é: " + c + "\n");

		System.out.println("O valor de (a+b) é: " + prt1);
		System.out.println("!(a + b == c) : " + !(prt1 == c) + "\n");

		System.out.println("O valor de (b-c) é: " + prt2);
		System.out.println("(c != 0) : " + (c != 0) + "\n");

		System.out.println("(b - c >= 19) : " + (prt2 >= 19));
		System.out.println("(c != 0) && (b - c >= 19): " + ((c != 0) && (prt2 >= 19)) + "\n");
		System.out.println("!(a + b == c) || ((c != 0) && (b - c >= 19) ) : " + (!(prt1 == c) || ((c != 0) && (prt2 >= 19))));

	}

}
