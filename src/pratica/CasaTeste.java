package pratica;

public class CasaTeste {
	public static void main(String[] args) {

		Casa c1 = new Casa(120.00);
		c1.nomeResponsavel = "Jader";
		c1.tipoConta = "Conta de Luz";
//		c1.valor = 120.00;
		c1.multa = 0.25;
	 
		Casa c2 = new Casa();
		c2.nomeResponsavel = "Joao";
		c2.tipoConta = "Conta de internet";
		c2.valor = 200;
		c2.multa = 0.15;
		
		System.out.println(c1.mensagemDeExibicao());		
		System.out.println("Devido ao atraso o pagamento é de "+c1.pagamentoComMulta());
		System.out.println("Devido ao atraso o pagamento é de "+c1.pagamentoComMetadeDaMulta(0.1));

		System.out.println();
		
		System.out.println(c2.mensagemDeExibicao());		
		System.out.println("Devido ao atraso o pagamento é de "+c2.pagamentoComMulta());
		System.out.println("Devido ao atraso o pagamento é de "+c2.pagamentoComMetadeDaMulta(0.2));
	
		
	} 

}
 