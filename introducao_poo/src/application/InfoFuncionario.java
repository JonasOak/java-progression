package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculoSalario;

public class InfoFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CalculoSalario salary = new CalculoSalario();
		
		System.out.printf("Nome: ");
		salary.name = sc.nextLine();
		System.out.printf("Salário bruto: ");
		salary.salarioBruto = sc.nextDouble();
		System.out.printf("Imposto: ");
		salary.imposto = sc.nextDouble();
		
		System.out.printf("%s\n\n", salary);
		
		System.out.printf("Em que porcentagem quer aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		salary.aumentoSalario(porcentagem);
		
		System.out.printf("Dados atualizados: %s, R$%.2f\n", salary.name, salary.salarioLiquido());

		sc.close();

	}

}
