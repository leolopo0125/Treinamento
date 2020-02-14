package teste;
/**
 * Classe para obter dados e calcular o tempo de vida em dias
 * 
 * @author llopo
 * @since 13/02/2020
 * @version 0.1
 *  
 */
import java.util.Calendar;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Salvar {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		String dataCompleta = JOptionPane.showInputDialog("Entre com a data de nascimento:");
		String data[]=dataCompleta.split("/");
		
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);
		
		
		 int anof= c.get(Calendar.YEAR);
		 int mesf=c.get(Calendar.MONTH)+1;
		 int diaf=c.get(Calendar.DAY_OF_MONTH);
		
		
		DateTime dataInicial = new DateTime(ano,mes,dia,0,0);
		DateTime dataFinal =new DateTime(anof,mesf,diaf,0,0);
		
		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
		
		System.out.println(dias);
	}

}
