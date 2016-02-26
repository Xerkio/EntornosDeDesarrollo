package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		double fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba los grados centigrados para la conversion :");
		
		double centigrado = sc.nextDouble();
		sc.close();
		fahrenheit = 32 + ( 9 * centigrado / 5);
		
		System.out.println(centigrado + " son " + fahrenheit  + " grados Fahrenheit.");
		
	}
}
