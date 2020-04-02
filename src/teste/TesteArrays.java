package teste;
import conta.Conta;
import conta.ContaCorrente;
import conta.ArmazenamentoContas;
import conta.Cliente;

public class TesteArrays {
	
	public static void main(String[] args) {
		
		// int []idade = new int[4];
		Conta[] contas = new Conta[4];
		
		ContaCorrente cc1 = new ContaCorrente(22,11);
		System.out.println(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(33,44);
		System.out.println(cc2);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[0].getAgencia());
		
		//Array do tipo Object
		
		Cliente clienteNormal = new Cliente();
		clienteNormal.setNome("Flavio");

		Cliente clienteVip = new Cliente();
		clienteVip.setNome("Romulo");

		Object[] refs = new Object[5];
		refs[0]  = clienteNormal;
		refs[1]  = clienteVip;

		System.out.println(((Cliente) refs[1]).getNome());
		
		System.out.println("Contas Registradas no bytebank:");
		
		ArmazenamentoContas bdContas = new ArmazenamentoContas();
		
		Conta cc3 = new ContaCorrente(22,12);
		bdContas.adiciona(cc3);
		
		int tamanho = bdContas.getTamanho();
		System.out.println(tamanho);
		
		Conta ref = bdContas.getReferencia(0);
		System.out.println(ref.getNumero());
		
		
		
	}
}
