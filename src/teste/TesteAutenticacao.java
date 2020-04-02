package teste;
import funcionario.Supervisor;
import funcionario.Gerente;
import funcionario.Administrador;
import funcionario.SistemaInterno;

public class TesteAutenticacao {
	
	public static void main(String[] args) {
		
		Supervisor gerente = new Gerente();
		gerente.setSenha(2222);	
				
		Supervisor adm = new Administrador();
		adm.setSenha(3333);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gerente);
		si.autentica(adm);
		
	}
}
