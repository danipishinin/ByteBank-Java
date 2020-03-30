package funcionario;

public class SistemaInterno {
	
	private int senha = 2222;
	public void autentica(Supervisor supervisor) {
		boolean autenticou = supervisor.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso permitido!");
		}
		else {
			System.out.println("Acesso negado!");
		}
	}
}
