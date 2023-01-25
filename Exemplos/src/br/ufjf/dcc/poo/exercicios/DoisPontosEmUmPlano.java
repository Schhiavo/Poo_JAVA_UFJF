package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class DoisPontosEmUmPlano {

	public static void main(String[] args) {
		double x1, x2;
		double y1, y2;
		double distancia;
		x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro ponto x:"));
		x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo ponto x:"));
		y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro ponto y:"));
		y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo ponto y:"));
		distancia = Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
		JOptionPane.showMessageDialog(null, "Distancia: " + distancia);

		
	}

}
