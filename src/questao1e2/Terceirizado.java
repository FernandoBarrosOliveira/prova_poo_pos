package questao1e2;

public class Terceirizado extends Funcionario {
	
	private Empresa empresaTerceirizadora;
	
	public Terceirizado(int matricula, String nome, String nomeEmpresaTerceirizadora){
		super(matricula, nome);
		this.empresaTerceirizadora = new Empresa(nomeEmpresaTerceirizadora);
	
	}
	
	public void receberValeTransporte(){
		System.out.println("Funcionario: " + this.getNome() + " Recebendo vale transporte.");
	}
	
	public void receberValeAlimentacao(){
		System.out.println("Funcionario: " + this.getNome() + " Recebendo vale alimentação.");
	}
	
	
}
