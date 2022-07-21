package estruturas_de_repeticao;

import java.util.Scanner;

public class NotasAluno {

	public static void main(String[] args) {
		int quantidadeAvaliacoes = 0, qntNotasDoAluno = 0;
		double notaDoAluno = 0.0, media = 0.0;
		boolean notasValidas = true;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a quantidade desejada de avalia��es:  ");
		quantidadeAvaliacoes = scanner.nextInt();

		while (qntNotasDoAluno < quantidadeAvaliacoes) {

			qntNotasDoAluno++;
			System.out.print("Insira " + qntNotasDoAluno + "� nota:  ");
			double somatoria = scanner.nextDouble();
			if (somatoria < 0 || somatoria > 10) {
				System.out.println("Tente novamente! Nota Digitada � inv�lida.");
				notaDoAluno = 0.0;
				notasValidas = false;
				break;
			} else {
				notaDoAluno += somatoria;
			}

		}
		if (notasValidas) {
			media = notaDoAluno / quantidadeAvaliacoes;
			System.out.print("\nSua m�dia �:  ");
			System.out.printf("%.2f", media);
		}

		scanner.close();

	}

}
