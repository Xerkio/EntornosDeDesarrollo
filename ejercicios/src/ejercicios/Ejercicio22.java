package ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduzca el numero: ");
		int cifra = sc.nextInt();
		
		System.out.println("La tabla de multiplicar del " + cifra + " es: " );
		
		for (int i = 0; i <= 10; i++) {
			
			
			System.out.println(cifra * i);
			
		}
		
		
		
	}

}




