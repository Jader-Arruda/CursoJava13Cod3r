package controle;

import javax.swing.JOptionPane;

public class WhileDeterminado {
	public static void main(String[] args) {

		
		String entrada = JOptionPane.showInputDialog("Digite um n�mero:");
		
		
		int contador =	Integer.parseInt(entrada);
		
		while(contador <= 10) {
		System.out.println("Bom dia "+contador);
		
		contador++;
		}
	}

}
