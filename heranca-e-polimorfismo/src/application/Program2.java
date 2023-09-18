package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import lession.Contribuinte;
import lession.PessoaFisica;
import lession.PessoaJuridica;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Digite o número de contribuintes: ");
		byte l = sc.nextByte();
		
		for (byte i=0; i<l; i++) {
			System.out.printf("Dados do ontribuinte #%d:%n", i+1);
			
			System.out.printf("Pessoa física ou juridica? (f/j)? ");
			char pessoa = sc.next().charAt(0);
			sc.nextLine();
			
			if (pessoa == 'f') {
				System.out.printf("Nome: ");
				String nome = sc.nextLine();
				System.out.printf("Renda anual: ");
				Double rendaAnual = sc.nextDouble();
				System.out.printf("Gastos com saúde: ");
				Double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
				
			} else {
				System.out.printf("Nome: ");
				String nome = sc.nextLine();
				System.out.printf("Renda anual: ");
				Double rendaAnual = sc.nextDouble();
				System.out.printf("Número de funcionários: ");
				int numFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
				
			}
		}
		double sum = 0.0;
		System.out.println("");
		System.out.printf("CONTRIBUIÇÕES PAGAS:%n");
		
		for (Contribuinte x : list) {
			double imposto = x.imposto();
			System.out.println(x.getNome() + ": R$" + String.format("%.2f", x.imposto()));
			sum += imposto;
		}
		
		System.out.println("");
		System.out.printf("TOTAL TAXAS: R$%.2f", sum);
		
		sc.close();
	}
}
