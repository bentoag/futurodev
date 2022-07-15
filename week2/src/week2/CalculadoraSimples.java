/*
 @Autor: Bento Almeida Gonzaga
 Usando a estrutura condicional Switch Case para fazer um menu para que o usu�rio escolha se deseja somar, subtrair, multiplicar, dividir ou ver o resto de uma divis�o. 
 Pe�a para o usu�rio informar dois n�meros (duas vari�veis inteiras) e depois escolha a atrav�s de um menu qual a opera��o que ele deseja realizar. 
 Imprima todas as instru��es e resultados no terminal de maneira clara.

 */

package week2;

import java.util.Scanner;

public class CalculadoraSimples {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, operacao = -1, resultado = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextInt();
		System.out.println();

		System.out.print(
				"Escolha qual opera��o deseja realizar, digite: \n1 - Para Adi��o \n2 - Para Subtra��o \n3 - Para Multiplica��o \n4 - Para Divis�o \n5 - Para o Resto da divis�o \n99 - Para sair"
						+ "\n\n");
		operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			resultado = num1 + num2;
			System.out.println("\nA Adi��o de " + num1 + " + " + num2 + " = " + resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.println("\nA Subtra��o de " + num1 + " - " + num2 + " = " + resultado);
			break;
		case 3:
			resultado = num1 * num2;
			System.out.println("\nA Multiplica��o de " + num1 + " X " + num2 + " = " + resultado);
			break;
		case 4:
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.println("\nA Divis�o de " + num1 + " / " + num2 + " = " + resultado);
				break;
			} else {
				System.out.println("\nN�o � poss�vel fazer divis�o por zero.");
				break;
			}
		case 5:
			resultado = num1 % num2;
			System.out.println("\nO Resto da Divis�o de " + num1 + " / " + num2 + " � igual a:  " + resultado);
			break;
		case 99:
			System.out.println("\nObrigado!");
			break;

		default:
			throw new IllegalArgumentException("Opera��o Inv�lida: " + operacao);
		}

		sc.close();
	}

}
