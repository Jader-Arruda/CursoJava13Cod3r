	package classe;
 
//Classe
public class Produto {
	String nome;
	double preco; 
	static double desconto = 0.25;

	
	//Construtor
	Produto (String nomeInicial){	
		nome = nomeInicial;
	}
	
	Produto(){		 
	}
	

	//Método
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));

	}
	

}