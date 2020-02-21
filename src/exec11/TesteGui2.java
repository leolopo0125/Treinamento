package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGui2 {
	public static void main(String[] args) {
		
		//definir suas caracteristicas
		
		JFrame janela = new JFrame();
		janela.setTitle("Saveiro pega no breu");
		janela.setSize(300,200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);

		
		//definir o componente JButton
		
		JButton botao = new JButton();
		botao.setText("clica aqui");
		botao.setBounds(10, 10, 100, 20);
		
		//definir o componente JLabel de rotulo
		
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(10, 40, 40, 20);
		
		//definir o campo de texto JTextfield
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(50, 40, 100, 20);
		
		//adicionar componentes na tela
		janela.getContentPane().add(botao);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(txtNome);
		
		//informar a visibilidade da tela		
		janela.setVisible(true);		
	}

}
