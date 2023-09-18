package util;

public class ConverterMoeda {
	
	public static double IOF = 0.06;
	
	public static double conversao(double dolarBought, double dolarPrice) {
		return dolarBought * dolarPrice * (1.0 + IOF); 
	}
}