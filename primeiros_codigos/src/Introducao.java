import java.util.Scanner;

public class Introducao {

	public static void main(String[] args) {
		double y = 32.48593;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World"); //Imprime uma mensagem na tela
		System.out.printf("%.2f\n", y); //A letra 'f' vem de 'formatado'
		String x, z;
		x = sc.next();
		z = sc.nextLine();
		System.out.printf("Você digitou: %s\n%s", x, z);
		
		sc.close();
	}
}
