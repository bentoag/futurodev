package week1;
import java.util.Scanner;

/*@Autor: Bento Almeida Gonzaga
 
 Crie um programa em Java que fa�a 2 perguntas ao usu�rio: primeiro, pergunte o ano de nascimento. Depois, pergunte o ano atual. 
 Em seguida, exiba na tela o texto �Sua idade � x ou y�, onde x � a idade do usu�rio caso ele j� tenha feito anivers�rio neste ano, e y � a idade caso ele ainda n�o tenha aniversariado no ano corrente.
 */
public class Exerc6 {

	public static void main(String[] args) {
		int anonasc=0, anoatual=0, x=0, y=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o ano que voc� nasceu: ");
		anonasc = sc.nextInt();
		System.out.print("Informe o ano atual: ");
		anoatual = sc.nextInt();
		
		x=anoatual - anonasc;
		y=x-1;
		
		System.out.println("Sua idade � " + x + " ou " + y);
	}

}
