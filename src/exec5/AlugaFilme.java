package exec5;

/**
 * 
 * Alugar filme com base no saldo e do filme disponivel
 * @author llopo
 * @since 12/02/2020
 * @version 0.1 
 * 
 */

import javax.swing.JOptionPane;

public class AlugaFilme {

	double valAld;
	double valPago;
	double valtot;
	int qtddias;
	boolean disp1 = true;
	boolean disp2 = true;
	int filmeAl;

	public AlugaFilme() {
		processar();

	}
	
//método de processo
	
	public void processar() {
		int filme = escolhaFilme();
		if (verDisponivel(filme)) {
			JOptionPane.showMessageDialog(null, "Filme disponivel para aluguel");
		
		
		}else {
			
			JOptionPane.showMessageDialog(null, "Filme indisponivel");
		}
	}
	//metodo para escolher um filme
	
	public int escolhaFilme() {

		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Entre com o filme escolhido"));
		if (escolha == 1) {
			return 1;
		} else {
			return 2;
		}
	}
// método para verificar a disponibilidade
	public boolean verDisponivel(int escolha) {

		if (escolha == 1) {

			if (disp1 == true) {
				return true;

			}else {
				return false;
			}
			
		} else {
			
			if (disp2 == true) {
				return true;

			} else {
				return false;

			}

		}

	}
	
//método para calcular o valor do aluguel
	
	public void calculaValor() {
		

	}
	
	

}
