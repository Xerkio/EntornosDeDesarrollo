package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int numero2 = sc.nextInt();	
		sc.close();
		
		for (int i = numero1; i < numero2*2; i++) {
			
			if (i%2 != 0)
			
			System.out.println(i);
			
		}
		
	}
}
