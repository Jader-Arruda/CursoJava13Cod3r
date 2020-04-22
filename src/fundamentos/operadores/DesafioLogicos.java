package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na terça  (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean t1 = true;
		boolean t2 = false;
		
//		t1 && t2 = true 50 polegadas e sorvete
//		t1 ^ t2 = true 32 polegadas	e sorvete
//		t1 = false & t2 = false sem tv e sem sorvete
		
		boolean comprouTv50 = t1 && t2;
		boolean comprouTv32 = t1 ^ t2;
		boolean comprouSorvete = t1 || t2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? "+comprouTv50);
		System.out.println("Comprou TV 32\"? "+comprouTv32);
		System.out.println("Tomou sorvete? "+comprouSorvete);
		System.out.println("Mais saudavel?"+maisSaudavel);
		
		
		
	}

}
