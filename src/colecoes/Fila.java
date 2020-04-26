package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add adicionam elementos na fila. 
		//A diferenca � o comportamento quando a fila est� cheia.
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");

//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains("x");
		
//		System.out.println(fila.peek());
//		System.out.println(fila.peek());
//
//		System.out.println(fila.element());
//		System.out.println(fila.element());

		System.out.println(fila);
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila);
		
	}

}
