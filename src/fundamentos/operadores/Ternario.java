package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 4.0;
		String resultadoRecuperacao  = media >= 5.0 ? "em recupera��o." :"reprovado.";
		String resultadofinal = media >= 7.0 ? "Aprovado." : resultadoRecuperacao;
		
		System.out.println("O aluno est� "+resultadofinal);
	}

}
