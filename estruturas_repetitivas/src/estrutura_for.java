import java.util.Scanner;

public class estrutura_for {

	public static void main(String[] args) {
		/*Fazer um programa que lê um valor
		inteiro N e depois N números inteiros.
		Ao final, mostra a soma dos N números lidos*/
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		System.out.printf("Quantos valores deseja digitar? ");	
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.printf("A soma é %d.", soma);
		sc.close();
	}
}
