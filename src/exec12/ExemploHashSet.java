package exec12;

import java.util.HashSet;

public class ExemploHashSet {
	public static void main(String[] args) {
		
		HashSet<String> listaString = new HashSet<String>();
		listaString.add("Madagascar");
		listaString.add("A Era do Gelo");

		listaString.add("Fuga das Galinhas");
		listaString.add("A Era do Gelo");
		
		System.out.println(listaString);
		
		HashSet<Integer> listaInt = new HashSet<Integer>();
		listaInt.add(10);
		listaInt.add(57);
		listaInt.add(56);
		listaInt.add(3);
		listaInt.add(2);
		listaInt.add(10);
		
		System.out.println(listaInt);;
	}

}
