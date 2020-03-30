package conta;

public class ContaCorrente extends Conta implements Tributacao {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
		
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorAsacar = valor + 0.2;
		super.saca(valorAsacar);
	}
	
	@Override
	public double getImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.1;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente:" + super.toString();		
	}
}
