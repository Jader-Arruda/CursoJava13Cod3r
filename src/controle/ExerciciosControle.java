package controle;

import java.util.Scanner;

public class ExerciciosControle {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma entrada: ");

		int valor = entrada.nextInt();

		if ((valor >= 0 && valor <= 10) && (valor % 2 == 0)) {
			System.out.printf("O valor %d est� entre 0 e 10 e � par", valor);
		} else {
			System.out.println("O valor n�o est� entre 0 e 10 ou nao � par");
		}

		entrada.close();

	}

}
