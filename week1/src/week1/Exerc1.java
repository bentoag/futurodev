package week1;

import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Crie um programa em Java que, ao executar, escreva para o usuário uma saudação, contendo informações de “copyright” (quem desenvolveu a aplicação). 
 Por exemplo: “Olá, esse programa foi escrito por Fulano.”.
 */

public class Exerc1 {

	public static void main(String[] args) {
		String autor = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe por quem foi desenvolvido esta aplicação: ");
		autor = sc.nextLine();

		System.out.println("Olá, esse programa foi escrito por: " + autor);

		sc.close();

	}

}
