package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	public double Perimeter() {
		return width*2 + height*2;
	}
	public double Diagonal() {
		return Math.sqrt(width*width + height*height);
	}
	public String toString() {
		return "AREA = " + String.format("%.2f", Area())
			 + "\nPERIMETER = " + String.format("%.2f", Perimeter())
			 + "\nDIAGONAL = " + String.format("%.2f", Diagonal());
	}
}
