package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Estoque {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Insira o nome: ");
		String name2 = sc.nextLine();
		System.out.printf("Insira o preço: ");
		double price2 = sc.nextDouble();
		System.out.printf("Insira a quantidade: ");
		int quantity2 = sc.nextInt();
		
		Produto products = new Produto(name2, price2, quantity2);
		
		System.out.printf("Dados do produto: %s\n____________________________________________\n\n", products);
		
		System.out.printf("Adicione mais quantidades de %s: ", products.name);
		int quantidade = sc.nextInt();
		products.AddProducts(quantidade);
		System.out.printf("Dados atualizados: %s\n___________________________________________\n\n", products);
		
		System.out.printf("Remova mais quantidades de %s: ", products.name);
		quantidade = sc.nextInt();
		products.RemoveProducts(quantidade);
		System.out.println("Dados atualizados: " + products);
		
		sc.close();
	}

}
