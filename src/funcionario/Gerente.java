package funcionario;

public class Gerente extends Supervisor {


	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		return super.getSalario();
	}


}
