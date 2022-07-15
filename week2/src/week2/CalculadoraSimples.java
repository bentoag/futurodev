/*
 @Autor: Bento Almeida Gonzaga
 Usando a estrutura condicional Switch Case para fazer um menu para que o usuário escolha se deseja somar, subtrair, multiplicar, dividir ou ver o resto de uma divisão. 
 Peça para o usuário informar dois números (duas variáveis inteiras) e depois escolha a através de um menu qual a operação que ele deseja realizar. 
 Imprima todas as instruções e resultados no terminal de maneira clara.

 */

package week2;

import java.util.Scanner;

public class CalculadoraSimples {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, operacao = -1, resultado = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();
		System.out.println();

		System.out.print(
				"Escolha qual operação deseja realizar, digite: \n1 - Para Adição \n2 - Para Subtração \n3 - Para Multiplicação \n4 - Para Divisão \n5 - Para o Resto da divisão \n99 - Para sair"
						+ "\n\n");
		operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			resultado = num1 + num2;
			System.out.println("\nA Adição de " + num1 + " + " + num2 + " = " + resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.println("\nA Subtração de " + num1 + " - " + num2 + " = " + resultado);
			break;
		case 3:
			resultado = num1 * num2;
			System.out.println("\nA Multiplicação de " + num1 + " X " + num2 + " = " + resultado);
			break;
		case 4:
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.println("\nA Divisão de " + num1 + " / " + num2 + " = " + resultado);
				break;
			} else {
				System.out.println("\nNão é possível fazer divisão por zero.");
				break;
			}
		case 5:
			resultado = num1 % num2;
			System.out.println("\nO Resto da Divisão de " + num1 + " / " + num2 + " é igual a:  " + resultado);
			break;
		case 99:
			System.out.println("\nObrigado!");
			break;

		default:
			throw new IllegalArgumentException("Operação Inválida: " + operacao);
		}

		sc.close();
	}

}
