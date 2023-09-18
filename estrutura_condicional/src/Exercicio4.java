import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas*/
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o horário inicial e final de um jogo: ");
		int hi = sc.nextShort();
		int hf = sc.nextShort();
		int hdf;
		if (hi < hf) {
			hdf = hf - hi;
		} else {
			hdf = 24 - hi + hf; 
			System.out.printf("O jogo durou %d hora(s).", hdf);
		}

		sc.close();
	}

}
