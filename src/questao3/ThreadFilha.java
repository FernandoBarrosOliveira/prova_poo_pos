package questao3;


public class ThreadFilha implements Runnable {
	
	private Empregado empregados[];
	
	ThreadFilha (Empregado[] empregados){
		this.empregados = empregados;		
	}
	@Override
	public void run() {
		int quantidade = 0;	
		for (int i =0; i <= empregados.length -1 ; i++ ){
			if (empregados[i].percentualComissao()< 20){
				quantidade ++; 				
			}
		}
		System.out.println("Total de funcionario com comissão abaixo de 20%: " + quantidade);
		
	}

}
