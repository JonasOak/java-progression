import java.util.Scanner;

public class Exercicio2While {

	public static void main(String[] args) {
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
		 *indeterminada de pontos no sistema cartesiano. Para cada ponto escrever
		 *o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		 menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira os valores de X e Y:\n");
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		while (!(x == 0 || y == 0)) {
			if (x > 0 && y > 0) {
				System.out.printf("Primeiro\n");
			} else if (x < 0 && y > 0) {
				System.out.printf("Segundo\n");
			} else if (x < 0 && y < 0) {
				System.out.printf("Terceiro\n");
			} else if (x > 0 && y < 0) {
				System.out.printf("Quarto\n");
			}
			x = sc.nextFloat();
			y = sc.nextFloat();
		}
		System.out.printf("Encerrado.");
		sc.close();
	}
}
