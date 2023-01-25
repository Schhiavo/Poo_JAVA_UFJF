package exercicios_diversos_poo;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	   Scanner teclado = new Scanner(System.in);
	   float raio;
	   double area;
	   double pi = 3.14159;
	   System.out.println("Digite o valor do raio: ");
	   raio = teclado.nextFloat();
	   area = (raio * raio) * pi;
	   System.out.print("A: ");
	   System.out.printf("%.4f%n", area);

	}

}
