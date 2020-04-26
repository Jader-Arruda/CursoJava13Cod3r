package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){	
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dia, int mes, int ano){	
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}
	
	String obterDataFormatada(){ //os m�todos pertencem a inst�ncia
		return String.format("%d/%d/%d", this.dia,mes,ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf(obterDataFormatada());		
	}

}
