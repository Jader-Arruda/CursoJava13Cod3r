package pratica;

import java.util.Scanner;

public class ExercicioPraticoControle {
	public static void main (String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Advinhe a cor que estou pensando:");
		String cor = entrada.nextLine();
		
		while (!cor.equalsIgnoreCase("amarela")) {
			System.out.println("Tente uma nova cor");
			cor = entrada.nextLine();
		}
		System.out.println("Acertou miser�ve. A cor � "+cor);
		 
		entrada.close();
	}
}
