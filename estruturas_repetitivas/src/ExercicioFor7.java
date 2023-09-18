import java.util.Scanner;

public class ExercicioFor7 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro positivo N. 
		 *O programa deve então mostrar na tela N linhas, começando de 1 até N. 
		 *Para cada linha, mostrar o número da linha, depois o 
		 *quadrado e o cubo do valor, conforme exemplo.*/
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o número: ");
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			int q = i*i;
			int c = i*i*i;
			System.out.printf("%d %d %d\n", i, q, c);
		}

		sc.close();
	}

}
