package exec9;

public class TesteData {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
//	a classe nao encontrara o atributo pois ele esta privado --- d1.dia=10;
		d1.setDia(10);
		d1.getDia();
	}

}
