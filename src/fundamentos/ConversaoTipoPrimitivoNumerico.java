package fundamentos;

import java.util.Scanner;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		Scanner saida = new Scanner (System.in);

		System.out.println("Type your name: ");
		String nome = saida.nextLine();
		
		System.out.printf("Seja bem vindo %s", nome);
		
		saida.close();
		
		
		double a = 1;
		
		System.out.println(a);

		float f = (float) 1.23456789;
		System.out.println(f);
		
		int c = 4;
		byte d = (byte) c;
		
		System.out.println(d);
	
	}

}
