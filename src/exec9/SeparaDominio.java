package exec9;

import javax.swing.JOptionPane;

/**
 * Separa dominio
 * @author llopo
 *
 */

public class SeparaDominio {
public static void main(String[] args) {
	//parametro,mensagem,titulo da janela,icone.
	String email=JOptionPane.showInputDialog(null,"Informe o e-mail","Validador de e-mail",1);
//	String email=JOptionPane.showInputDialog("Informe o e-mail");
	
	int cont =email.indexOf("@");
	if(cont>0) {
		
		System.out.println("Posição do @: "+cont);
		String dominio=email.substring(cont+1);
		System.out.println("Dominio do email: "+dominio);
		String usuario=email.substring(0, cont);
		System.out.println("Usuario do email: "+usuario);
		
	}
	
}
}
