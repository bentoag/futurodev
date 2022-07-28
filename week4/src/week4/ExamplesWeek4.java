package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
 * @Autor: Bento Almeida Gonzaga
 */
public class ExamplesWeek4 {

	public static void main(String[] args) {
/*	int anosDeCopa [] = {2022, 2018, 2014, 2010, 2006, 2002, 1998, 1994};
		String [] carros = new String[5];
		
		System.out.println("tamanho vetor anos: " + anosDeCopa.length);
		
		System.out.println("Primeiro item do array: " + anosDeCopa[0]);
		System.out.println("Último item do array: " + anosDeCopa[anosDeCopa.length - 1]);
		
		System.out.println("tamanho vetor carros: " + carros.length);
	*/
	
		/*
		String [][] nomesAlunos = new String[5][2];
		
		nomesAlunos[0][0]= "Francisco";
		nomesAlunos[0][1]= "Santana";
		nomesAlunos[1][0]= "Bento";
		nomesAlunos[1][1]= "Gonzaga";
		nomesAlunos[2][0]= "Helenna";
		nomesAlunos[2][1]= "Targino";
		nomesAlunos[3][0]= "Helenna";
		nomesAlunos[3][1]= "Felisbino";
		nomesAlunos[4][0]= "Helenna";
		nomesAlunos[4][1]= "Gonçalves";
		
		for (int i = 0; i < nomesAlunos.length; i++) {
			System.out.println("Estou procurando na linha: " + i);
			if(!nomesAlunos[i][0].equals("Helenna")) {
				continue;
			}
			
			System.out.println("Essa linha parece promissora, temos uma Helenna. ");
			
			if(nomesAlunos[i][1].equals("Targino")) {
				System.out.println("Achei a Helenna Targino!");
			}else {
				System.out.println("Achei outra Helena" + " Helenna " + nomesAlunos[i][1]);
			}		
		}
		*/
		/*Estruturas de dados
		 * Listas: metodos .add() - Adicionar 
		 * 				   .get() - recuperar elemento no indice
		 * 				   .size() - Tamanho
		 * 			       .clear() - limpar
		 * 				   .indexOf(elemento) - retorna o indice do elemento
		 * 				   .sort(lista) - Ordernar a lista
		 *                 .remove(index) - remove o elemento do indice passado
		 
		ArrayList<ArrayList<String>> nomes = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> nomesDoFrancisco = new ArrayList<String>();
		nomesDoFrancisco.add("Francisco");
		nomesDoFrancisco.add("Werther");
		nomesDoFrancisco.add("Santana");
		
		nomes.add(nomesDoFrancisco);
		System.out.println(nomes);
		*/
	
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<>();
		int numero=-1, maior=-9999999, menor=9999999;
		//inserir elementos na lista
		
		do {
			System.out.print("Digite um numero: ");
			numero=Integer.parseInt(input.nextLine());
			if(numero!=0) {
				lista.add(numero);
			}
			
		} while (numero!=0);
		
		System.out.println("*** Os números inseridos foram ***");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
			if(lista.get(i) > maior){
				maior =lista.get(i) ;
				}
			if(lista.get(i) < menor){
				menor =lista.get(i) ;
				}
		} 
		System.out.println("\n"+ "O maior é: " +  maior);
		System.out.println("\n"+ "O menor é: " +  menor);
	
//		List<String> listaNomes = new ArrayList<>();
//		
//		listaNomes.add("João");      // 0
//		listaNomes.add("Maria");     // 1
//		listaNomes.add("Eduardo");   // 2
//		listaNomes.add("Silvana");   // 3
//		listaNomes.add("Mario");     // 4 
//		
//		System.out.println("ArrayList: " + listaNomes);
		
		//Pilhas: LIFO Last in first out
		// Instância de objeto da classe Pilha
		
//				Stack<String> pilhaCarros = new Stack<>();
//				
//				// Adiciona itens na pilha e sua respectivas posições
//				pilhaCarros.push("HRV");                // 0  // 5
//				pilhaCarros.push("Golf");               // 1  // 4
//				pilhaCarros.push("Polo");               // 2  // 3
//				pilhaCarros.push("Camaro");             // 3  // 2
//				pilhaCarros.push("Tiggo 8X Turbo");     // 4  // 1
				
				//System.out.println(pilhaCarros);
				//pilhaCarros.clear(); // Limpar a nossa pilha
				// pilhaCarros.pop(); // remover item da pilha
				
				// Impressão em tela
				// System.out.println("Pilha: " + pilhaCarros.search("Golf")); // Distância
				
				// Utilizando operador ternário
				//System.out.println(pilhaCarros.isEmpty() ? "Pilha Vazia" : "Pilha com elementos"); // Usar o método que retorna um booleano, para imprimir em tela;
	}

}
