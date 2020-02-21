package exec11;

/**
 * Classe Responsavel por demonstrar da combobox
 * @author llopo
 * @since
 * @version
 *
 */

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteGui6 {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox cbox;
	private String[] equipamentos = { "Monitor", "Teclado", "Mouse", "Scanner", "Modem" };

	public void iniciarGui() {

		janela = new JFrame("Exemplo de combobox");
		painelDaJanela = (JPanel) janela.getContentPane();
		cbox = new JComboBox(equipamentos);

		// configurações do combo box
		cbox.setSelectedIndex(-1);
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);
		cbox.getSelectedIndex();

		// configurações do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(cbox);

		// configurações da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);

	}

	public static void main(String[] args) {

		new TesteGui6().iniciarGui();

	}

}
