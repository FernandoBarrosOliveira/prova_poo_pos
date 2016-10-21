package questao1e2;

public class ProibidaAdmissaoException extends Exception {
	private String Nomefuncionario;

		
	public String getNomefuncionario() {
		return Nomefuncionario;
	}


	public ProibidaAdmissaoException(String Nomefuncionario){
		super("Funcionario não pode ser admitido");	
		this.Nomefuncionario = Nomefuncionario;
		
	}
	
	

}
