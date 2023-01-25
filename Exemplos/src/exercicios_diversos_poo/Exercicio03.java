package exercicios_diversos_poo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("A: ");
		a = teclado.nextInt();
		System.out.println("B: ");
		b = teclado.nextInt();
		System.out.println("C: ");
		c = teclado.nextInt();
		System.out.println("D: ");
        d = teclado.nextInt();
        
        System.out.println("DIFERENCA: " + (a * b - c * d));
	}

}
