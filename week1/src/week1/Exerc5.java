package week1;

import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Crie um programa em Java que pergunte ao usu�rio: nome, idade e se gosta de praticar algum esporte. 
 Crie 3 vari�veis para guardar as respostas do usu�rio: uma deve receber um valor textual (string), outra deve receber um valor num�rico (int), e outra um valor de verdadeiro ou falso (boolean). 
 Fa�a com que esses 3 valores sejam exibidos de volta para o usu�rio.
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
		System.out.print("Voc� gosta de esporte? ");
		resp = sc.nextBoolean();
		
		if(resp) {
			System.out.println("Que legal " + nome + " voc� tem " + idade + " anos e gosta de esporte!");
		}else{
			System.out.println("Que surpresa " + nome + " voc� tem " + idade + " anos e n�o gosta de esporte!");
		}
		sc.close();
		
	}

}
