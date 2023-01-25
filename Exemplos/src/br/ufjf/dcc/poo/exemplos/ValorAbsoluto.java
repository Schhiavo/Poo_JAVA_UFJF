package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class ValorAbsoluto {

	public static void main(String[] args) {
		double numero;
		numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor:"));
		if(numero < 0) {
			numero = -numero;
		}
		JOptionPane.showMessageDialog(null, "Valor absoluto: " + numero);

	}

}
