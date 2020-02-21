package view;

/**
 * Classe view da interface de cadastro de alunos
 * 
 * @author llopo
 * @since 18/02/2020
 * @version 0.1
 * 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.AlunoController;
import model.Data;

public class AlunoView {

	private static JFrame janela;
	private static JButton salvar;
	private static JButton cancelar;
	private static JTextField txtMatricula;
	private static JTextField txtNome;
	private static JTextField txtDataNasc;
	private static JTextField txtSexo;
	private static JLabel lblMatricula;
	private static JLabel lblNome;
	private static JLabel lblDataNasc;
	private static JLabel lblSexo;

	public AlunoView() {

	}

	// Declaração de janela e
		public void iniciaGui() {
		JFrame janela = new JFrame("Cadastro de Aluno");
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);

		// Declaração dos botoes

		JButton salvar = new JButton();
		salvar.setText("Salvar");
		salvar.setBounds(125, 200, 100, 20);
		salvar.addActionListener(new SalvarListener());

		JButton cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setBounds(240, 200, 100, 20);
		cancelar.addActionListener(new CancelarListener());

		// Declaração das labels
		JLabel lblMatricula = new JLabel();
		lblMatricula.setText("Matricula:");
		lblMatricula.setBounds(5, 10, 100, 20);

		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(5, 40, 100, 20);

		JLabel lblDataNasc = new JLabel();
		lblDataNasc.setText("Data de Nasc:");
		lblDataNasc.setBounds(5, 70, 80, 20);

		JLabel lblSexo = new JLabel();
		lblSexo.setText("Sexo:");
		lblSexo.setBounds(5, 100, 80, 10);

		// Declaração dos textfields
		txtMatricula = new JTextField();
		txtMatricula.setBounds(100, 10, 300, 20);

		txtNome = new JTextField();
		txtNome.setBounds(100, 40, 300, 20);

		txtDataNasc = new JTextField();
		txtDataNasc.setBounds(100, 70, 300, 20);

		txtSexo = new JTextField();
		txtSexo.setBounds(100, 100, 300, 20);

		// Definindo tamanho da janela
		janela.setSize(500, 300);
		janela.setVisible(true);

		// adicionando componentes na janela

		janela.getContentPane().add(lblMatricula);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(lblDataNasc);
		janela.getContentPane().add(lblSexo);
		janela.getContentPane().add(txtMatricula);
		janela.getContentPane().add(txtNome);
		janela.getContentPane().add(txtDataNasc);
		janela.getContentPane().add(txtSexo);
		janela.getContentPane().add(salvar);
		janela.getContentPane().add(cancelar);

	}

	public class SalvarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			boolean erro = false;

			AlunoController a1 = new AlunoController();

			String nasc = txtDataNasc.getText();
			String[] data = nasc.split("/");

			try {

				int dia = Integer.parseInt(data[0]);
				int mes = Integer.parseInt(data[1]);
				int ano = Integer.parseInt(data[2]);

				if (mes == 2 && dia > 28) {

					erro = true;

				}

				if (dia >= 32 || dia <= 0 || mes > 12 || ano > 3000) {

					erro = true;
				}

				if (txtMatricula == null) {
					erro = true;
					JOptionPane.showMessageDialog(null, "Campo Matricula não esta preenchido!","ERRO!",0);
				}

				if (txtNome == null) {
					erro = true;
					JOptionPane.showMessageDialog(null, "Campo Nome não esta preenchido","ERRO!",0);
				}

				if (txtDataNasc == null) {
					erro = true;
					JOptionPane.showMessageDialog(null, "Campo data não esta preenchido!","ERRO!",0);
				}

				if (txtSexo == null) {
					erro = true;
					JOptionPane.showMessageDialog(null, "Campo sexo não esta preenchido!","ERRO!",0);
				}

				Data d1 = new Data(dia, mes, ano);

				String sexo = txtSexo.getText();
				
				sexo = sexo.toUpperCase();
				char s = sexo.charAt(0);
				
	

				if (erro == false) {
					a1.inserirAluno(txtMatricula.getText(), txtNome.getText(), d1, s);

					txtMatricula.setText("");
					txtNome.setText("");
					txtDataNasc.setText("");
					txtSexo.setText("");

					JOptionPane.showMessageDialog(null, "Cadastro concluido com sucesso!");
				} else {

					JOptionPane.showMessageDialog(null, "Verifique os campos digitados");

				}

			} catch (NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "Revise os campos digitados!");

			} catch (StringIndexOutOfBoundsException s) {
				JOptionPane.showMessageDialog(null, "Digite o sexo: M(masculino)/F(feminino)");

			} catch (java.lang.ArrayIndexOutOfBoundsException ex) {
				JOptionPane.showMessageDialog(null,
						"Formato de data invalido, entre com um formato valido: ex. XX/XX/XXXX");
			}
		}

	}

	public class CancelarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			JOptionPane.showMessageDialog(null, "Cadastro encerrado!");
			System.exit(0);

		}

	}

}

//alterar a tela de cadastro de aluno para incluir dados faltantes do cadastro estas informações serao obtidas via text field com excessao de sexo com radio button, cidade e estado com combobox
