import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência
		 *de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido 
		 *(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário 
		 *informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código 
		 *(até que seja válido). O programa será encerrado quando o código informado for o número 4. 
		 *Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, 
		 *conforme o exemplo.*/
		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.printf("Escolha o combustível:\n");
		int var = sc.nextInt();
		
		while (var != 4) {
			switch (var) {
				case 1:
					var = 1;
					alcool += 1;
					var = sc.nextInt();
					break;
				case 2:
					var = 2;
					gasolina += 1;
					var = sc.nextInt();
					break;
				case 3:
					var = 3;
					diesel += 1;
					var = sc.nextInt();
					break;
				case 4:
					var = 4;
					System.out.printf("MUITO OBRIGADO\n");
				default:
					var = sc.nextInt();
			}
		}
		System.out.printf("Álcool: %d%nGasolina: %d%nDiesel: %d\n", alcool, gasolina, diesel);
		sc.close();
	}
}
