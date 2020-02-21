package exec9;

/**
 * Contador de quantidade de letras de uma palavra armazenada no vetor.
 * @author llopo
 * @since 17/02/2020
 * @version 0.1
 *
 */
public class Contaletras {
	public static void main(String[] args) {
		
		String lista[]=new String[5];
		
		lista[0]="Java";
		int cont=lista[0].length();
		System.out.println("A lista "+lista[0]);
		System.out.println("Possui "+cont+" Caracteres");
	}

}
