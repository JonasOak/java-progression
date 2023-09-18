package entities;

public class ContaBanco {
	
	private int numeroConta;
	private String nomeConta;
	private double saldoConta;
	
	
	
	public ContaBanco(int numeroConta, String nomeConta, double saldoConta) {
		this.numeroConta = numeroConta;
		this.nomeConta = nomeConta;
		aumentoDeposito(saldoConta);
	}
	
	public ContaBanco(int numeroConta, String nomeConta) {
		this.numeroConta = numeroConta;
		this.nomeConta = nomeConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeConta() {
		return nomeConta;
	}
	
	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}
	
	public double getDepositoConta() {
		return saldoConta;
	}
	
	
	public void aumentoDeposito(double depositoConta) {
		saldoConta += depositoConta;
	}
	
	public void retiradaDeposito(double tiradaConta) {
		saldoConta -= tiradaConta + 5.0;
		// saldoConta = saldoConta - tiradaConta - 5.0
	}
	
	public String toString() {
		return "Conta " + getNumeroConta() +
			   ", Dono: " + getNomeConta() +
			   ", Balanço: " + String.format("R$%.2f", getDepositoConta());
	}
	
}
