package mod5Polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		TestePolimorfismo.imprimirSaldo(conta);
		//---------------------------------------------
		
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		//contaCorrente.getSaldo();  no esta en conta
		imprimirSaldo(contaCorrente);
		
		//----------------------------------------------
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);
		
		

	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: " + conta.getSaldo());
		
		if(conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente)conta;
			System.out.println("O limite e: " + cc.getLimite());
		}
		
		if(conta instanceof ContaPoupanca) {
			ContaPoupanca cc = (ContaPoupanca)conta;
			System.out.println("O rendimento e: " + cc.getRendimentos());
		}
	}

}
