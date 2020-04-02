package teste;

import java.util.ArrayList;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class TesteArrayList {
	public static void main(String[] args) {
		
		ArrayList<Conta> lista= new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(21,31);
		lista.add(cc1);
		
		Conta cp = new ContaPoupanca(55,35);
		lista.add(cp);
		
		Conta cp1 = new ContaPoupanca(55,35);
		lista.add(cp1);
		
		// contains compara o conteúdod entro do objeto
		boolean existe = lista.contains(cp1);
		System.out.println(existe);
		
		// varrer toda lista
		
		for(Conta ref : lista) {
			System.out.println(ref);
		}
		
		
	}
}
