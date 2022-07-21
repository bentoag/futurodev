package estruturas_de_repeticao;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		/*
		 * //Exemplo 1: Vetores de notas
		int [] notas;
		int numAvaliacoes = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Quantas avaliações aplicadas?");
		numAvaliacoes = sc.nextInt();
		notas = new int[numAvaliacoes];
		
		for (int i = 1; i <=numAvaliacoes; i++) {
			System.out.println("Digite a " + i + "ª nota");
			notas[i-1]=sc.nextInt();	
			
		}
		for (int i = 0; i <notas.length; i++) {
			System.out.print(notas[i] + " ");

			
		}
		 */
		//Exemplo algarismos número inteiro
//		int numero=0, dez = 0, uni = 0, cent=0;		
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Digite um número qualquer:  ");
//		numero = sc.nextInt();
//				
//		
//			if(numero<=9) {
//				uni=numero;
//			}else if (numero <=99) {				
//				dez = ((numero%100)/10);
//				uni =numero%10;
//			}else if (numero <=999) {
//				cent=((numero/100)%10);
//				dez = ((numero/10)%10);
//				uni =(numero%10);					
//			
//			}
//		
//		
//		System.out.println("Unidade:  " + uni);
//		System.out.println("Dezena: " + dez);
//		System.out.println("Centena:  " + cent);
		
		
		int [] [] alunosPorNota = new int[5][4];
		String nome;
		Scanner sc= new Scanner(System.in);
		
		for (int i = 0; i < alunosPorNota.length; i++) {
			System.out.println("Digite o nome do Aluno " + i);
			nome = sc.nextLine();
			for (int j = 1; j < alunosPorNota.length; j++) {
				System.out.println("Digite a avaliação " + j);
			}
			
			
		}
		
		
		sc.close();
		
	}

}
