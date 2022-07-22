package estruturas_de_repeticao;

import java.util.Scanner;

public class Desafios {

	public static void main(String[] args) {
		// int numero=0, fatorial = 1;
		Scanner sc = new Scanner(System.in);	
		// Fatorial
//		System.out.print ("Escreva um numero: ");
//		numero=sc.nextInt();
//		
//		for (int i = numero; i >=1; i--) {
//			fatorial *= i;
//		}
//		System.out.println(fatorial);

		//Exemplo 2 - Numeros unicos
//		int vetor[] = new int[] { 1, 1, 3, 5, 7, 8, 3 };
//
//		for (int i = 0; i < vetor.length; i++) {
//			boolean repetiu = false;
//
//			for (int j = 0; j < vetor.length; j++) {
//				if (i == j) {
//					continue;
//				}
//				if (vetor[i] == vetor[j]) {
//					repetiu = true;
//					break;
//				}
//			}
//			if (repetiu == false) {
//				System.out.println(vetor[i]);
//			}
//
//		}
//	
		
		//Exemplo 3: Palindromo
		String palavra = "Arara";
		String palavraInvertida="";
		
		for (int i = palavra.length()-1; i >=0; i--) {
			char caracterDaVez = palavra.charAt(i);
			palavraInvertida+=caracterDaVez;
			
		}
		if(palavra.equalsIgnoreCase(palavraInvertida)) {
			System.out.println("É palindromo!");
		}else {
			System.out.println("Não é palindromo");
		}
		
		sc.close();
	}

}
