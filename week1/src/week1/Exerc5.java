package week1;

import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Crie um programa em Java que pergunte ao usuário: nome, idade e se gosta de praticar algum esporte. 
 Crie 3 variáveis para guardar as respostas do usuário: uma deve receber um valor textual (string), outra deve receber um valor numérico (int), e outra um valor de verdadeiro ou falso (boolean). 
 Faça com que esses 3 valores sejam exibidos de volta para o usuário.
 */

public class Exerc5 {

	public static void main(String[] args) {
		int idade=0;
		String nome="";
		boolean resp=false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		nome = sc.nextLine();
		System.out.print("Informe a sua idade: ");
		idade = sc.nextInt();
		System.out.print("Você gosta de esporte? ");
		resp = sc.nextBoolean();
		
		if(resp) {
			System.out.println("Que legal " + nome + " você tem " + idade + " anos e gosta de esporte!");
		}else{
			System.out.println("Que surpresa " + nome + " você tem " + idade + " anos e não gosta de esporte!");
		}
		sc.close();
		
	}

}
