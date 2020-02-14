package exec3;
/**
 *Classe responsavel pela criação do objeto carro
 * @author llopo
 *@since 11/02/2020
 *@version 0.1
 *
 */
public class Carro extends Produto{
	
	String marca = "Ford";
	String modelo ="Mustang";
	String motor = "V6";
	String ano = "1965";
	String cor = "Vermelho";
	
	public void exibirCarro(){
		
	if (marca!=null && modelo!=null && motor!=null && ano!=null && cor!=null){
	System.out.println(marca);	
	System.out.println(modelo);
	System.out.println(motor);
	System.out.println(ano);
	System.out.println(cor);
	}	
	exibirtudo();
	}
	

}
