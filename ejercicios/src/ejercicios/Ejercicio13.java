package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Introduzca el primer numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int numero2 = sc.nextInt();
		sc.close();
		if (numero2==0)
			
			System.out.println("El divisor no puede ser 0");
			
		else 
			
			System.out.println(numero1 / numero2);
	}
}
