package week4;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @Autor: Bento Almeida Gonzaga
 * 
 */
public class NumerosNegativos {

	public static void main(String[] args) {
		int tamanhoVetor = 0, contadorDeNegativos = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quantos números você deseja inserir: ");
		tamanhoVetor = sc.nextInt();

		int[] vetor = new int[tamanhoVetor];
		ArrayList<Integer> numerosNegativos = new ArrayList<Integer>();

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] >= 0) {
				continue;
			} else {
				numerosNegativos.add(vetor[i]);
			}
		}

		System.out.println("\n\nNÚMEROS NEGATIVOS \n" + numerosNegativos);

		sc.close();
	}

}
