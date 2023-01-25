package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo02Dialog {

	public static void main(String[] args) {
	    int a;
		int b;
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor:"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor:"));
		JOptionPane.showMessageDialog(null,a + " + " + b + " = " +  (a + b));

	}

}
