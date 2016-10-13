package questao2;

public class Empregado {
	
	private double salarioLiquido;
	private double comissao;
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	 public double salarioBruto(){
		 return this.salarioLiquido + this.comissao;
		 
	 }

}
