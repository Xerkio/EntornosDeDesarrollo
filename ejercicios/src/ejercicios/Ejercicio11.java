package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero entero: ");
		
		int entero = sc.nextInt();
		sc.close();
		System.out.println((entero%2==0 ? "Es par" : "Es impar") + " y " + (entero%10==0 ? "es multiplo de 10" : "no es multiplo de 10"));
		
	}

}
