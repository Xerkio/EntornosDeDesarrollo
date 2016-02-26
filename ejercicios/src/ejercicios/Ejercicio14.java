package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero: ");
		int numero1=sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int numero2=sc.nextInt();
		System.out.println("Introduzca el tercer numero: ");
		int numero3=sc.nextInt();
		sc.close();
		if (numero1 > numero2 && numero1 > numero3)		
		
			System.out.println("El numero mayor es el primer numero ");	
		
		else if (numero2 > numero1 && numero2 > numero3)
				System.out.println("El numero mayor es el segundo numero ");
			
		else if (numero3 > numero1 && numero3 > numero2)
				System.out.println("El numero mayor es el tercer numero ");
				
	}
}
