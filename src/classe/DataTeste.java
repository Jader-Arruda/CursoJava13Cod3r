package classe;

public class DataTeste {
	public static void main (String[] args) {
		
		Data d1 = new Data();
		d1.dia = 23;
		d1.mes = 8;
		d1.ano = 1990;
		
		Data d2 = new Data();
		d2.dia = 21;
		d2.mes = 4;
		d2.ano = 1979;
		
		Data d3 = new Data(); 
		
		System.out.println(d3.obterDataFormatada());
		
		System.out.println(d1.obterDataFormatada());
		d2.imprimirDataFormatada()	;		
		
	} 

}
