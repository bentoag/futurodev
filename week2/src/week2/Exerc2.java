
/*
@Autor: Bento Almeida Gonzaga
Crie um algoritmo que leia um valor inteiro representando a temperatura e
informe se o clima está quente ou frio. Considere que o clima está quente se a temperatura
for superior a 30. Caso contrário, informe que o clima está frio. Imprima em tela de maneira
clara e de fácil entendimento ao usuário.
*/
package week2;
import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a temperatura ambiente:  ");
		temp = sc.nextInt();

		if (temp > 30) {
			System.out.print("Hoje a temperatura está quente!");
		} else {
			System.out.print("Hoje a temperatura está fria!");
		}
		sc.close();

	}

}
