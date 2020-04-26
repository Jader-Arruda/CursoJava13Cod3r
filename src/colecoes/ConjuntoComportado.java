package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
//		 Set<String> ListaAprovados = new HashSet<String>();
		 SortedSet<String> ListaAprovados = new TreeSet<String>(); //ordena. treeset ou sortedset.
		 ListaAprovados.add("Jader");
		 ListaAprovados.add("Bruno");
		 ListaAprovados.add("Pedro");
		 ListaAprovados.add("Rose");
		
		  
		 for(String candidato:ListaAprovados) {
			 System.out.println(candidato);
		 }

		 System.out.println(ListaAprovados);
		 System.out.println(ListaAprovados.size());

		 
		 Set<Integer> nums = new HashSet<>();
		 nums.add(1);
		 nums.add(2);
		 nums.add(120); 
		 nums.add(6);

		 for(int n: nums) {
			 System.out.println(n);
		 }
		 
	}

}
