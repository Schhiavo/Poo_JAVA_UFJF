package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float altura, base, areaT, areaC, areaL;
		System.out.println("Digite o valor da base do terreno: ");
		base = teclado.nextFloat();
		System.out.println("Digite o valor da altura do terreno: ");
		altura = teclado.nextFloat();
		areaT = base * altura;
		System.out.println("Digite o valor da base da casa: ");
		base = teclado.nextFloat();
		System.out.println("Digite o valor da altura da casa: ");
		altura = teclado.nextFloat();
		areaC = base * altura;
		areaL = areaT - areaC;
		areaL = (areaL * 100) / areaT;
	    System.out.println("Area Terreno: " + areaT);
	    System.out.println("Area Casa: " + areaC);
	    System.out.println("Area Livre: %" + areaL);
		
		

	}

}
