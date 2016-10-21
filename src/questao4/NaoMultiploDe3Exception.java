package questao4;

public class NaoMultiploDe3Exception extends Exception {
	private int linha;
	private int coluna;
	
	public int getLinha() {
		return linha;
	}
	public int getColuna() {
		return coluna;
	}
	
	public NaoMultiploDe3Exception(int linha, int coluna){
		super("Erro elemento não é mutiplo de 3");
		this.linha = linha;
		this.coluna = coluna;		
	}
	
	
	
}
