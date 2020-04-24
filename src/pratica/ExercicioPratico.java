package pratica;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioPratico {
	public static void main(String[] args) {

		Date d = new Date();
		
		System.out.println("Hoje é "+d);
		
		String nome = JOptionPane.showInputDialog("What is your name?");

		String seuNome = nome.equalsIgnoreCase("Pedro") ? "Sim": "Não";
		System.out.println("O seu nome é pedro? " + seuNome);

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu estado de nascimento:");
		String estado = entrada.nextLine();
		
		if(estado.equalsIgnoreCase("Mato Grosso do Sul")) {
			System.out.println("Voce é sul mato grossense "+ Math.pow(3, 3));
		}
		
		entrada.close();
		
//		String a = JOptionPane.showInputDialog("Enter a number");
//		int varA = Integer.parseInt(a);
//
//		String b = JOptionPane.showInputDialog("Enter a second number");
//		int varB = Integer.parseInt(b);
//
//		if (nome.equalsIgnoreCase("Jader")) {
//			JOptionPane.showMessageDialog(null, "Hello Jader");
//		} else {
//			System.out.println("Its not Jader");
//		}
//
//		JOptionPane.showMessageDialog(null, String.format("A soma de %d + %d é %d", varA, varB, varA + varB));

	}

}
