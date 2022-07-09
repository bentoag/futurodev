package week1;

import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Voc� pode utilizar o c�digo do exerc�cio anterior para este exerc�cio. 
 Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usu�rio seu sobrenome, depois seu nome, e ent�o escreva na tela o nome completo do usu�rio, seguido por suas iniciais. 
 Por exemplo: �Ol� Fulano Silva, suas iniciais s�o F.S.�.
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
	
		System.out.println("Ol� " + nome + " " + sobrenome + " ,suas iniciais s�o " + inicionome + "."+ iniciosobrenome+ ".");

		sc.close();
	}
}
