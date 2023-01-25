package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Repeticao {

	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de vezes:"));
		for(int i = 0; i < num; i++) {
			JOptionPane.showMessageDialog(null, "Faça os exercícios novamente!");
		}

	}

}
