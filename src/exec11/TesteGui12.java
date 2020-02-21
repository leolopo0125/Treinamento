package exec11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TesteGui12 {
//declara��o das variaveis de referencia
	private JFrame janela;
	private JPanel painelDaJanela;
	private JList list;
	private JLabel label;
	private JScrollPane scroll;

	private String[] diaSemana = { "Domingo", "Segunda", "Ter�a", "Quarta", "Quinta", "Sexta", "S�bado" };

	public void iniciaGui() {

		// criar instancias
		janela = new JFrame("Exemplo de lista:");
		painelDaJanela = (JPanel) janela.getContentPane();
		label = new JLabel("CTRL para multisele��es", JLabel.CENTER);
		list = new JList(diaSemana);
		scroll = new JScrollPane(list);

		// configurar parametro da lista
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);// parametro para sele��o multipla

		list.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				label.setText(list.getSelectedValue().toString());
				
			}
		});
		
		// configura��es do scroll
		scroll.setBounds(10, 60, 300, 90);

		// atributos do r�tulo
		label.setOpaque(true);
		label.setBackground(Color.lightGray);
		label.setForeground(Color.black);
		label.setBounds(10, 10, 300, 30);

		// configura��es do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(scroll);
		painelDaJanela.add(label);

		// configura��es da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	}// fim do inicia Gui

	public static void main(String[] args) {
		new TesteGui12().iniciaGui();
	}

}
