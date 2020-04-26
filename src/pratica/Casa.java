package pratica;

public class Casa {
	
	String tipoConta;
	String nomeResponsavel;
	double valor;
	double multa;
	
	double pagamentoComMulta () { 
		return valor + (valor * multa);
	}
	
	 
	Casa(double valor){
	this.valor = valor;
	}
	
	Casa(){	
	}
	
	double pagamentoComMetadeDaMulta(double valorDaMulta) {
		return valor + (valor * valorDaMulta);
	}
	
	String mensagemDeExibicao() {
		return String.format("A %s no valor de %.2f é de responsabilidade do %s.\n", tipoConta, valor,nomeResponsavel);
	}
 
 
}
