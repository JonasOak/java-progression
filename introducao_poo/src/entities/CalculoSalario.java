package entities;

public class CalculoSalario {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void aumentoSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	public String toString() {
		return "Dados: " + name
			  + ", R$" + String.format("%.2f", salarioBruto);
	}
}
