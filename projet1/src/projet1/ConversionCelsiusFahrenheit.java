package projet1;

public class ConversionCelsiusFahrenheit {
	public static void main(String[] args) {

	}

	public static double arrondi(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}