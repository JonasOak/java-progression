package application;

public class Teste {

	public static void main(String[] args) {

		long number1 = 1296;
		int number2 = 4;

		System.out.println(number1 + ", " + number2);
		
		while (number2 <= 2024) {
			
			long aux;

			aux = numberExtractor(number1) + plusNumber(number1) + predecessorExtractor(number2);
			number1 = aux * 100 + 96;
			System.out.println(number1 + ", " + number2);
			number2 += 2;

		}
	}

	public static final long numberExtractor(long number1) {

		long secondNumber = number1 / 100;
		return secondNumber;

	}

	public static final int plusNumber(long number1) {

		int plus = 0;

		while (number1 > 0) {
			long digit = number1 % 10;
			plus += digit;
			number1 /= 10;
		}
		return plus;
	}

	public static final int predecessorExtractor(int number) {

		int plus = number;

		for (int i = number - 1; i >= 0; i--) {
			plus += i;
		}
		return plus;
	}
}
