package week2_exerc1;

public class SalarioEmpregado extends Empregado {

	private int codigoFuncionario;
	private double valorSalario;
	

	// codigo
	public int getCodigoFuncionario() {
		return super.getId();
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		if (super.getId() != codigoFuncionario) {
			super.setId(codigoFuncionario); 
		}

	}

	// Valor Salario
	public String getValorSalario() {
		return "Valor do salário " + valorSalario;
	}

	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public String calcularFolhaPagamento(int idFunc) {
		//apliquei de forma simplificada a regra do INSS para desconto e com isso gerar folha de pagamento
		double descontoINSS, salarioCorrigido;
		if (super.getId() == idFunc) {
			if (this.valorSalario <= 1212.00) {
				descontoINSS = this.valorSalario*0.075;
				salarioCorrigido = this.valorSalario - descontoINSS;
				return "Seu salário este mês é de: " + salarioCorrigido;
			} else if ((this.valorSalario>1212.0) && (this.valorSalario<=2427.35)){
				descontoINSS = this.valorSalario*0.09;
				salarioCorrigido = this.valorSalario - descontoINSS;
				return "Seu salário este mês é de: " + salarioCorrigido;
			}else if((this.valorSalario>2427.35) && (this.valorSalario<=3641.03)) {
				descontoINSS = this.valorSalario*0.12;
				salarioCorrigido = this.valorSalario - descontoINSS;
				return "Seu salário este mês é de: " + salarioCorrigido;
			}else {
				descontoINSS = this.valorSalario*0.14;
				salarioCorrigido = this.valorSalario - descontoINSS;
				return "Seu salário este mês é de: " + salarioCorrigido;
			}
		}
		return "Funcionário não encontrado";

	}

}
