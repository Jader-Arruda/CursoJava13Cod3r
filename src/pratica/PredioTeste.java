package pratica;

import java.util.Scanner;

public class PredioTeste {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Como você prefere subir a entrada? escada ou elevador?");
		String valor = entrada.nextLine();
		System.out.println(valor);
		
		entrada.close();
		
	}

}
