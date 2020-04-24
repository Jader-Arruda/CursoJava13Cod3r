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
		
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes,d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes,d2.ano);		
		
	}

}
