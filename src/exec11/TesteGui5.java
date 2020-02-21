package exec11;

/**
 * Teste de checkbox
 * @author llopo
 * @since	19/02/2020
 * @version 0.1
 *  
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGui5 {

	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnResposta;
	private JPanel painelDaJanela;

	public void iniciaGui() {

		// criar as instancias

		janela = new JFrame("Exemplo de checkbox");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbDB = new JCheckBox();
		cbBB = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// configura��es da label escolha
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento:");
		lblEscolha.setBounds(42,15,208,18);
		
		// configura��es da label resposta
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta:");
		lblResposta.setBounds(42,230,300,18);
		
		//configura��es do check box Cartao de Credito
		cbCC.setText("Cart�o de Cr�dito ");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);
		
		//configura��es do check box Dep�sito banc�rio
		cbDB.setText("Deposito Banc�rio ");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);
		
		//configura��es do check box Boleto Banc�rio
		cbBB.setText("Boleto Banc�rio");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);
		
		//configura��es do bot�o
		btnResposta.setText("Resposta");
		btnResposta.setBounds(146, 196, 83, 28);
		
		//adicionar componentes no painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btnResposta);
		painelDaJanela.add(lblResposta);
		
		//configura��es da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setVisible(true);
		
		
		//configura��o do botao
		btnResposta.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				verificaResposta();
			
				
			}
		});
		

	}//fim do m�todo iniciar
	
	public void verificaResposta() {
		
		String resposta = "";

		if (cbCC.isSelected()) {
			resposta += cbCC.getText();

		}
		if (cbDB.isSelected()) {
			resposta += cbDB.getText();

		}
		if (cbBB.isSelected()) {
			resposta += cbBB.getText();

		}
		if(!resposta.equals("")) {
		lblResposta.setText(resposta);
		}
		resposta="";
		
	}
	
	public static void main(String[] args) {
		
		new TesteGui5().iniciaGui();
	}

}
