package week1;

import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Crie um programa em Java que pergunte ao usu�rio seu �ltimo sobrenome e em seguida exiba na tela o texto 
 �Ol�, X. Seu sobrenome cont�m y letras�, onde X � o sobrenome em letras mai�sculas, e y � a quantidade de letras desse sobrenome.
 */

public class Exerc4 {

	public static void main(String[] args) {
		String sobrenome = "", maiusculo = "";
		int tamanhosobrenome = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe seu �ltimo sobrenome: ");
		sobrenome = sc.nextLine();
		maiusculo = sobrenome.toUpperCase();
		tamanhosobrenome = sobrenome.length();
		System.out.println("Ol� " + maiusculo + " Seu sobrenome cont�m " + tamanhosobrenome + " letras.");

		sc.close();

	}

}
