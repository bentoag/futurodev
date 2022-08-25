package week4.exemplo2Agregacao;

import java.util.Iterator;
import java.util.List;

public class Instituto {
	String nomeInstituto;
	
	private List<Departamento> departamentos;

	public Instituto(String nomeInstituto, List<Departamento> departamentos) {
		super();
		this.nomeInstituto = nomeInstituto;
		this.departamentos = departamentos;
	}
	
	public int obterTotalEstudantesInstituto() {
		int qtdEstudante = 0;
		List<Estudante> estudantes;
		
		for (Departamento departamento : departamentos) {
			estudantes = departamento.getEstudantes();
			
			for (Estudante estudante : estudantes) {
				qtdEstudante = qtdEstudante + 1;
			}
		}
		
		return qtdEstudante;
	}
	
}
