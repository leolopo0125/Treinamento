package exec11;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe responsavel por demonstrar a utilização do jTable
 * @author llopo
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TesteGui10 {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JTable tabela;
	private String[] colunas = new String[] { "uf", "Estado" };
	private String[][] dados = new String[][] { { "SP", "São Paulo" }, { "RJ", "Rio de Janeiro" },
			{ "RN", "Rio Grande do Norte" }, { "PR", "Paraná" } };
	private JLabel lblIncluirUf;
	private JLabel lblIncluirEstado;
	private JTextField jtfIncluirUf;
	private JTextField jtfIncluirEstado;
	private JButton botaoIncluir;
	private JButton botaoExcluir;
	private JScrollPane painelDeScroll;

	public void iniciaGui() {
		janela = new JFrame("Exemplo de tabela");
		tabela= new JTable();
		lblIncluirEstado = new JLabel("Informe Estado");
		lblIncluirUf = new JLabel("Informe UF");
		jtfIncluirEstado = new JTextField();
		jtfIncluirUf= new JTextField();
		botaoExcluir = new JButton("Excluir");
		botaoIncluir = new JButton("Incluir");
		
		painelDaJanela = (JPanel) janela.getContentPane();
		
		//criar a tabela, ao invés de passar atributos direto iremos colocar em um modelo de dados
		
		DefaultTableModel modelo = new DefaultTableModel(dados,colunas);
		tabela = new JTable(modelo);
		
		tabela.setEnabled(true);
		
		// instanciando e inserindo a tabela no scroll
		painelDeScroll = new JScrollPane(tabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		//configuração dos componentes da tela
		painelDeScroll.setBounds(10, 100, 360, 95);
		tabela.setBounds(10,30, 300, 95);
		botaoIncluir.setBounds(75, 200, 100, 50);
		botaoExcluir.setBounds(195,200, 100, 50);
		lblIncluirUf.setBounds(15, 20, 70, 25);
		lblIncluirEstado.setBounds(15,55, 90, 25);
		jtfIncluirUf.setBounds(110,20, 50, 25);
		jtfIncluirEstado.setBounds(110,55, 260, 25);
		
		//adicionar ação no botão
		botaoIncluir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				adicionaLinha();
				
				
			}

		
		});
		
		botaoExcluir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				excluirLinha();
				
			}


		});
		
		// configurações do painel de janela
		
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblIncluirEstado);
		painelDaJanela.add(lblIncluirUf);
		painelDaJanela.add(jtfIncluirEstado);
		painelDaJanela.add(jtfIncluirUf);
		painelDaJanela.add(painelDeScroll);
		painelDaJanela.add(botaoExcluir);
		painelDaJanela.add(botaoIncluir);

		//configurações da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.setSize(400,300);
		
	}//fim do metodo inicia gui
	
	public void adicionaLinha() {
		if (jtfIncluirUf.getText().equals("")||jtfIncluirEstado.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo UF e Estado obrigatórios!");
			
		}else {
			//obter o modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			//adicionar nova linha com os dados
			modelo.addRow(new String[] {jtfIncluirUf.getText(),jtfIncluirEstado.getText()});
			jtfIncluirEstado.setText("");
			jtfIncluirUf.setText("");
			JOptionPane.showMessageDialog(null, "Dados incluidos com sucesso!");
		}
		
	}
	
	public void excluirLinha() {
		if (tabela.getSelectedRow()==-1) {
			JOptionPane.showMessageDialog(null, "Selecione uma linha");
			
		}else if (tabela.getSelectedRowCount()>1) {
			JOptionPane.showMessageDialog(null, "Selecione apenas uma linha");
			
		}else {
			//Obter o modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			modelo.removeRow(tabela.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Excluido com sucesso");
		
		}
		
	}
	
	public static void main(String[] args) {
		
		new TesteGui10().iniciaGui();
	}
	
	
	
	
}// fim da classe
