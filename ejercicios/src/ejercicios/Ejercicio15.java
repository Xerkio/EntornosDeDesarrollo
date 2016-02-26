package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero del mes : ");
		
		int mes = sc.nextInt();
		sc.close();
		
		if (mes == 1 |mes ==  3 | mes == 5 | mes == 7 |mes == 8 | mes == 10 | mes == 12 )
			
				System.out.println("El mes tiene 31 dias.");
		
			else if (mes == 2)

				System.out.println("El mes tiene 28 dias.");
			
			else if (mes == 2 |mes ==  4 | mes == 6 | mes == 9 |mes == 11 )
			
				System.out.println("El mes tiene 30 dias");
			
			else
			
				System.out.println("El mes introducido no existe.");	
		
		switch(mes)
		{
		  case 1: System.out.println("El mes se llama Enero");
		  		break;
		  case 2:  System.out.println("El mes se llama Febrero");
		  		break;
		  case 3:  System.out.println("El mes se llama Marzo ");
		  		break;
		  case 4:  System.out.println("El mes se llama Abril ");	  
		  		break;
		  case 5: System.out.println("El mes se llama Mayo");
		  		break;
		  case 6:  System.out.println("El mes se llama Junio");
		  		break;
		  case 7: System.out.println("El mes se llama Julio");
		  		break;
		  case 8:  System.out.println("El mes se llama Agosto");
				break;
		  case 9:  System.out.println("El mes se llama Septiembre");
		  		break;
		  case 10:  System.out.println("El mes se llama Octubre");
		  		break;
		  case 11:  System.out.println("El mes se llama Noviembre");
		  		break;
		  case 12:  System.out.println("El mes se llama Diciembre");
	  		break;
		  
		}
				
	}
	
}
