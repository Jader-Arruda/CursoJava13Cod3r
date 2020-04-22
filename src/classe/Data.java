package classe;

public class Data {
	
	String dia;
	String mes;
	String ano;
	
	
	String retornarDataFormatada() {
		return String.format("%s/%s/%s\n", dia,mes,ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(retornarDataFormatada());
	}
	
	
	
	Data(){		
		dia = "1";
		mes = "01";
		ano = "1970";
	}
	

	Data(String diaInicial, String mesInicial, String anoInicial){	
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
}
