import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Exercício 03- Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		ordem crescente ou decrescente*/
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite dois números: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.printf("%d e %d são números múltiplos.", n1, n2);
		} else {
			System.out.printf("%d e %d não são múltiplos", n1, n2);
		}

		sc.close();
	}

}
