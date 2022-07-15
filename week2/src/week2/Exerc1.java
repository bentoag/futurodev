package week2;

/*
 @Autor: Bento Almeida Gonzaga
 Faça código em Java para a expressão: " !((i > 4) || (j <= 5)) " onde para i = 10 e j = 3. 
 Apresente os resultados ao usuário (no terminal) de maneira clara e sequencial (passo a passo da execução).
 */
public class Exerc1 {

	public static void main(String[] args) {
		boolean prt1 = false, prt2 = false, prt3 = false, expressao = false;
		int i = 10, j = 3;
		prt1 = (i > 4);
		prt2 = (j <= 5);
		prt3 = ((i > 4) || (j <= 5));
		expressao = !((i > 4) || (j <= 5));
		System.out.println("i = " + i);
		System.out.println("(I > 4) = " + prt1);
		System.out.println("j = " + j);
		System.out.println("(j <= 5) " + prt2);
		System.out.println("[(i > 4) || (j <= 5)] = " + prt3);
		System.out.println("Expressao: !((i > 4) || (j <= 5)) = " + expressao);
	}

}
