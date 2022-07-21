package estruturas_de_repeticao;

import java.util.Scanner;
import java.util.Random;

/*
 * Exemplos de estruturas de repeticao semana 3 - 18 a 22/jul de 2022
 */
public class examples {

	public static void main(String[] args) {	
		
		int pessoas = 30, aceitos = 0;
		Scanner sc = new Scanner(System.in);
	
		for (int i=1; i <= 30; i++) {
			System.out.print("Quer pudim? ");
			String opcao = sc.nextLine();
			if(opcao.equalsIgnoreCase("S")) {
				aceitos++;
			}
			System.out.println("Ainda Faltam: " + (pessoas - i) + "\n");			
		}		
		System.out.println("Pessoas servidas: " + aceitos);
		

		/*
		 * Exemplo 1 com while: Estrutura repete um número indeterminado de vezes
		 * 
		 * System.out.print("Qual o nome do professor da semana passada: "); nome =
		 * sc.nextLine();
		 * 
		 * while (!nome.equalsIgnoreCase("Francisco")) {
		 * System.out.println("Tente novamente! \n");
		 * System.out.print("Qual o nome do professor da semana passada: "); nome =
		 * sc.nextLine(); } System.out.println("Isso! Você acertou!");
		 * 
		 */
	/*
	 * 	String nome;
		Random aleatorio = new Random();
		int capacidadeGarrafa = 500, qtdAguaGarrafa=0, qtdAcionamentosFiltro=0, qtdGarrafasCheias=0;
		boolean satisfeito = true; //representa se estou satisfeito com a quantidade de agua na garrafa

		Scanner sc = new Scanner(System.in);
				//Exemplo 2: Enchimento garrafa
		while (qtdGarrafasCheias < 4) {
			while (satisfeito) {
				//funcao apertar filtro		
					qtdAguaGarrafa += aleatorio.nextInt(50);
					qtdAcionamentosFiltro++;
					System.out.println("Encheu: " + qtdAguaGarrafa + " ml");
					if(qtdAguaGarrafa > 450) {
						satisfeito = false;							
					}
			}
			qtdGarrafasCheias++;
			qtdAguaGarrafa=0;
			satisfeito = true;
			System.out.println("\nGarrafas cheias: " + qtdGarrafasCheias);
			System.out.println("Apertei o filtro para a garrafa " + qtdGarrafasCheias + "  "+ qtdAcionamentosFiltro + " vezes \n");
			qtdAcionamentosFiltro=0;
		}
		*/		
		
		/*Exemplo com Do While - Executa pelo menos uma vez
		 * do {
			System.out.print("Qual o nome do professor da semana passada: ");
			nome = sc.nextLine();
			System.out.println((!nome.equalsIgnoreCase("Francisco")) ? "Tente Novamente \n" : "Isso, você acertou!");

		} while (!nome.equalsIgnoreCase("Francisco"));
		*/

		sc.close();
	}

}
