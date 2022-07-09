package week1;

import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Crie um programa em Java que pergunte ao usuário seu último sobrenome e em seguida exiba na tela o texto 
 “Olá, X. Seu sobrenome contém y letras”, onde X é o sobrenome em letras maiúsculas, e y é a quantidade de letras desse sobrenome.
 */

public class Exerc4 {

	public static void main(String[] args) {
		String sobrenome = "", maiusculo = "";
		int tamanhosobrenome = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe seu último sobrenome: ");
		sobrenome = sc.nextLine();
		maiusculo = sobrenome.toUpperCase();
		tamanhosobrenome = sobrenome.length();
		System.out.println("Olá " + maiusculo + " Seu sobrenome contém " + tamanhosobrenome + " letras.");

		sc.close();

	}

}
