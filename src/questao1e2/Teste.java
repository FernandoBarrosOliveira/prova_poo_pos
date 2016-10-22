package questao1e2;

public class Teste {

	public static void main(String[] args) {
		Funcionario funcionario;
		Empresa empresa = new Empresa("Matriz");
		try{			
			funcionario = new Funcionario(1, "Fernando");
			empresa.admitirFuncionario(funcionario);
			
			funcionario = new Funcionario(2, "Joao");
			empresa.admitirFuncionario(funcionario);
			
			funcionario = new Funcionario(3, "Alvares");
			empresa.admitirFuncionario(funcionario);
			
			funcionario = new Terceirizado(4, "Cabral", "Empresa de Terceirização");
			empresa.admitirFuncionario(funcionario);
			
			empresa.pagarTodosFuncionario();
			
			empresa.demitirFuncionarnio(1);
			
			funcionario = new Terceirizado(5, "Brasil", "Empresa de Terceirização");
			empresa.admitirFuncionario(funcionario);
			
			funcionario = new Terceirizado(6, "Brasil", "Empresa de Terceirização");
			empresa.admitirFuncionario(funcionario);
			
			funcionario = new Terceirizado(6, "Brasil", "Empresa de Terceirização");
			empresa.admitirFuncionario(funcionario);
			
		}catch (ProibidaAdmissaoException  e){
			System.out.println(e.getMessage()+ ":  Funcionario: "  + e.getNomefuncionario());
			
		}
		
	}

}
