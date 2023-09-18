package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConverterMoeda;

public class CalculoMoeda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.printf("Qual o preço do dólar? ");
		double dolarPrice = sc.nextDouble();
		
		System.out.printf("Quantos dólares quer comprar? ");
		double dolarBought = sc.nextDouble();
		
		System.out.printf("Você vai pagar R$%.2f", ConverterMoeda.conversao(dolarBought, dolarPrice));
		
		sc.close();

	}
}
