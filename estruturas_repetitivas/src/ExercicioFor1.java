import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
		 *um valor por linha, inclusive o X, se for o caso.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um valor: ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x && x <= 1000; i = i+2 ) {
			System.out.printf("%d\n", i);
		}
		
		
		sc.close();
	}
}
