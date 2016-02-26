package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	
	int decenaDeMil;
	int unidadDeMil;
	int centena;
	int decena;
	int unidad;
	
		
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("Introduca el numero de 5 cifras: ");
	
	int cifra = sc.nextInt();
	sc.close();
		decenaDeMil= cifra/10000;
	    unidadDeMil=cifra/1000-decenaDeMil*10;
		centena=cifra/100-decenaDeMil*100-unidadDeMil*10;
		decena=cifra/10-decenaDeMil*1000-unidadDeMil*100-centena*10;
		unidad=cifra/1-decenaDeMil*10000-unidadDeMil*1000-centena*100-decena*10;

		
		System.out.println(decenaDeMil + " decenas de mil \n" + unidadDeMil+ " unidades de mil \n" + centena +" centenas \n" 
		+ decena + " decenas \n" + unidad + " unidades \n");
	
	}
}

