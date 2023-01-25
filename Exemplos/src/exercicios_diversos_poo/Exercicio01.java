package exercicios_diversos_poo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b;
		int soma;
		System.out.println("Digite o primeiro valor: ");
		a = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = teclado.nextInt();
		soma = a + b;
		System.out.println("SOMA: " + soma);
	
	}

}
