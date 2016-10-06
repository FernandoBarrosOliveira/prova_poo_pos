package questao1;

import java.util.ArrayList;

public class Empresa {
	private String nome;
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Empresa (String nome){
		this.nome = nome;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	private boolean passivelAdmissao(Terceirizado Terceirizado){
		int totalFuncionario = funcionarios.size();
		int totalTerceirizado =0;
		for (int i =0 ; i < funcionarios.size(); i++){
			totalTerceirizado ++;
			
		}
	
		double percentagemTerceirizado = (totalTerceirizado/totalFuncionario)*100;
		
		if (percentagemTerceirizado <=30){
			return true;
		}else
			return false;
		
	}
	
	public void admitirFuncionario(Funcionario funcionario){
		// testar se quantidade de terceirizado não ultrapassa os 30%
		if (funcionario instanceof Terceirizado){
			if ( ! passivelAdmissao((Terceirizado) funcionario)){				
				System.out.println("Funcionario terceirizado não pode ser admitido");
				return; // levantar uma exceção aqui
			}			
		}
		
		funcionarios.add(funcionario);
		System.out.println("Funcionario admitido com sucesso");						
	}
	
	public void demitirFuncionarnio(int matricula){
		// localizar o funcionairo e retira-lo da lista
		for (int i =0 ; i < funcionarios.size(); i++){
			if (funcionarios.get(i).getMatricula() == matricula){
				funcionarios.remove(i);
				System.out.println("Funcionario demitido com sucesso");
				break;
			}						
		}		
	}
	
	private void pagarFuncionario(Funcionario funcionario){	
		funcionario.receberSalario();
		if (funcionario instanceof Terceirizado){
			((Terceirizado) funcionario).receberValeAlimentacao();
			((Terceirizado) funcionario).receberValeTransporte();						
		}
	}
	
	public void pagarTodosFuncionario(){
		// percorrer lista invocando metodo receber salario do funcionario
		for (int i =0 ; i < funcionarios.size(); i++){
			pagarFuncionario(funcionarios.get(i));
		}
		
	}
	
	
	

}
