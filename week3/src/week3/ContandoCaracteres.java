package week3;

/*
 * @Autor: Bento Almeida Gonzaga
 * Escreva um c�digo que receba um n�mero X (informado pelo usu�rio) de pares de Nomes e Sobrenomes. 
 * Ap�s o usu�rio informar todos os nomes e sobrenomes, exiba um par �<nome>: <quantos caracteres tem a soma do nome>�
 */
import java.util.Scanner;

public class ContandoCaracteres {

	public static void main(String[] args) {
		String nome = "", sobrenome = "", nomesemespaco = "", sobrenomesemespaco = "";
		int tamanhonome = 0, tamanhosobrenome = 0, totalletras = 0, qtsPares = 0;

		Scanner pares = new Scanner(System.in);
		Scanner recebenome = new Scanner(System.in);
		Scanner recebesobrenome = new Scanner(System.in);

		System.out.println("Quantos pares de nome e sobrenome voc� deseja informar?");
		qtsPares = pares.nextInt();

		String nomes[] = new String[qtsPares];
		String sobrenomes[] = new String[qtsPares];
		int qtdDeCaracteres[] = new int[qtsPares];

		for (int i = 0; i < qtsPares; i++) {

			System.out.print("Escreva o " + (i + 1) + "� nome: ");
			nome = recebenome.nextLine();
			nomes[i] = nome;

			// concatenar nome
			for (int j = 0; j < nome.length(); j++) {
				if (nome.charAt(j) != ' ') {
					nomesemespaco += nome.charAt(j);
				}

			}

			System.out.print("Escreva o " + (i + 1) + "� sobrenome: ");
			sobrenome = recebesobrenome.nextLine();
			sobrenomes[i] = sobrenome;

			// concatenar sobrenome
			for (int k = 0; k < sobrenome.length(); k++) {
				if (sobrenome.charAt(k) != ' ') {
					sobrenomesemespaco += sobrenome.charAt(k);
				}
			}

			tamanhonome = nomesemespaco.length();
			tamanhosobrenome = sobrenomesemespaco.length();
			totalletras = tamanhonome + tamanhosobrenome;
			qtdDeCaracteres[i] = totalletras;

			nomesemespaco = "";
			sobrenomesemespaco = "";
			totalletras = 0;
			System.out.println("\n");
		}

		for (int i = 0; i < qtdDeCaracteres.length; i++) {
			System.out.println(
					"O nome:  " + nomes[i] + " " + sobrenomes[i] + " possui " + qtdDeCaracteres[i] + " letras!");
		}

		pares.close();
		recebenome.close();
		recebesobrenome.close();

	}

}
