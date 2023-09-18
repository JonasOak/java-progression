import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor3 {

	public static void main(String[] args) {
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
		 *Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
		 *Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o 
		 *primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantas vezes quer repetir? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = sc.nextFloat();
			
			double mp = (a * 2.0 + b * 3 + c * 5) / 10.0;
		
			System.out.printf("%.1f\n", mp);	
		}
		sc.close();
	}

}
