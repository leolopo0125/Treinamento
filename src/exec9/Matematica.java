package exec9;

/**
 * Operações matematicas
 * @author llopo
 *@since 17/02/2020
 *@version 0.1
 */

public class Matematica {
	public static void main(String[] args) {
		
		double x=10,y=20.5,z=-30;
		
	//valor absoluto retira o sinal matematico	
		double abs=Math.abs(z);
		System.out.println(abs);
		
	//arredonda o valor para um inteiro maior ex 20.5 = 21.0	
		double ceil=Math.ceil(y);
		System.out.println(ceil);
		
	//arredonda o valor para um inteiro menor ex 20.5= 20.0
		double floor=Math.floor(y);
		System.out.println(floor);
		
	//logaritmo de x	
		double log=Math.log(x);
		System.out.println(log);
		
	//Retorna o maior numero entre dois valores	
		double max=Math.max(x, y);
		System.out.println(max);
	
	// Retorna o menor numero entre dois valores
		
		double min=Math.min(x, y);
		System.out.println(min);
		
	//Efetua o calculo de potencia
		
		double pow=Math.pow(x, 2);
		System.out.println(pow);
	
	//Efetua a raíz quadrada
		
		double sqrt=Math.sqrt(x);
		System.out.println(sqrt);

	//Efetua o calculo do seno cosseno e tangent.
		double cos=Math.cos(x);
		double sen=Math.sin(x);
		double tan=Math.tan(x);
		
		System.out.println(cos);
		System.out.println(sen);
		System.out.println(tan);
		
	}
}	
