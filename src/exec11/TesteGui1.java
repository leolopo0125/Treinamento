package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {

	private static JFrame janela;
	private static JButton botao;

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// criar uma nova tela(instancia)
		janela = new JFrame("Minha primeira tela");
		
		//criar um novo botao(instancia)
		botao = new JButton("Clique aqui!");
		
		//adicionar o botão ao painel da janela
		janela.getContentPane().add(botao);
		
		//configurar o tamanho da tela
		janela.setSize(300, 300);
		
		//configurar a visibilidade da tela(true/false)
		janela.setVisible(true);
		
		//informar que a tela não tem layout pré definido
		janela.getContentPane().setLayout(null);
		
		
		
		
		
		
	}

}
