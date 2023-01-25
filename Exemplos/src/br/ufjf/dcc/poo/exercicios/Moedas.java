package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Moedas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a quantidade em centavos: ");
		int caixa = teclado.nextInt();
		int moed50 = caixa / 50;
		int moed25 = caixa % 50;
		int moed10 = moed25 % 25;
		int moed5 = moed10 % 10;
		moed25 = moed25 / 25;
		moed10 = moed10 / 10;
		moed5 = moed5 / 5;
		System.out.println(caixa+ " centavos" + " em moedas é: " + moed50+ 
				" de 50" + " centavos, " + moed25 + " de 25 centavos, " + moed10 +
				" de 10 centavos e " + moed5 + " de 5 centavos!");

	}

}
