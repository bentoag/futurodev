package week1;

import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Crie um programa em Java que, ao executar, escreva para o usu�rio uma sauda��o, contendo informa��es de �copyright� (quem desenvolveu a aplica��o). 
 Por exemplo: �Ol�, esse programa foi escrito por Fulano.�.
 */

public class Exerc1 {

	public static void main(String[] args) {
		String autor = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe por quem foi desenvolvido esta aplica��o: ");
		autor = sc.nextLine();

		System.out.println("Ol�, esse programa foi escrito por: " + autor);

		sc.close();

	}

}
