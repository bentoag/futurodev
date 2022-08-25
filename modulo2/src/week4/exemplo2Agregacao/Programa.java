package week4.exemplo2Agregacao;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante estudante1 = new Estudante("Maria", 1, "Departamento 1");
		Estudante estudante2 = new Estudante("Pedro", 2, "Departamento 1");
		Estudante estudante3 = new Estudante("Joana", 1, "Departamento 2");
		Estudante estudante4 = new Estudante("Marcelo", 2, "Departamento 2");
		
		
		List<Estudante> departamento1_estudantes = new ArrayList<Estudante>();
		
		departamento1_estudantes.add(estudante1);
		departamento1_estudantes.add(estudante2);
		
		List<Estudante> departamento2_estudantes = new ArrayList<Estudante>();
		
		departamento2_estudantes.add(estudante3);
		departamento2_estudantes.add(estudante4);
		
		Departamento departamento1 = new Departamento("Departamento 1", departamento1_estudantes);
		Departamento departamento2 = new Departamento("Departamento 2", departamento2_estudantes);
		
		List<Departamento> departamentos = new ArrayList<Departamento>();
		
		departamentos.add(departamento1);
		departamentos.add(departamento2);
		
		Instituto instituto = new Instituto("Nome Instituto", departamentos);
		
		System.out.println("Total de estudantes do instituto: " + instituto.obterTotalEstudantesInstituto());
		
	}
}