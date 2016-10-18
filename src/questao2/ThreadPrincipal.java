package questao2;
import java.util.Random;

public class ThreadPrincipal implements Runnable{
	
	Empregado empregados[]; 

	void executandoEIniciaThreadFilha(){
		ThreadFilha filha = new ThreadFilha(empregados);
		Thread t = new Thread(filha);
		t.start();
	}
	
	void preencheArray(){
		double limitiIncial = 880.00;
		double limitiFinal = 10000.00;
		Random randomGenerator = new Random();
		for(int i = 0; i <=1000; i++){
			double salario = limitiIncial + (randomGenerator.nextDouble() * (limitiFinal + limitiIncial));
			double  comissao = salario * randomGenerator.nextInt(50);  
			empregados[i] =  new  Empregado(salario,comissao);			
		}		
	}
	
	void somaSalarioEImprime(Empregado empregados[]){
		double somatorio = 0;
		for (Empregado empregado:empregados){
			somatorio = somatorio + empregado.salarioBruto();					
		}
		System.out.println("Total de salario brutos: " + somatorio);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		executandoEIniciaThreadFilha();
		somaSalarioEImprime(empregados);			
	}
	
	

}
