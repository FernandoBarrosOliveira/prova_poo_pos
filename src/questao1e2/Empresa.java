package questao1e2;

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
	
	private boolean passivelAdmissao(){
		// inicia com pelo menos um terceirizado, já que o esse metodo é chamando somente se for terceirizado e ele ainda não foi admitido
		int totalTerceirizado = 1;
		int totalFuncionario = funcionarios.size() + totalTerceirizado;
		for (int i =0 ; i < funcionarios.size(); i++){			
			if (funcionarios.get(i) instanceof Terceirizado){				
				totalTerceirizado ++;
			}			
		}	
		double percentagemTerceirizado = ((double)totalTerceirizado/(double)totalFuncionario) * 100;
			
		if (percentagemTerceirizado <=30){
			return true;
		}else
			return false;		
	}
	
	public void admitirFuncionario(Funcionario funcionario) throws ProibidaAdmissaoException {
		// testar se quantidade de terceirizado não ultrapassa os 30%
		if (funcionario instanceof Terceirizado){
			if ( ! passivelAdmissao()){				
				throw new ProibidaAdmissaoException(funcionario.getNome());
			}			
		}		
		funcionarios.add(funcionario);
		System.out.println("Funcionario " + funcionario.getNome() + " admitido com sucesso");						
	}
	
	public void demitirFuncionarnio(int matricula){
		// localizar o funcionairo e retira-lo da lista
		for (int i =0 ; i < funcionarios.size(); i++){
			if (funcionarios.get(i).getMatricula() == matricula){
				funcionarios.remove(i);
				System.out.println("Funcionario " + funcionarios.get(i).getNome() + " demitido com sucesso");
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
