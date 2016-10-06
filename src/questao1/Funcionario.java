package questao1;

public class Funcionario implements Trabalhador {
	private int matricula;
	private String nome;
	
	Funcionario(){
		
	}
	
	Funcionario(int matricula){
		this.matricula = matricula;
	}
	
	Funcionario(int matricula, String nome){
		this(matricula);
		this.nome = nome;
	}
	

	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void receberSalario(){
		System.out.println("Recebendo salário");
	}
	
	
}
