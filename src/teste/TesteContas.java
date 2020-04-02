package teste;

import conta.CalculoImposto;
import conta.ContaCorrente;
import conta.Cliente;
import conta.ContaPoupanca;
import conta.SegurodeVida;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(16, 567854);
		cc.titular = new Cliente();
		cc.titular.setNome("João"); //composição
		
		cc.deposita(32.0);
		System.out.println("CC:" + cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(11, 532618);
		cp.titular = new Cliente();
		cp.titular.setNome("João");

		cp.deposita(52.0);
		System.out.println("Deposita --------");
		System.out.println("CP:" + cp.getSaldo());
			
		cc.transfere(2.0, cp);
		System.out.println("Transferência --------");
		System.out.println("Titular:" + cc.titular.getNome());
		System.out.println("CC:" + cc.getSaldo());
		System.out.println("CP:" + cp.getSaldo());
		
		SegurodeVida seguro = new SegurodeVida();
		
		CalculoImposto impostoapagar = new CalculoImposto();
		impostoapagar.calcularImposto(cc);
		impostoapagar.calcularImposto(seguro);
		
		System.out.println("Imposto:" + impostoapagar.getTotalImposto());
		
		System.out.println("Contas Registradas no bytebank:");
		System.out.println(cc);
		System.out.println(cp);
		
		//EXCEÇÕES
		try {
			cc.saca(300.0);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	
	}
	
}
