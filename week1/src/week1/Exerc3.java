package week1;

import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Você pode utilizar o código do exercício anterior para este exercício. 
 Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome, depois seu nome, e então escreva na tela o nome completo do usuário, seguido por suas iniciais. 
 Por exemplo: “Olá Fulano Silva, suas iniciais são F.S.”.
 */

public class Exerc3 {

	public static void main(String[] args) {
		String nome = "", sobrenome = "", inicionome = "", iniciosobrenome = "";		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva o seu sobrenome: ");
		sobrenome = sc.nextLine();
		System.out.print("Escreva o seu nome: ");
		nome = sc.nextLine();
		
		inicionome += nome.charAt(0);		
		iniciosobrenome += sobrenome.charAt(0);
		
		for (int i = 0; i < sobrenome.length(); i++) {
			if (sobrenome.charAt(i) == ' ') {
				iniciosobrenome += "."+ sobrenome.charAt(i+1);
			}
		}
	
		System.out.println("Olá " + nome + " " + sobrenome + " ,suas iniciais são " + inicionome + "."+ iniciosobrenome+ ".");

		sc.close();
	}
}
