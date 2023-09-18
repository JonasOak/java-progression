import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//01- Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.printf("%d é um número negativo.", n);
		} else {
			System.out.printf("%d é um número positivo.", n);
		}
		
		sc.close();
	}

}
