package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		double longitudC;
		double areaC;
		double pi = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el radio de la circunferencia: ");
		
		double radio = sc.nextDouble();
		sc.close();
		longitudC = 2*pi*radio;
		
		areaC = (pi*radio)*(pi*radio);
		
		System.out.println("La longitud de la circunferencia es " + longitudC + " \n "
		+ "el area de la circunferencia es " + areaC);

	}

}
