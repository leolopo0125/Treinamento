package exec7;

import javax.swing.JOptionPane;

/**
 * Classe de busca com base em informações armazenadas e obtidas via usuario
 * 
 * @author llopo
 * @since 13/02/2020
 * @version 0.1
 * 
 * 
 */
public class Locadora {
	static Carro vetorCarro[] = new Carro[20];

	boolean saida = false;

	public static void main(String[] args) {

		Carro c1 = new Carro("UNO COM ESCADA", "AUG3309", 480, "GASOLINA", 14000, "VERMELHO", false);
		vetorCarro[0] = c1;

		Carro c2 = new Carro("CELTA", "QUC9092", 200, "ALCOOL", 12000, "VERMELHO", false);
		vetorCarro[1] = c2;

		Carro c3 = new Carro("OPALA", "ORE0273", 320, "GASOLINA", 58000, "PRETO", false);
		vetorCarro[2] = c3;

		Carro c4 = new Carro("GOL", "AGF8965", 180, "FLEX", 11500, "AZUL", false);
		vetorCarro[3] = c4;

		Carro c5 = new Carro("CORSA", "AWK3094", 200, "DIESEL", 12000, "AZUL", false);
		vetorCarro[4] = c5;

		Carro c6 = new Carro("MUSTANG", "QOS9830", 320, "FLEX", 115000, "LARANJA", false);
		vetorCarro[5] = c6;

		Carro c7 = new Carro("FUSCA", "QOD0143", 320, "GASOLINA", 115000, "AMARELO", false);
		vetorCarro[6] = c7;

		Carro c8 = new Carro("HILUX", "KOU0192", 240, "DIESEL", 50000, "BRANCO", false);
		vetorCarro[7] = c8;

		Carro c9 = new Carro("CHEVETT", "YIU0289", 210, "ALCOOL", 20000, "PRETO", false);
		vetorCarro[8] = c9;

		Carro c10 = new Carro("OPALA", "OPT2893", 320, "GASOLINA", 68000, "PRETO", false);
		vetorCarro[9] = c10;

		for (int i = 10; i < vetorCarro.length; i++) {
			vetorCarro[i] = new Carro("", "", 0, "", 0, "", true);
		}

		new Locadora();

	}

	public Locadora() {
		while (!saida) {
			buscar();
		}

	}

// método para decisão de busca.
	public void buscar() {
		try {
			String aux = JOptionPane.showInputDialog(
					"escolha a opção de busca:\n 1- modelo \n2- Velocidade \n3- combustivel \n 4-Ordenar em ordem decrescente \n5-pesquisa por cor \n6-C"
							+ "omprar via pesquisa por cor e modelo \n7-Inserir novo carro \n9-Sair.");

			if (aux == null) {
				aux = "9";

			}

			int r = Integer.parseInt(aux);

			switch (r) {

			case 1:

				try {

					String modelo = JOptionPane.showInputDialog("Insira o modelo a ser buscado:").toUpperCase();

					busca(modelo);

				} catch (java.lang.NullPointerException n) {

				}

				break;

			case 2:

				try {

					int vel = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade a ser buscada:"));

					busca1(vel);

					break;

				} catch (java.lang.NullPointerException n) {

				}

			case 3:

				try {

					String comb = JOptionPane.showInputDialog("Entre com o tipo de combustivel para busca:")

							.toUpperCase();

					busca2(comb);

				} catch (java.lang.NullPointerException n) {

				}

				break;

			case 4:

				listarCarro();

				break;

			case 5:

				try {

					String cor1 = JOptionPane.showInputDialog("Entre com a cor desejada").toUpperCase();

					busca3(cor1);

				} catch (java.lang.NullPointerException n) {

				}

				break;

			case 6:

				try {

					String model1 = JOptionPane.showInputDialog("Insira o modelo a ser buscado:").toUpperCase();

					String cor2 = JOptionPane.showInputDialog("Insira a cor:").toUpperCase();

					bcmc(model1, cor2);

				} catch (java.lang.NullPointerException n) {

				}

				break;

			case 7:

				try {

					String model = JOptionPane.showInputDialog("Insira o modelo do veiculo:").toUpperCase();

					String plac = JOptionPane.showInputDialog("Insira a placa do veiculo:").toUpperCase();

					String combs = JOptionPane.showInputDialog("Insira o tipo de combustivel:").toUpperCase();

					String cor = JOptionPane.showInputDialog("Insira a cor do veiculo:").toUpperCase();

					int vel1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade maxima do veiculo:"));

					double val = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do veiculo:"));

					inserir(model, plac, combs, cor, vel1, val);

				} catch (java.lang.NullPointerException n) {

				} catch (NumberFormatException e) {

				}

				break;

			case 9:

				saida = true;

				break;

			default:

				JOptionPane.showMessageDialog(null, "Opção invalida!");

				break;

			}

		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(null, "Entre com uma opção válida!");

			buscar();

		}

	}

//busca por modelo e cor

	public void bcmc(String model1, String cor2) {

		int indic = 1;

		int c = 0;

		Carro aux[] = new Carro[10];

		String exibir = "";

		boolean encontrou = false;

		ordenar1();

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].modCarro.equals(model1) && vetorCarro[i].cor.equals(cor2) && !vetorCarro[i].vendido) {

				exibir = exibir + indic + "-Opção\nModelo do carro: " + vetorCarro[i].modCarro + "\nPlaca do carro: "

						+ vetorCarro[i].placaCarro + "\nVelocidade máxima do carro: " + vetorCarro[i].velMax + " KM/HR"

						+ "\nTipo de combustivel: " + vetorCarro[i].combustivel + "\nValor de Compra: R$"

						+ vetorCarro[i].valor + "\nCor do carro: " + vetorCarro[i].cor + "\n";

				encontrou = true;

				aux[c] = vetorCarro[i];

				c++;

				indic++;

			}

		}

		if (!encontrou) {

			JOptionPane.showMessageDialog(null, "O Modelo ou Cor não foi encontrado!");

		} else {

			int opc = Integer.parseInt((JOptionPane.showInputDialog("Escolha uma das opções abaixo:\n" + exibir)));

			opc = opc - 1;

			if (opc > c) {

				JOptionPane.showMessageDialog(null, "Opção invalida.");

			} else {

				int r = Integer.parseInt((JOptionPane.showInputDialog(

						"O carro escolhido foi:\n" + aux[opc].modCarro + "\nplaca: " + aux[opc].placaCarro

								+ "\nvelocidade: " + aux[opc].velMax + "KM/HR" + "\nTipo de combustivel: "

								+ aux[opc].combustivel + "\n Com o valor de: R$" + aux[opc].valor + "\n 1-Sim 2-Não")));

				switch (r) {

				case 1:

					double valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor a pagar"));

					if (valor >= aux[opc].valor) {

						double tr = valor - aux[opc].valor;

						for (int i = 0; i < vetorCarro.length; i++) {

							if (vetorCarro[i].placaCarro.equals(aux[opc].placaCarro)) {

								vetorCarro[i].vendido = true;

								vetorCarro[i].modCarro = "";

								vetorCarro[i].placaCarro = "";

								vetorCarro[i].velMax = 0;

								vetorCarro[i].combustivel = "";

								vetorCarro[i].cor = "";

								vetorCarro[i].valor = 0;

							}

						}

						JOptionPane.showMessageDialog(null, "A venda foi efetuada com sucesso e o troco é de: R$" + tr);

					} else {

						JOptionPane.showMessageDialog(null, "Saldo insuficiente para a compra.");

					}

					break;

				case 2:

					break;

				default:

					JOptionPane.showMessageDialog(null, "Opção inválida.");

					break;

				}

			}

		}

	}

// busca por modelo de carro

	public void busca(String modelo) {

		String exibir;

		exibir = "";

		boolean encontrou = false;

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].modCarro.equals(modelo) && !vetorCarro[i].vendido) {

				exibir = exibir + "\nModelo do carro: " + vetorCarro[i].modCarro + "\nPlaca do carro: "

						+ vetorCarro[i].placaCarro + "\nVelocidade máxima do carro: " + vetorCarro[i].velMax + " KM/HR"

						+ "\nTipo de combustivel: " + vetorCarro[i].combustivel + "\nValor de Compra: R$"

						+ vetorCarro[i].valor + "\nCor do carro: " + vetorCarro[i].cor + "\n";

				encontrou = true;

			}

		}

		if (!encontrou) {

			JOptionPane.showMessageDialog(null, "Modelo não encontrado!");

		} else {

			JOptionPane.showMessageDialog(null, exibir);

		}

	}

// busca por velocidade maxima

	public void busca1(int vel) {

		boolean encontrou = false;

		String exibir = "";

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].velMax == (vel) && !vetorCarro[i].vendido) {

				exibir = exibir + "\nModelo do carro: " + vetorCarro[i].modCarro + "\nPlaca do carro: "

						+ vetorCarro[i].placaCarro + "\nVelocidade máxima do carro: " + vetorCarro[i].velMax + " KM/HR"

						+ "\nTipo de combustivel: " + vetorCarro[i].combustivel + "\nValor de Compra: R$"

						+ vetorCarro[i].valor + "\nCor do carro: " + vetorCarro[i].cor + "\n";

				encontrou = true;

			}

		}

		if (!encontrou) {

			JOptionPane.showMessageDialog(null, "Limite de velocidade não encontrado!");

		} else {

			JOptionPane.showMessageDialog(null, exibir);

		}

	}

// busca por tipo de combustivel.

	public void busca2(String comb) {

		boolean encontrou = false;

		String exibir = "";

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].combustivel.equals(comb) && !vetorCarro[i].vendido) {

				exibir = exibir + "\nModelo do carro: " + vetorCarro[i].modCarro + "\nPlaca do carro: "

						+ vetorCarro[i].placaCarro + "\nVelocidade máxima do carro: " + vetorCarro[i].velMax + " KM/HR"

						+ "\nTipo de combustivel: " + vetorCarro[i].combustivel + "\nValor de Compra: R$"

						+ vetorCarro[i].valor + "\nCor do carro: " + vetorCarro[i].cor + "\n";

				encontrou = true;

			}

		}

		if (!encontrou) {

			JOptionPane.showMessageDialog(null, "Tipo de combustivel não encontrado!");

		} else {

			JOptionPane.showMessageDialog(null, exibir);

		}

	}

// MÉTODO PARA LISTAR CARROS ORDENADOS

// método para ordenar e exibir

	public void listarCarro() {

		ordenar();

		String exibir = "";

		for (int o = 0; o < vetorCarro.length; o++) {

			if (!vetorCarro[o].vendido) {

				exibir = exibir + "\nModelo do carro: " + vetorCarro[o].modCarro + "\nPlaca do carro: "

						+ vetorCarro[o].placaCarro + "\nVelocidade máxima do carro: " + vetorCarro[o].velMax + " KM/HR"

						+ "\nTipo de combustivel: " + vetorCarro[o].combustivel + "\nValor de Compra: R$"

						+ vetorCarro[o].valor + "\nCor do carro: " + vetorCarro[o].cor + "\n";

			}

		}

		JOptionPane.showMessageDialog(null, exibir);

	}

// ordenando os carros em ordem decrescente com base no valor

	public void ordenar() {

		for (int i = 0; i < vetorCarro.length - 1; i++) {

			for (int j = i; j < vetorCarro.length; j++) {

				if (vetorCarro[i].valor < vetorCarro[j].valor) {

					Carro aux = vetorCarro[i];

					vetorCarro[i] = vetorCarro[j];

					vetorCarro[j] = aux;

				}

			}

		}

	}

//ORDERNAR EM ORDEM CRESCENTE

	public void ordenar1() {

		for (int i = 0; i < vetorCarro.length - 1; i++) {

			for (int j = i; j < vetorCarro.length; j++) {

				if (vetorCarro[i].valor > vetorCarro[j].valor) {

					Carro aux = vetorCarro[i];

					vetorCarro[i] = vetorCarro[j];

					vetorCarro[j] = aux;

				}

			}

		}

	}

// método para buscar com base na cor

	public void busca3(String cor1) {

		boolean encontrou = false;

		String exibir = "";

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].cor.equals(cor1) && !vetorCarro[i].vendido) {

				exibir = exibir + "\nModelo do carro: " + vetorCarro[i].modCarro + "\nPlaca do carro: "

						+ vetorCarro[i].placaCarro + "\nVelocidade máxima do carro: " + vetorCarro[i].velMax + " KM/HR"

						+ "\nTipo de combustivel: " + vetorCarro[i].combustivel + "\nValor de Compra: R$S"

						+ vetorCarro[i].valor + "\nCor do carro: " + vetorCarro[i].cor + "\n";

				encontrou = true;

			}

		}

		if (!encontrou) {

			JOptionPane.showMessageDialog(null, "Cor não encontrada!");

		} else {

			JOptionPane.showMessageDialog(null, exibir);

		}

	}

// método para inserir novo veiculo

	public void inserir(String model, String plac, String combs, String cor, int vel1, double val) {

		boolean inserido = false;

		for (int i = 0; i < vetorCarro.length; i++) {

			if (vetorCarro[i].vendido && vetorCarro[i].modCarro.equals("")) {

				vetorCarro[i].vendido = false;

				vetorCarro[i].modCarro = model;

				vetorCarro[i].placaCarro = plac;

				vetorCarro[i].velMax = vel1;

				vetorCarro[i].combustivel = combs;

				vetorCarro[i].cor = cor;

				vetorCarro[i].valor = val;

				inserido = true;

				JOptionPane.showMessageDialog(null, "Veiculo Inserido com sucesso!");

				break;

			}

		}

		if (!inserido) {

			JOptionPane.showMessageDialog(null, "O estoque esta cheio!");

		}

	}

}