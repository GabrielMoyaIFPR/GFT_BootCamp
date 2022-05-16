package desafioFinalBanco;

public class MainBanco {

	public static void main(String[] args) {
		Cliente moya = new Cliente();
		moya.setNome("Moya");		
		
		Conta cc = new ContaCorrente(moya);
		cc.depositar(100);
		cc.imprimirExtrato();
		
		
		
		Conta poupanca = new ContaPoupanca(moya);		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
	}

}
