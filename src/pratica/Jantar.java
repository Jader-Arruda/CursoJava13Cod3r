package pratica;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Jader",95);
		Comida c1 = new Comida("arroz",0.5);
		Comida c2 = new Comida("Feijão",0.3);
		
		
		System.out.println(p.textoDeSaida(c1));
		
		p.comer(c1);
		System.out.println(p.textoDeSaida(c1));
		
		p.comer(c2);
		System.out.println(p.textoDeSaida(c2));
		 
		
	}

}
