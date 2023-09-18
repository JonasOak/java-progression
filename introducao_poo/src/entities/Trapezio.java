package entities;

public class Trapezio {	
	
	public double basePlus;
	public double baseMinus;
	public double altura;
	
	public double area() {
		double area = (basePlus + baseMinus)*altura/2;
		return area;
	}

}
