package questao3;
import java.util.Random;
import java.text.NumberFormat;
public class ThreadPrincipal implements Runnable{
	
  private Empregado[] empregados = new Empregado[1000]; 
	
   void preencheArray(){
		
		double limitiIncial = 880.00;
		double limitiFinal = 10000.00;
		Random randomGenerator = new Random();
		for(int i = 0; i < empregados.length; i++){
			double salario = limitiIncial + (randomGenerator.nextDouble() * (limitiFinal + limitiIncial));
			double  comissao = salario * randomGenerator.nextInt(50);  
			empregados[i] =  new  Empregado(salario,comissao);			
		}	
		
	}
	
	void somaSalarioEImprime(Empregado[] empregados){
		double somatorio = 0;
		System.out.println(empregados.length);
		for (int i =0; i <= empregados.length -1 ; i++ ){			
				somatorio = somatorio + empregados[i].salarioBruto();		
		}
			System.out.println("Total de salario brutos: " + NumberFormat.getCurrencyInstance().format(somatorio) );
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ThreadFilha filha = new ThreadFilha(empregados);
		Thread t = new Thread(filha);
		t.start();
		somaSalarioEImprime(empregados);			
	}
	
	public static void main(String[] args) {
		
		ThreadPrincipal principal = new ThreadPrincipal();
		Thread t = new Thread(principal);
		principal.preencheArray();		
		t.start();
	

	}
	
	

}
