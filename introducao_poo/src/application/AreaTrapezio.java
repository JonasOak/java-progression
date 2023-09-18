package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Trapezio;

public class AreaTrapezio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Trapezio x, y;
		x = new Trapezio();
		y = new Trapezio();

		System.out.printf("Digite a Base maior, Base menor e altura do primeiro trapézio:\n");
		x.basePlus = sc.nextDouble();
		x.baseMinus = sc.nextDouble();
		x.altura = sc.nextDouble();
		System.out.printf("Digite a Base maior, Base menor e altura do segundo trapézio:\n");
		y.basePlus = sc.nextDouble();
		y.baseMinus = sc.nextDouble();
		y.altura = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Área trapézio 1: %.2f\nÁrea trapézio 2: %.2f", areaX, areaY);
		sc.close();
	}

}
