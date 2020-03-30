package conta;
public class CalculoImposto {
	
	private double totalImposto;
	
	public void calcularImposto(Tributacao valor) {
		double imposto = valor.getImposto();
		this.totalImposto += imposto;	
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
