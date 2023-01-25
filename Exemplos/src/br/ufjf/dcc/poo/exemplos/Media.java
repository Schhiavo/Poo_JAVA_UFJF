package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    float a, b, c;
		float media;
		System.out.println("Digite o primeiro valor: ");
		a = teclado.nextFloat();
		System.out.println("Digite o segundo valor: ");
		b = teclado.nextFloat();
		System.out.println("Digite o terceiro valor: ");
		c = teclado.nextFloat();
		media = (a + b + c ) / 3;
		System.out.println("Média: " + media);
		
		

	}

}
