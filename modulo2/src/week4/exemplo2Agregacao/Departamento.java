package week4.exemplo2Agregacao;

import java.util.List;

public class Departamento {
	String nome;
	
	private List<Estudante> estudantes;

	public Departamento(String nome, List<Estudante> estudantes) {
		super();
		this.nome = nome;
		this.estudantes = estudantes;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}
}
