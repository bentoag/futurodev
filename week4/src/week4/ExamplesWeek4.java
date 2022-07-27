package week4;

import java.util.ArrayList;

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
		
		ArrayList<ArrayList<String>> nomes = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> nomesDoFrancisco = new ArrayList<String>();
		nomesDoFrancisco.add("Francisco");
		nomesDoFrancisco.add("Werther");
		nomesDoFrancisco.add("Santana");
		
		nomes.add(nomesDoFrancisco);
		System.out.println(nomes);
		

	}

}
