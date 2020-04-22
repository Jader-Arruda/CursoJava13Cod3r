package fundamentos;

public class TipoString {
	
	public static void main (String[] args) {
				
		String nome = "Jader";
		String sobrenome = "Arruda";
		byte idade = 29;
		double salario = 8085.4323423F;

		System.out.printf(String.format("%.2f\n\n", salario));
		
		
		   String texto = String.format("Olá, meu nome é %s %s. Eu tenho %d anos e meu salário é %.2fR$." 
		  ,nome, sobrenome, idade, salario);  
		   
		   System.out.println(texto.substring(4, 12));
		 		
	}
		

}
