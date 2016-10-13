package questao2;

public class ThreadPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadFilha runner = new ThreadFilha();
		Thread t = new Thread(runner);
		t.start();		
		
		

	}

}
