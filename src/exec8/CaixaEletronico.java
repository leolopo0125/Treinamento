package exec8;

import javax.swing.JOptionPane;

/**
 * Caixa eletronico
 * 
 * @author llopo
 * @version 0.1
 * @since 17/02/2020
 */

public class CaixaEletronico {

	boolean psaque = true;
	boolean saida = false;
	double valor = 0;

	public CaixaEletronico() {
		while (!saida) {
			menu();
		}
	}

	public void menu() {
		try {
			String m = JOptionPane.showInputDialog("1- Sacar um valor \n 2-Sair.");

			if (m == null) {
				m = "2";

			}

			int r = Integer.parseInt(m);

			switch (r) {

			case 1:
				valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor a ser sacado."));
				saque(valor);
				break;

			case 2:
				saida = true;

				break;

			}

		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(null, "Opção inválida");
		}

	}

//método de
	public void saque(double valor) {

		int nota2 = 0, nota5 = 0, nota10 = 0, nota20 = 0, nota50 = 0;

		while (valor != 0 || !psaque) {

			if (valor >= 50 && !((valor - 50) == 3) && !((valor - 50) == 1)) {
				nota50++;
				valor = valor - 50;

			} else if (valor >= 20 && !((valor - 20) == 3) && !((valor - 20) == 1)) {
				nota20++;
				valor = valor - 20;

			} else if (valor >= 10 && !((valor - 10) == 3) && !((valor - 10) == 1)) {
				nota10++;
				valor = valor - 10;

			} else if (valor >= 5 && !((valor - 5) == 3) && !((valor - 5) == 1)) {
				nota5++;
				valor = valor - 5;
				

			} else if (valor >= 2 && !((valor - 2) == 3) && !((valor - 2) == 1)) {
				nota2++;
				valor = valor - 2;

			} else {

				psaque = false;
				break;
			}

		}
		if (nota2 != 0 || nota5 != 0 || nota10 != 0 || nota20 != 0 || nota50 != 0) {
			exibir(nota2, nota5, nota10, nota20, nota50);
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possivel sacar");
		}
		

	}

	public static void exibir(int nota2, int nota5, int nota10, int nota20, int nota50) {
		JOptionPane.showMessageDialog(null, "Notas de 50: " + nota50 + "\nNotas de 20: " + nota20 + "\nNotas de 10: "
				+ nota10 + "\nNotas de 5: " + nota5 + "\nNotas de 2: " + nota2);

	}

	public static void main(String[] args) {

		new CaixaEletronico();

	}
}
