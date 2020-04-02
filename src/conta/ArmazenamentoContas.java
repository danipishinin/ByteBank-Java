package conta;

public class ArmazenamentoContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public ArmazenamentoContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public int getTamanho() {
		return this.posicaoLivre;
	}
	
	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}
