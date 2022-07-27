package week4;

import java.util.Scanner;

public class MediaDosPares {

	public static void main(String[] args) {
		int qtdNumeros = 0, qtdDeNumerosPares = 0;
		double media = 0.0, soma = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quantos números você deseja inserir: ");
		qtdNumeros = sc.nextInt();

		int vetorNumeros[] = new int[qtdNumeros];

		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			vetorNumeros[i] = sc.nextInt();
			if ((vetorNumeros[i] % 2) == 0) {
				soma += vetorNumeros[i];
				qtdDeNumerosPares++;
			} else {
				continue;
			}
		}
		if (soma == 0.0) {
			System.out.println("Nenhum número par informado!");
		} else {
			media = soma / qtdDeNumerosPares;
			System.out.printf("Média dos Pares: %.1f ", media);
		}
		sc.close();
	}

}
