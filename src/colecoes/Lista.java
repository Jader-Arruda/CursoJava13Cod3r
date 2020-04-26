package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		
		List<Usuario> lista= new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3));//imprime o nome da pessoa.
			 
		lista.remove(1); //remove por índice. --recebe um int e retorna o usuario
		lista.remove(new Usuario("Manu")); //recebe um String e returna true ou false.

		System.out.println("contem?" + lista.contains(new Usuario("Lia")));
		
		for(Usuario u:lista) {
			System.out.println(u);//u.nome se nao usar nada (sem u.nome por exemplo), ele vai chamar o método toString recem criado.
		}
	}

}
