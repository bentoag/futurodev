package week2_exerc1;

public class Programa {

	public static void main(String[] args) {
		//Super Classe
		Empregado bento = new Empregado();
		bento.setId(1234); 
		bento.setNome("Bento Almeida Gonzaga");
		System.out.println("---- BENTO ----");
		System.out.println("ID:" + bento.getId());
		System.out.println("Nome: " + bento.getNome());
		bento.trabalhar();
		bento.irEmbora();
		bento.tirarFolga();
		//Classe SalarioEmpregado
		SalarioEmpregado salarioBento = new SalarioEmpregado();		
		salarioBento.setCodigoFuncionario(bento.getId());
		salarioBento.setValorSalario(5000.0);
		System.out.println(salarioBento.getCodigoFuncionario());
		System.out.println(salarioBento.getValorSalario());
		System.out.println(salarioBento.calcularFolhaPagamento(bento.getId()));
		
		//Classe Secretaria
		Secretaria maria = new Secretaria();		
		maria.setId(2435);
		maria.setNome("Maria Aparecida de Jesus");
		maria.setValorSalario(2300.0);
		maria.setQtdAnosEmpresa(6);
		System.out.println("\n----MARIA----");
		System.out.println(maria.getCodigoFuncionario());
		System.out.println(maria.getId());
		System.out.println(maria.getNome());
		System.out.println(maria.getValorSalario());
		System.out.println(maria.getQtdAnosEmpresa());
		System.out.println(maria.calcularFolhaPagamento(maria.getId()));
		maria.atenderCliente();
		maria.realizarLigacao();
		
		//Classe FuncionarioHorista
		FuncionarioHorista pedro = new FuncionarioHorista();
		
		pedro.setCNPJ("76.949.838/0001-98");
		pedro.setId(9902);
		pedro.setNome("Pedro Alvares Cabral");
		pedro.setTaxa(2.11);
		System.out.println("\n----PEDRO----");
		System.out.println(pedro.getCNPJ());
		System.out.println(pedro.getId());
		System.out.println(pedro.getNome());
		System.out.println(pedro.getTaxa());
		System.out.println(pedro.calcularTaxas());
		System.out.println(pedro.emitirNota());		

	}

}
