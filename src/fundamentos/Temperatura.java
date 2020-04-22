package fundamentos;

public class Temperatura {
	public static void main(String[] args) {	
//		(F - 32) * 5 / 9 = C
		final double f = 86;
		final double AJUSTE = 32;
		final double FATOR = (5/9.0);
		final double c;
		
		c = ((f - AJUSTE) * FATOR);
		

		System.out.println(f+ " Fahrenheit converted to Celcius is " + c + "C");

	}
}
