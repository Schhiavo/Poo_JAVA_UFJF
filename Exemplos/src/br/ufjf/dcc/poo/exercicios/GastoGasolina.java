package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class GastoGasolina {

	public static void main(String[] args) {
		int km;
		int litro;
		km = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os Km rodados: "));
		litro = Integer.parseInt(JOptionPane.showInputDialog(null, "Capacidade tanque de combustivel: "));
		JOptionPane.showMessageDialog(null, "O carro faz " + km / litro + "Km por litro");
        
	}

}
