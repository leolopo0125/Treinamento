package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {
	public static void main(String[] args) {
		
		PrintStream gravador;
		try {
			gravador = new PrintStream("saida.txt");
			
			gravador.println("Bom dia");
			gravador.println("jovem padawan");
			gravador.println("tenha uma boa semana");
			gravador.println("pequeno gafanhoto");
			gravador.println("até mais");	
			gravador.close();
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		}
		
	}
}
