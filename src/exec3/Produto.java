package exec3;
/**
 *classe responsavel por armazenar os atributos do produto
 * @author llopo
 *@since 11/02/2020
 *@version 0.1
 *
 */


public class Produto {

	String nome;
	float custo = 8;
	double pctlucro =0.2;
	double valor=0;
	

	// método para exibir o nome do produto.
	
	public  void exibirnome() {
	if (nome !=null) {
		
	System.out.println("Nome do produto:"+nome);
	
		}	else{System.out.println("A variavel nao tem valor");}
	}
//método para calcular e exibir o valor do produto.	
	
	public  void exibirvalor(){
		
		if(custo >0){
	valor=((custo*pctlucro)/100)+ custo;
				
	System.out.println("O valor do produto é: "+valor);
			
	}
	else{
		System.out.println("Custo nao tem valor");
		
	}
		}	
//metodo para calcular o lucro e exibir	
	public  void exibirlucro(){
		if(pctlucro>0){	
	double valor = custo*pctlucro;
		
	System.out.println("O percentual de lucro é: "+valor+"%");		
		
		
	}
		else{
			
			System.out.println("Percentual não pode ser vazio");
		}
	}
		
//	exibindo todos os metodos.
	public  void exibirtudo(){
		
		
	exibirnome();
	exibirvalor();
	exibirlucro();
		
	}

}