package exec3;
/**
 *Classe Responsavel pela criação do objeto caneca
 * @author llopo
 *@since 11/02/2020
 *@version 0.1
 *
 */
public class Caneca extends Produto{
	
	boolean estampa=false;
	String material="Vidro";
	String medida= "tamanho médio";

	public void exibirCaneca(){
		
		if(material	!=null && medida!=null){
		if(estampa==false){
			System.out.println("Sem estampa");
			
		}else{
			System.out.println("Com estampa");
		}
		
		System.out.println(material);
		System.out.println(medida);
		}else{
			if(material==null){
				System.out.println("Material sem valor inserido.");
			}else{
				System.out.println("Medida sem valor inserido.");
					
				}
			}
		
		exibirtudo();
			
		}
	}

