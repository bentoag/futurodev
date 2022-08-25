package week2_banco;
import java.util.ArrayList;
import java.util.List;

public class Banco {
	List<Conta> contas = new ArrayList<>();

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	Conta achaConta(String numeroConta) {
		for (Conta conta : this.contas) {
			if (conta.getNumero().equals(numeroConta)) {
				return conta;
			}
		}

		return null;
	}

	boolean transferencia(String numContaOrigem, String numContaDestino, double valor) {

		// Verifica se a conta de origem existe;
		Conta contaOrigem = achaConta(numContaOrigem);
		// Verifica se a conta de destino existe;
		Conta contaDestino = achaConta(numContaDestino);

		if (contaOrigem == null) {
			System.out.println("Conta de origem não existe!");
			return false;
		}

		if (contaDestino == null) {
			System.out.println("Conta de destino não existe!");
			return false;
		}

		if (contaOrigem.getSaldo() < valor) {
			System.out.println("Conta de origem não possui saldo suficiente!");
			return false;
		}

		contaOrigem.saque(valor);
		contaDestino.deposito(valor);
		return true;		
		
	}

}
