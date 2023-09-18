package util;

public class Calculator {
	public final double PI = 3.14159;

	public double circumference(double radiacao) {
		return 2.0 * PI * radiacao;
	}

	public double volume(double radio) {
		return 4.0 * PI * radio * radio * radio / 3.0;
	}
}
