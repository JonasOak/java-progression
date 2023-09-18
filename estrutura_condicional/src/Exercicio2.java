import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//02- Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.printf("%d é par.", n);
		} else {
			System.out.printf("%d é ímpar.", n);
		}
		
		sc.close();
	}

}
