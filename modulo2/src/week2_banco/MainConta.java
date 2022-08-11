package week2_banco;

public class MainConta {

	public static void main(String[] args) {
		Conta contaBento = new Conta();
		System.out.println(contaBento.getSaldo());
		contaBento.deposito(699.0);
		System.out.println(contaBento.getSaldo());
		contaBento.saque(700.0);
		System.out.println(contaBento.getSaldo());
		contaBento.saque(300.0);
		System.out.println(contaBento.getSaldo());
		contaBento.saque(100.0);
		System.out.println(contaBento.getSaldo());
		
		System.out.println("-----CONTA PJ -----");
		ContaPJ contaPJ = new ContaPJ();
		System.out.println(contaPJ.getSaldo());
		System.out.println(contaPJ.limiteEmprestimo);
		System.out.println("Saque sem saldo - utilizando o Limite emprestimo");
		contaPJ.saque(250.0);
		System.out.println(contaPJ.getSaldo());
		System.out.println(contaPJ.limiteEmprestimo);
				
	}

}
