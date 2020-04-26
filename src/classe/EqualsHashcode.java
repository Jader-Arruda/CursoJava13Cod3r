package classe;

public class EqualsHashcode { 	
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Jader Arruda";
		u1.email = "ja_computacao@hotmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Jader Arruda";
		u2.email = "ja_computacao@hotmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}
		

}
