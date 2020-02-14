package exec6;
import javax.swing.JOptionPane;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Classe aluno para criar métodos e efetuar calculos solicitados.
 * 
 * @author llopo
 *@since 12/02/2020
 *@version 0.1
 *
 */
public class Aluno {

	String nome;
	int anoNasc;
	String dataNascimento;
	String curso;
	String cidade;
	
	Calendar c = Calendar.getInstance();

	
	public Aluno() {
		
	}


	public Aluno(String nome, int anoNasc,String dataNascimento, String curso, String cidade) {
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.dataNascimento=dataNascimento;
		this.curso = curso;
		this.cidade = cidade;
	
	}
	
	public int idade() {

	    int idade= c.get(Calendar.YEAR)-anoNasc;
	    
	    return idade;
	    
	}
	
	public void calcularIdade() {
		
		String data =(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(System.currentTimeMillis())));
		
		String d2[] = dataNascimento.split("/");
		
		String nasc=d2[2]+d2[1]+d2[0];
		
		int d= Integer.parseInt(data);
		int n= Integer.parseInt(nasc);

		int idade = ((d-n)%1000000)/10000;
		
		System.out.println(idade);
		
		
	} 
	
	public void calcularDias(){
		//737300+60+12
		
		 int an1= c.get(Calendar.YEAR);
		 int m1=c.get(Calendar.MONTH)+1;
		 int d1=c.get(Calendar.DAY_OF_MONTH);
		 
		 int idade1=((an1*365)+(m1*30)+d1);
		
		String d2[] = dataNascimento.split("/");
		
		String dia=d2[0];
		
		int d= Integer.parseInt(dia);
		
		String mes=d2[1];
		
		int m= Integer.parseInt(mes);
		
		String ano=d2[2];
		
		int a= Integer.parseInt(ano);
		
		
		int idade=((a*365)+(m*30)+d);	
		
		int idadetot =idade1-idade;
		
		System.out.println("idade em dias: "+idadetot);
		
	}
	
	
	public void exibir() {
		JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nAno de nascimento: "+anoNasc+"\nCurso: "+curso+"\nCidade: "+cidade+"\nIdade: "+idade());
		
		
	}
	
	

}


// Date hoje = new Date();
