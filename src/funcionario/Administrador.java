package funcionario;
public class Administrador extends Supervisor {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do ADMINISTRADOR");
		return super.getSalario();
	}
}
