package pratica;

public class Predio {
	int escada = 0;
	int elevador = 0;
	String subida;

	String subir() {
		
		if (escada == 1) {
			subida = "Você optou por ir de escada";
		}
		else if (elevador == 1) {
			subida = "Você optou por ir de elevador";
		}
		
		return subida;				
	} 

}
