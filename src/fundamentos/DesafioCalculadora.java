package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		
		Scanner entrada =  new Scanner(System.in);	
		
		System.out.println("Hello user, enter a first number: ");
		String number1 = entrada.next();
		
		System.out.println("Now type the operator ( + - * / %)");
		String operator = entrada.next();
		
		System.out.println("Good! now enter a second number: ");
		String number2 = entrada.next();

		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		
		int resultado = "+".equals(operator) ? num1 + num2 : 0;
		resultado = "-".equals(operator) ? num1 - num2 : resultado;
		resultado = "*".equals(operator) ? num1 * num2 : resultado;
		resultado = "/".equals(operator) ? num1 / num2 : resultado;
		resultado = "%".equals(operator) ? num1 % num2 : resultado;
		
		
//		System.out.println(resultado);
		System.out.printf("%d %s %d = %d", num1, operator, num2,resultado);
			
		entrada.close();
				
	}
}
