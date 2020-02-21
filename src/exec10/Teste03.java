package exec10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Teste03 {
public static void main(String[] args) {
	
	File arquivo=new File("saida.txt");
	try {
		

		FileOutputStream arquivoOutput = new FileOutputStream(arquivo,true);
		PrintStream gravador = new PrintStream(arquivoOutput);
		gravador.println("Ola");
		gravador.println("Ola");
		gravador.println("Ola");
		gravador.println("Ola");
		gravador.println("Ola");
		
		gravador.close();
		arquivoOutput.close();
		
		
	} catch (FileNotFoundException e) {

//		e.printStackTrace();
	} catch (IOException e) {
		
//		e.printStackTrace();
	}
	
	
}
}
