package exec9;
/**
 * Conversão de string para maiuscula ou minuscula
 * @author llopo
 * @since 17/02/2020
 * @version 0.1
 *
 */
		
public class ConversorString {
	public static void main(String[] args) {
		
		String lista[]=new String[5];
		lista[0]="Java";
		
		String str=lista[0];
		
		String maiuscula= str.toUpperCase();
		String minuscula=str.toLowerCase();
		
		System.out.println(str);
		System.out.println(maiuscula);
		System.out.println(minuscula);
		
	}

}
