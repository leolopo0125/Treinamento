package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TesteGui11 {

	private JFrame janela;
	private JTabbedPane painelComAbas;
	private JPanel painelDaJanela;
	private JPanel primeiraAba;
	private JPanel segundaAba;
	private JPanel terceiraAba;
	
	
	public void iniciaGui() {
		janela = new JFrame("Exemplo de painel com abas");
		painelDaJanela= (JPanel) janela.getContentPane();
		painelComAbas= new JTabbedPane();
		primeiraAba = new JPanel();
		segundaAba = new JPanel();
		terceiraAba = new JPanel();
		
		//configurar e adicionar as abas
		painelComAbas.addTab("aba 1",primeiraAba);
		painelComAbas.addTab("aba 2",segundaAba);
		painelComAbas.addTab("aba 3",terceiraAba);
		painelComAbas.setBounds(14,21,342,200);
		
		//insere texto nas abas
		primeiraAba.add(new JLabel("Esta é a primeira aba"));
		segundaAba.add(new JLabel("Esta é a segunda aba"));
		terceiraAba.add(new JLabel("Esta é a terceira aba"));
		
		//configurações do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelComAbas);
		
		//configurações da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390,300);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	}
	
	public static void main(String[] args) {
		new TesteGui11().iniciaGui();
	}
}
