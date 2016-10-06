package questao1;

public class Terceirizado extends Funcionario {
	
	private Empresa empresaTerceirizadora;
	
	public Terceirizado(int matricula, String nome, String nomeEmpresaTerceirizadora){
		super(matricula, nome);
		this.empresaTerceirizadora = new Empresa(nomeEmpresaTerceirizadora);
	
	}
	
	public void receberValeTransporte(){
		System.out.println("Recebendo vale transporte.");
	}
	
	public void receberValeAlimentacao(){
		System.out.println("Recebendo vale alimentação.");
	}
	
	
}
