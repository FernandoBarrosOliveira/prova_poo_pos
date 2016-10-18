package questao2;

import java.util.ArrayList;

public class ThreadFilha implements Runnable {
	
	private Empregado empregados[];
	
	ThreadFilha (Empregado[] empregados){
		this.empregados = empregados;		
	}
	@Override
	public void run() {
		int quantidade = 0;
		for (Empregado empregado:empregados){
			if (empregado.percentualComissao()< 20){
				quantidade ++; 				
			}
		}
		System.out.println("Total de funcionario com comissão abaixo de 20%: " + quantidade);

	}

}
