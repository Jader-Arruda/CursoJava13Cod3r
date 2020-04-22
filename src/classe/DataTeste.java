package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
//		d1.dia = "23";
//		d1.mes = "Agosto";
//		d1.ano = "1990"; 
		
		Data d2 = new Data("21","08","1990");
		
//		d2.dia = "21";
//		d2.mes = "Abril";
//		d2.ano = "1979";
		
//		System.out.printf("Eu nasci no dia %s\n", d1.retornarDataFormatada());
//		System.out.printf("Minha mãe nasceu no dia %s", d2.retornarDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
		
	}

}
