package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class CalculoRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo calculo = new Retangulo();
		
		System.out.printf("Insira a largura e altura do retângulo:\n");
		calculo.width = sc.nextDouble();
		calculo.height = sc.nextDouble();
		System.out.print(calculo);

		sc.close();
	}

}
	