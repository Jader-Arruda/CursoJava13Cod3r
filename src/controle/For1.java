package controle;

public class For1 {
	public static void main(String[] args) {

		for (int contador = 0; contador <= 20; contador++) {

			System.out.printf("A volta é %d\n",contador);
		}
		
		int x = 0;
		
		for(; x <= 10; )
		{
			System.out.printf("A volta é %d\n",x);		
			x++;
		}
		
//		for (; true ;)
//		{
//			System.out.println("Laço infinito");
//		}
		
	}

}
