package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno príncipe");
		livros.push("Dom Quichote"); 
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());

		livros.pop();
		System.out.println(livros.peek());
		livros.poll();
		livros.poll();
		
		System.out.println(livros.peek());
	}

}
