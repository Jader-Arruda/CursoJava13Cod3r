package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}

	Produto(){
	}
		
	
	double precoComDesconto(){
		
		double precoCalculado = preco * (1 - desconto);
		return precoCalculado;
	}

}