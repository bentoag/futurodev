package week3;

/*
 * @Autor: Bento Almeida Gonzaga
 * Escreva um c�digo que gera um n�mero aleat�rio entre 0 e 10, e pe�a para um usu�rio tentar acertar o n�mero at� que ele acerte.
 */
import java.util.Scanner;
import java.util.Random;

public class AdivinhaSo {

	public static void main(String[] args) {
		int aleatorio = 0, numero = 0;
		boolean jogando = true;

		Scanner sc = new Scanner(System.in);
		Random gerado = new Random();

		aleatorio = gerado.nextInt(10);

		while (jogando) {
			System.out.println("Digite um n�mero de 0 a 10: ");
			numero = sc.nextInt();

			if (numero != aleatorio) {
				System.out.println("Tente novamente! \n");
			} else {
				jogando = false;
				System.out.println("Parab�ns, voc� acertou! ");
			}
		}
		
		sc.close();

	}

}
