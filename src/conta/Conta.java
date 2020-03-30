package conta;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    public Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;

    }

    public abstract void deposita(double valor); 

	public void saca(double valor) {
		
		  if(this.saldo < valor) {
	            throw new SaldoInsuficienteException("SALDO INSUFICIENTE! Saldo atual: " + this.saldo + ", Valor a sacar: " + valor);
	        } 
		  
		  this.saldo -= valor;
	}
   

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }
    
    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
     }
    public int getAgencia(){
        return this.agencia;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    @Override
    public String toString() {
        return " Numero: " + this.numero + ", Agencia: " + this.agencia;
    }

}