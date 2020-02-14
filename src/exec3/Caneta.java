package exec3;
/**
 *Classe responsavel pela criaçaõ do objeto caneta
 * @author llopo
 *@since 11/02/2020
 *@version 0.1
 *
 */
public class Caneta extends Produto{
	
	String cor="azul";
	String marca="bic";
	String formato="Padrão";
	
	
	public void exibirCaneta(){
		if(cor!=null && marca!=null && formato!=null){
		System.out.println(cor);
		System.out.println(marca);
		System.out.println(formato);
		
		}else{
			if(cor==null){
				System.out.println("Caneta sem cor declarada");
				
			}	if(marca==null){
			
				System.out.println("Caneta sem marca declarada");
			}else{
				System.out.println("Caneta sem formato declarado");	
			}		
			
		}
	exibirtudo();
	
	
	}
	

}
