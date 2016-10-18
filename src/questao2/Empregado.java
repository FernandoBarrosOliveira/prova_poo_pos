package questao2;

public class Empregado {
	
	private double salarioLiquido;
	private double comissao;
	
	Empregado (Double salarioLiquido, double comissao){
		this.salarioLiquido = salarioLiquido;
		this.comissao = comissao;
	}
	
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
	 
	 public double percentualComissao(){
		 return (this.comissao/this.salarioLiquido) * 100;
	 }

}
