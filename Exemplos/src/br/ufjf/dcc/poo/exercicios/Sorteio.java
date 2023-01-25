package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Sorteio {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 100);
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));
		
		if(num != x) {
			if(num > x) {
				JOptionPane.showMessageDialog(null, "Palpite maior que o numero sorteado!");
			}
			else{
				JOptionPane.showMessageDialog(null, "Palpite menor que o numero sorteado!");
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Acertou!");
		}

	}

}
