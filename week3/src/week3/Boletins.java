package week3;

/*
 * @Autor: Bento Almeida Gonzaga
 * Escreva um c�digo que pergunta ao professor quantas notas um curso tem e quantos alunos possuem na turma. 
 * Ap�s isso, leia todas as avalia��es e imprima o nome de todos os alunos aprovados. 
 * Considere um aluno aprovado aquele que possui uma m�dia maior ou igual a 7.

 */
import java.util.Scanner;

public class Boletins {

	public static void main(String[] args) {
		int numeroAlunos = 0, numeroAvaliacoes = 0;
		double soma = 0.0, mediaPorAluno = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos voc� quer cadastrar?");
		numeroAlunos = sc.nextInt();
		System.out.println("Quantas avalia��es voc� quer cadastrar?");
		numeroAvaliacoes = sc.nextInt();

		double notasPorAluno[][] = new double[numeroAlunos][numeroAvaliacoes];
		String nomes[] = new String[numeroAlunos];
		double mediasPorAluno[] = new double[numeroAlunos];

		for (int i = 0; i < numeroAlunos; i++) {
			System.out.print("Digite o nome do " + (i + 1) + "� aluno:  ");
			nomes[i] = sc.next();
			for (int j = 0; j < numeroAvaliacoes; j++) {
				System.out.print("Digite a " + (j + 1) + "� nota do " + nomes[i] + ":  ");
				soma += sc.nextDouble();
			}
			mediaPorAluno = soma / numeroAvaliacoes;			
			mediasPorAluno[i] = mediaPorAluno;
			soma = 0.0;
			System.out.print("\n");
		}

		for (int k = 0; k < numeroAlunos; k++) {
			if (mediasPorAluno[k] >= 7.0) {
				System.out.println("O Aluno " + nomes[k] + "  obteve media: " + mediasPorAluno[k]);
				
			}

		}
		sc.close();

	}

}
