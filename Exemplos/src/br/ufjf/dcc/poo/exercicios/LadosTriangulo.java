package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class LadosTriangulo {

	public static void main(String[] args) {
		double a, b, c;
		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado a: "));
		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado b: "));
		c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado c: "));
		
		if(a < (Math.abs(b - c)) || a > b + c) {
			JOptionPane.showMessageDialog(null, "Triângulo Inválido");
		}
		else if(b < (Math.abs(a - c)) || b > a + c) {
			JOptionPane.showMessageDialog(null, "Triângulo Inválido");
		}
		else if(c < (Math.abs(a - b)) || c > a + b) {
			JOptionPane.showMessageDialog(null, "Triângulo Inválido");
		}
		else {
			JOptionPane.showMessageDialog(null, "Triângulo Válido");
		}

		

	}

}
