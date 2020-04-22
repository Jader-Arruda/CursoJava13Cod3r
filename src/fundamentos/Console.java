package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main (String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");

		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Mega sena: %d %d %d %d\n",1,2,3,4);
		
		System.out.printf("Salario: %.1f /n",1234.123);
		System.out.printf("Nome: %s ","Jader");

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: \n");
		String nome = entrada.nextLine();
		
		System.out.printf("Seja bem vindo %s Arruda\n",nome);
		
		Scanner digiteNome= new Scanner(System.in);
		
		System.out.print("Digite o seu nome de novo:\n");
		String seuNome = digiteNome.nextLine();
		
		System.out.printf("Seja bem vindo de novo %s.\n",seuNome);
		
		Scanner idade= new Scanner(System.in);
		
		System.out.print("Digite a sua idade:\n");
		int age = idade.nextInt();
		
		System.out.println("A sua idade é: "+age);
		
		entrada.close();
		digiteNome.close();
		idade.close();
		
		
		
		
		
	}

}
