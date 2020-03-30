package funcionario;

public class Supervisor extends Funcionario implements Relatorio {
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void getGerarRelatorio() {
		// TODO Auto-generated method stub
		System.out.println("Gerando relatório...");
	}	
}
