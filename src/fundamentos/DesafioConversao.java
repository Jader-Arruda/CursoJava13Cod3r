package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro sal�rio:");
		String s1 = entrada.next().replace(",", ".");		


		System.out.println("Digite o segundo sal�rio:");
		String s2 = entrada.next().replace(",", ".");		


		System.out.println("Digite o terceiro sal�rio:");
		String s3 = entrada.next().replace(",", ".");		
	
		
		double sal1 = Double.parseDouble(s1);
		double sal2 = Double.parseDouble(s2);
		double sal3 = Double.parseDouble(s3);
		
		double media = (sal1+sal2+sal3)/3;
		
		System.out.printf("Os tr�s salarios s�o: %.2f, %.2f e %.2f", sal1,sal2, sal3);
		System.out.printf("\nA m�dia dos sal�rios �: %.2f", media);

		
		entrada.close();
				
	}

}
