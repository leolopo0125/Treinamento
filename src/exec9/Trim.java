package exec9;
/**
 * Utilizando trim para remover espa�os em strings.
 * 
 * @author llopo
 *@since 17/02/2020
 *@version 0.1
 */

public class Trim {
	public static void main(String[] args) {
		
		String um="Ol� ";
		String dois="Mundo ";
		
		System.out.println("Antes do trim: "+um+dois+".");
		
		um =um.trim();
		dois=dois.trim();
		
		System.out.println("Depois do trim: "+um+dois+".");
		
	}

}
