package week4;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		int qtdNumeros = 0, posicao=-1;
		double maior = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quantos n�meros voc� deseja inserir: ");
		qtdNumeros = sc.nextInt();

		double vetorNumeros[] = new double[qtdNumeros];

		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "� n�mero: ");
			vetorNumeros[i] = sc.nextDouble();
			
			if(vetorNumeros[i]> maior) {
				maior=vetorNumeros[i];
				posicao = i;
			}else {
				continue;
			}
		}
		
		System.out.println("Maior valor: " + maior + "\n" + "Posi��o do maior valor: " + posicao);
		sc.close();
	}

}
