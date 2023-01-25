package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
	    double delta;
		double x1, x2;
		float xx1, xx2;
		System.out.println("Valor de a: ");
		a = teclado.nextInt();
		System.out.println("Valor de b: ");
		b = teclado.nextInt();
		System.out.println("Valor de c: ");
		c = teclado.nextInt();
		
		delta = (b * b) - (4 * a * c);
		delta = Math.sqrt(delta);
		x1 = (-b + delta) / 2*a;
		x2 = (-b - delta) / 2*a;
		
		/*
		 * Método cast, transformando um tipo em outro
		xx1 = (float) (-b + delta) / 2*a;
		xx2 = (float) (-b - delta) / 2*a;
		*/
		
		System.out.println("X1: " + x1);
		System.out.println("X2: " + x2);
		
		
		/*
		System.out.println("XX1: " + xx1);
		System.out.println("XX2: " + xx2);
		*/
		
		

	}

}
