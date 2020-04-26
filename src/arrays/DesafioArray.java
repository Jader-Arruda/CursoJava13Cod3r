package arrays;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioArray {
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		int entrada = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas notas você quer informar:"));

		double[] notas = new double[entrada];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe uma nota:");
			notas[i] = valor.nextDouble();
		} 
		
		double total = 0;
		for(double nota:notas) {
			total+= nota;
		}
		
		System.out.println("A média é "+total/notas.length);
		System.out.println(Arrays.toString(notas));
		valor.close();

	}

}
