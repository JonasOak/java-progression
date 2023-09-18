import java.util.Scanner;

public class estrutura_while {
	public static void main(String[] args) {
		/*Fazer um programa que lê números
		inteiros até que um zero seja lido. Ao
		final mostra a soma dos números lidos*/
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		System.out.printf("Digite números. Para encerrar, digite 0:\n");
		int n = sc.nextInt();
		
		while (n != 0) {
			soma += n;
			n = sc.nextInt();
		}
		System.out.printf("A soma é %d", soma);
		sc.close();
	}
}