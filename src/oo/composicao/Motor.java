package oo.composicao;

public class Motor {

	Carro carro; //notacao para construcao de motor bidirecional.
	boolean ligado = false;
	double fatorInjecao = 1;

	Motor(Carro carro){
		this.carro = carro;
	} //notacao para construcao de motor bidirecional.
	
	
	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
