package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program1 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o número de produtos: ");
		byte n = sc.nextByte();
		
		for (byte i=0; i<n; i++) {
			System.out.printf("Informações do produto #%d\n", i+1);
			
			System.out.printf("Comum, usado ou importado? (c/u/i)? ");
			char aux = sc.next().charAt(0);
			char choise = Character.toLowerCase(aux); 
			sc.nextLine();
			
			if (choise == 'c') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.printf("Preço: ");
				Double price = sc.nextDouble();
				list.add(new Product(name, price));
				
			} else if (choise == 'u') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.printf("Preço: ");
				Double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Data de manufatura (DD/MM/YYYY): ");
				Date manufactureDate = dtf.parse(sc.nextLine());
				list.add(new UsedProduct(name, price, manufactureDate));
				
			} else if (choise == 'i') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.printf("Preço: ");
				Double price = sc.nextDouble();
				System.out.printf("Alfândega: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				
			} else {
				System.out.printf("Opção inválida!\n\n");
				i--;
			}
			continue;
		}
		
		System.out.printf("\nPRICE TAGS:\n");
		for (Product x : list) {			
			System.out.println(x);
		}
		
		sc.close();
	}

}
