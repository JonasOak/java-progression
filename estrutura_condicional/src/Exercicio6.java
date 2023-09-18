import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um valor qualquer: ");
		double n = sc.nextDouble();
		String interval = "";
		
		if (n >= 0.0 && n <= 25.0) {
			interval = "[0, 25]";
		} else if (n > 25.0 && n <= 50.0) {
			interval = "[25, 50]";
		} else if (n > 50.0 && n <= 75.0) {
			interval = "[50, 75]";
		} else if (n > 75.0 && n <= 100.0) {
			interval = "[75, 100]";
		} else {
			System.out.printf("Fora de intervalo.");
		}
		System.out.printf("O intervalo é %s", interval);
		sc.close();
	}

}
