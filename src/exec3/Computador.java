package exec3;
/**
 *Clase responsalvel pela criação do objeto computador
 * @author llopo
 *@since 11/02/2020
 *@version 0.1
 *
 */
public class Computador extends Produto{
	
	String processador= "Ryzen 7";
	String memoria="16gb ram";
	String tela = "32 plg";
	String hd = "1TB";
	String placavid= "NVidia gtx 1050ti.";
	
	public void exibirComputador(){
		System.out.println(processador);
		System.out.println(memoria);
		System.out.println(tela);
		System.out.println(hd);
		System.out.println(placavid);
		
		exibirtudo();
	}

}

