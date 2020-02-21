package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TesteGui3 {

	// Declarar os componentes da tela
	private JFrame janela;
	private JButton botao;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;


	public TesteGui3() {
		iniciaGui();

	}

	public void iniciaGui() {

		// Criar a janela(instancia)
		janela = new JFrame();

		// Criar a area de texto
		area = new JTextArea();

		// Criar o primeiro botao
		botao = new JButton("Clique aqui");

		// Adicionar o metodo desenvolvido na classe TextoListener
		botao.addActionListener(new TextoListener());

		// Criar o segundo botao
		botao2 = new JButton("Troca cor");
		// Adicionar o metodo desenvolvido na classe TextoListener
		botao2.addActionListener(new CorListener());

		// Criar um campo para digitar texto
		campo = new JTextField();

		// Adicionar o metodo desenvolvido na classe TextoListener
		campo.addActionListener(new TextoListener());
		
		//adicionar o botão ao painel da janela
		janela.getContentPane().add(BorderLayout.EAST,botao2);
		
		//adicionar o botão 1 ao painel da janela
		janela.getContentPane().add(BorderLayout.SOUTH,botao);
		
		//adicionar a area ao painel da janela
		janela.getContentPane().add(BorderLayout.CENTER,area);
		
		//adicionar o textfield ao painel
		janela.getContentPane().add(BorderLayout.NORTH,campo);
		
		//configurar o tamanho da tela
		janela.setSize(300, 300);
		janela.setVisible(true);
		area.setEditable(false);
		
	}

	public class TextoListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			area.append(campo.getText() + "\n");
			campo.setText("");
		}

	}

	public class CorListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// se o fundo da JTextArea for neutro troca para preto

			if (area.getBackground().equals(Color.BLACK)) {
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);

			} else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);
			}

		}

	}

	public static void main(String[] args) {
		
		new TesteGui3();

	}
}
