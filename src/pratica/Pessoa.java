package pratica;

public class Pessoa {
	String nome;
	double peso;

	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	String textoDeSaida(Comida comida) {
		return String.format("%s comeu %.2f de %s e seu peso atual é %.2f", this.nome,comida.peso, comida.nome, this.peso);
	}
	 
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	Pessoa() {
	}
}
