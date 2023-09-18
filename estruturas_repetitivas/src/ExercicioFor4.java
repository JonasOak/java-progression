import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor4 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número N. Depois leia N pares de números
		 *e mostre a divisão do primeiro pelo segundo. Se o denominador for igual 
		 *a zero, mostrar a mensagem "divisao impossivel".*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o numero de repetições: ");
		float n = sc.nextFloat();
		float div = 0;
		for (int i=0; i<n; i++) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			
			if (i < n && b != 0) {
				div = a/b;
				System.out.printf("%.1f\n", div);
			} else {
				System.out.printf("Divisão impossível.\n");
			}
			
		}
		

		sc.close();
	}

}
