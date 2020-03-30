package conta;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
		
	}
	
	@Override
	public void saca(double valor) {
		double valorAsacar = valor + 0.2;
		super.saca(valorAsacar);
	}
	
	@Override
	public String toString() {
		return "Conta Poupança:" + super.toString();	
	}

}
