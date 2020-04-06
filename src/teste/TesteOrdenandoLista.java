package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import conta.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class TesteOrdenandoLista {

        public static void main(String[] args) {
        	
            Conta cc1 = new ContaCorrente(24, 33);
            Cliente clienteCC1 = new Cliente();
            clienteCC1.setNome("Nico");
            cc1.setTitular(clienteCC1);
            cc1.deposita(333.0);

            Conta cc2 = new ContaPoupanca(25, 44);
            Cliente clienteCC2 = new Cliente();
            clienteCC2.setNome("Guilherme");
            cc2.setTitular(clienteCC2);
            cc2.deposita(444.0);

            Conta cc3 = new ContaCorrente(32, 11);
            Cliente clienteCC3 = new Cliente();
            clienteCC3.setNome("Paulo");
            cc3.setTitular(clienteCC3);
            cc3.deposita(111.0);

            Conta cc4 = new ContaPoupanca(12, 22);
            Cliente clienteCC4 = new Cliente();
            clienteCC4.setNome("Ana");
            cc4.setTitular(clienteCC4);
            cc4.deposita(222.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(cc1);
                lista.add(cc2);
                lista.add(cc3);
                lista.add(cc4);
                
                for (Conta conta : lista) {
					System.out.println(conta);
				}
                
                // como que vai organizar a lista
                //lista.sort(new TitulardaContaComparator());
                
                Collections.sort(lista);
                /*
                 * Explorando métodos usando collections
                 * Collections.sort(lista);
                 * Collections.reverse(lista);
                 * Collections.shuffle(lista);
                 * Collections.rotate(lista, 5) // rotacionar 5 posições
                 */
                System.out.println("-------");
                
                for (Conta conta : lista) {
					System.out.println(conta + ", " + conta.getTitular().getNome());
				}
        }
}
		
		class TitulardaContaComparator implements Comparator<Conta>{
			
			@Override 
			public int compare(Conta c1,Conta c2) {
				
				String nomeC1 = c1.getTitular().getNome();
				String nomeC2 = c2.getTitular().getNome();
				// método pronto pra organizar em ordem alfabética
				return nomeC1.compareTo(nomeC2);
			}
		}
        class NumerodaContaComparator implements Comparator<Conta>{
        	
        	@Override
        	public int compare(Conta c1, Conta c2) {
        		// método pronto pra organizar em ordem numérica
        		return Integer.compare(c1.getNumero(), c2.getNumero());
        	}     	
        	
        }

