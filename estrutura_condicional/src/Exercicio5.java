import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar*/
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira o codigo e quantia do alimento: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float price = 0;
		String food = "";

		switch (x) {
		case 1:
			food = "Cachorro Quente";
			price = 4f*y;
			break;
		case 2:
			food = "X-Salada";
			price = 4.50f*y;
			break;
		case 3:
			food = "X-Bacon";
			price = 5f*y;
			break;
		case 4:
			food = "Torrada simples";
			price = 2f*y;
			break;
		case 5:
			food = "Refrigerante";
			price = 1.5f*y;
			break;
		default:
			food = "Produto inexistente";
			break;
		}
		System.out.printf("Você escolheu %s e deu um total de R$%.2f", food, price);

		sc.close();
	}

}
