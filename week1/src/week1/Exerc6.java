package week1;
import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Crie um programa em Java que faça 2 perguntas ao usuário: primeiro, pergunte o ano de nascimento. Depois, pergunte o ano atual. 
 Em seguida, exiba na tela o texto “Sua idade é x ou y”, onde x é a idade do usuário caso ele já tenha feito aniversário neste ano, e y é a idade caso ele ainda não tenha aniversariado no ano corrente.
 */
public class Exerc6 {

	public static void main(String[] args) {
		int anonasc=0, anoatual=0, x=0, y=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o ano que você nasceu: ");
		anonasc = sc.nextInt();
		System.out.print("Informe o ano atual: ");
		anoatual = sc.nextInt();
		
		x=anoatual - anonasc;
		y=x-1;
		
		System.out.println("Sua idade é " + x + " ou " + y);
	}

}
