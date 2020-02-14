package exec7;
/**
 * 
 * @author llopo
 *@since 13/02/2020
 *@version 0.1
 *
 */
public class Carro {

String modCarro;
String placaCarro;
int velMax;
String combustivel;
double valor;
String cor;
 boolean vendido=false;



public Carro() {
	
	
}

public Carro(String modCarro, String placaCarro, int velMax, String combustivel, double valor,String cor) {
	this.modCarro = modCarro;
	this.placaCarro = placaCarro;
	this.velMax = velMax;
	this.combustivel = combustivel;
	this.valor = valor;
	this.cor = cor;

}



}
