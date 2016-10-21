package questao4;

import javax.print.attribute.standard.NumberOfDocuments;

public class MutiploDe3 {
	
	private static boolean numeroMutiplo3(int numero){
		return numero%3 ==0; 		
	}
	
	static void testarMutiplosDe3(int [][] matriz) throws NaoMultiploDe3Exception{ 
		for(int linha = 0 ; linha < matriz.length; linha++ ){
			for(int coluna = 0 ; coluna < matriz[linha].length; coluna++ ){
				if (! numeroMutiplo3(matriz[linha][coluna])){
					throw new NaoMultiploDe3Exception(linha, coluna);
				}
			}				
		}
		
	}

	public static void main(String[] args) {
		
		//inicializar a matriz
		int [][] matriz = {
			{3,6},
			{9,2}
		};
	
		try{
			testarMutiplosDe3(matriz);						
		}catch (NaoMultiploDe3Exception e){
			System.out.println(e.getMessage()+ ":  linha = "+e.getLinha() +" / coluna =  " + e.getColuna());
		}
		
		

	}

}
