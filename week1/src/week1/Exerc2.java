package week1;

import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome, depois seu nome, e então escreva na tela, em uma única “string”, o nome completo do usuário. 
 Informe também ao usuário quantas letras tem no nome dele. Por exemplo: “Olá Fulano Silva, seu nome possui 11 letras.”.
 */

public class Exerc2 {

	public static void main(String[] args) {
		String nome = "", sobrenome = "", nomesemespaco = "", sobrenomesemespaco = "";
		int tamanhonome, tamanhosobrenome = 0, totalletras;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva o seu sobrenome: ");
		sobrenome = sc.nextLine();
		System.out.print("Escreva o seu nome: ");
		nome = sc.nextLine();

		for (int i = 0; i < nome.length(); i++) {
			if (nome.charAt(i) != ' ') {
				nomesemespaco += nome.charAt(i);
			}
		}
		
		for (int i = 0; i < sobrenome.length(); i++) {
			if (sobrenome.charAt(i) != ' ') {
				sobrenomesemespaco += sobrenome.charAt(i);
			}
		}
		
		tamanhonome = nomesemespaco.length();
		tamanhosobrenome = sobrenomesemespaco.length();
		totalletras = tamanhonome + tamanhosobrenome;
		System.out.println("Olá " + nome + " " + sobrenome + " ,seu nome possui " + totalletras + " letras.");

		sc.close();

	}

}
