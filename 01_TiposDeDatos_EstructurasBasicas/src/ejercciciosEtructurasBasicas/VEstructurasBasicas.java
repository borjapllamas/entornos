package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class VEstructurasBasicas {

	public VEstructurasBasicas() {
		//Introducir un número entero por teclado que se supone que es un año. Indicar si es
		//bisiesto o no y por qué motivo (P.e.: “Es bisiesto por ser múltiplo de 4 y no de 100”. P.e.:
		//“Es bisiesto por ser múltiplo de 400”. P.e.: “No es bisiesto por ser múltiplo de 100”).
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un número por teclado (el número equivale a un año)");
		int num = leer.nextInt();
		int multiplo4, multiplo100, multiplo400, EsBisiesto, NoEsBisiesto;
		if ((num%4==0) && (num%100 !=0)) {
			multiplo4 = num/=4;
			EsBisiesto = num/=4;
			System.out.println("El año introducido es Bisiesto.");
		}
		else if ((num%100==0) && (num%400 !=0)) {
			multiplo4 = num/=100;
			NoEsBisiesto = num/=100;
			System.out.println("El año introducido no es Bisiesto.");
		}
		else if (num%400==0) {
			multiplo4 = num/=400;
			NoEsBisiesto = num/=400;
			System.out.println("El año introducido no es Bisiesto.");
		}
		else System.out.println("El año introducido no es Bisiesto.");
		
		
	}

}
