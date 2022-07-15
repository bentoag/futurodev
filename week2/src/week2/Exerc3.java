/*
@Autor: Bento Almeida Gonzaga
Crie um algoritmo que leia um valor referente à temperatura e exiba uma mensagem
informando o tipo do clima de maneira mais detalhada, considerando as seguintes condições:
Se a temperatura estiver até 18 graus, o clima é frio;
Se a temperatura estiver entre 19 e 23 graus, o clima é agradável;
Se a temperatura estiver entre 24 e 35 graus, o clima é quente;
Se a temperatura estiver acima de 35 graus, o clima é muito quente;
*/
package week2;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a temperatura ambiente:  ");
		temp = sc.nextInt();

		if (temp <= 18) {
			System.out.println("O Clima está frio!");
		} else if (temp > 18 && temp < 24) {
			System.out.println("O Clima está Agradável!");
		} else if (temp >= 24 && temp <= 35) {
			System.out.println("O Clima é Quente!");
		} else {
			System.out.println("O Clima é muito quente!");
		}
		sc.close();
	}

}
