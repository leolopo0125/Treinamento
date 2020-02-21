
package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import sun.applet.Main;

public class TesteGui4 {

	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDivorciado;
	private JButton btnVerificar;
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;

	public void iniciaGui() {

		// Criar as instancias

		janela = new JFrame("Exemplo de Radio");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDivorciado = new JRadioButton();
		btnVerificar = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// cria o grupo de botões

		grpRadio = new ButtonGroup();

		// adiciona botões ao grupo
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);

		// configurações da label Escolha
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Selecione o estado cívil:");
		lblEscolha.setBounds(82, 18, 230, 18);

		// configuração do botão solteiro
		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(80, 50, 100, 24);

		// configuração do botão casado
		rbtCasado.setText("Casado");
		rbtCasado.setBounds(80, 75, 100, 24);

		// configuração do botão viuvo
		rbtViuvo.setText("Viúvo");
		rbtViuvo.setBounds(80, 100, 100, 24);

		// configuração do botão Divorciado
		rbtDivorciado.setText("Divorciado");
		rbtDivorciado.setBounds(80, 125, 150, 24);

		// configurações do botao
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(126, 176, 83, 28);

		// adicionar ação do botao

		btnVerificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// verificar qual radio button foi selecionado

				verificaSelecionado();
			}
		});

		// configurações do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtSolteiro);
		painelDaJanela.add(rbtCasado);
		painelDaJanela.add(rbtViuvo);
		painelDaJanela.add(rbtDivorciado);
		painelDaJanela.add(btnVerificar);

		// configurações da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340, 273);
		janela.setVisible(true);

	}// fim do metodo iniciar

	public void verificaSelecionado() {

		String resposta = "";

		if (rbtSolteiro.isSelected()) {
			resposta += rbtSolteiro.getText();

		}
		if (rbtCasado.isSelected()) {
			resposta += rbtCasado.getText();

		}
		if (rbtViuvo.isSelected()) {
			resposta += rbtViuvo.getText();

		}
		if (rbtDivorciado.isSelected()) {
			resposta += rbtDivorciado.getText();

		}
		if (!resposta.equals("")) {
			// troca de cor da fonte para vermelho
			lblEscolha.setForeground(Color.RED);
			lblEscolha.setText(resposta);
			resposta = "";
		}
	}

	public static void main(String[] args) {

		new TesteGui4().iniciaGui();
	}

}
