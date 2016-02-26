package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Escriba el caracter");
		char letra = sc.nextLine().charAt(0);
		sc.close();
		System.out.println((int)letra < 97 ? "Mayuscula" : "Minuscula");	
		
	}
}
