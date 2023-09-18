package application;

import java.util.Locale;
import java.util.Scanner;

import entities.TotalGrade;

public class Student {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		TotalGrade estudante = new TotalGrade();
		
		System.out.printf("Insira o nome: ");
		estudante.nome = sc.nextLine();
		System.out.printf("Insira as notas:\n");
		estudante.n1 = sc.nextDouble();
		estudante.n2 = sc.nextDouble();
		estudante.n3 = sc.nextDouble();
		
		if (estudante.notaFinal() > 60.0) {
			System.out.printf("Nota final = %.2f\nPASS", estudante.notaFinal());
		} else {
			System.out.printf("Nota final = %.2f\nFAILED\nFaltou = %.2f pontos", estudante.notaFinal(), estudante.missingPoints());
		}
		
		sc.close();
	}

}
