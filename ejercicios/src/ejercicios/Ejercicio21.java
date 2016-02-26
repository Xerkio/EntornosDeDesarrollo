package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
	
		double kelvin;
		
		System.out.println("Introduzca la temperatura en grados centigrados: ");
      
        Scanner sc = new Scanner(System.in);
		
		double centigrados = sc.nextDouble();
		
		kelvin = centigrados * 273.15;
		
		System.out.println(centigrados + " ºC son " + kelvin +  " K");	
		
		System.out.print("¿Repetir proceso?");	
		System.out.print("S o N");
		
		String letra = sc.nextLine();
 		
		if(letra == "S")
			
			while(true){
			
				System.out.println("Introduzca la temperatura en grados centigrados: ");
				double centigrados2 = sc.nextDouble();
				kelvin = centigrados2 * 273.15;
				System.out.println(centigrados + " ºC son " + kelvin +  " K");	
				System.out.println("¿Repetir proceso? (S/N)");	
				return;
			}
				else
				
			System.out.println("Gracias por usar el programa.");
			
			
		
				
				
				
			
		


	}
}


//if (decision=="S") {
//			
//			Scanner cc = new Scanner(System.in);
//			System.out.println("Introduzca la temperatura en grados centigrados: ");
//			double centigrados1 = sc.nextDouble();
//			
//			kelvin = centigrados1 * 273.15;
//			
//			System.out.println(centigrados1 + " ºC son " + kelvin +  " K");	
//		
//			System.out.println("¿Repetir proceso?"+ " (S/N)");		
//			String decision1 = sc.nextLine();
			

