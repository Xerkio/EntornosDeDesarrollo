package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		double velocidadM;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los km/h para la conversion: ");
		
		double velocidadK = sc.nextDouble();
		sc.close();
		velocidadM = velocidadK * 0.2778;
		
		System.out.println("La velocidad " + velocidadK + " km/h " + " equivale a " + velocidadM + " m/s" );
		
		
	}

}
