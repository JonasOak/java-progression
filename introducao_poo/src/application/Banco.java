package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBanco bradesco;

		System.out.printf("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.printf("Informe o dono da conta: ");
		String nome = sc.nextLine();
		System.out.printf("Deseja depositar um valor inicial? (y/n)? ");
		char opcao = sc.next().charAt(0);

		if (opcao == 'y') {
			System.out.printf("Insira um valor inicial de depósito: ");
			double initialDeposit = sc.nextDouble();
			bradesco = new ContaBanco(numeroConta, nome, initialDeposit);
		} 
		else {
			bradesco = new ContaBanco(numeroConta, nome);
		}
		System.out.printf("\nInformações da conta\n%s\n\n", bradesco);
		
		System.out.printf("Insira um valor para depositar na conta: ");
		double deposito = sc.nextDouble();
		bradesco.aumentoDeposito(deposito);
		System.out.printf("Dados atualizados:\n%s\n\n", bradesco);
		
		System.out.printf("Insira um valor de retirada: ");
		bradesco.retiradaDeposito(deposito = sc.nextDouble());
		System.out.printf("Dados atualizados:\n%s\n\n", bradesco);
		
		
		sc.close();
	}

}
