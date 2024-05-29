
public class Main {

	public static void main(String[] args) {
		
		Cliente eduardo = new Cliente();
		eduardo.setNome("Eduardo");
		eduardo.setCpf("123.123.123-45");
		
		IConta cc = new ContaCorrente(eduardo);
		IConta poupanca = new ContaPoupanca(eduardo);
		
		cc.depositar(100);
		cc.transferir(90, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
