package week4;

import java.util.Scanner;

/*
 * @Autor: Bento Almeida Gonzaga
 * 	Ler uma quantidade de nomes de pessoas e suas idades;
	Os nomes informados devem ser armazenados em um vetor e as idades em outro vetor;
  	Depois disso, apresente em tela o nome da pessoa mais velha;
 */
public class PessoaMaisVelha {

	public static void main(String[] args) {
		int qtdDeDados = 0, idadeDoMaisVelho = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas deseja inserir?");
		qtdDeDados = sc.nextInt();

		String[] nomes = new String[qtdDeDados];
		int[] idades = new int[qtdDeDados];

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Digite o Nome: ");
			nomes[i] = sc.next();
			System.out.print("Digite a idade: ");
			idades[i] = sc.nextInt();

			if (idades[i] > idadeDoMaisVelho) {
				idadeDoMaisVelho = idades[i];
			} else {
				continue;
			}

		}

		for (int i = 0; i < idades.length; i++) {
			if (idadeDoMaisVelho == idades[i]) {
				System.out.println("\nPessoa mais velha: " + nomes[i] + " com " + idadeDoMaisVelho + " anos!");
			} else {
				continue;
			}
		}
		sc.close();
	}

}
