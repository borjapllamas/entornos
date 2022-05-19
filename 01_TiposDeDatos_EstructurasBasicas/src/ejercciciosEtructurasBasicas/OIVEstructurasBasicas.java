package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class OIVEstructurasBasicas {

	public OIVEstructurasBasicas() {
		//Introducir un número entero por teclado que se supone que es un mes del año. Si es así,
		//indicar cuántos días tiene el mes que le antecede.
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un número por teclado que corresponde a un mes del año");
		int num = leer.nextInt();
		switch (num) {
		case 1 : 
			System.out.println("El mes anterior es Diciembre y tiene 31 días.");
			break;
		case 2 : 
			System.out.println("El mes anterior es Enero y tiene 31 días.");
			break;
		case 3 : 
			System.out.println("El mes anterior es Febrero y tiene 28 días.");
			break;
		case 4 : 
			System.out.println("El mes anterior es Marzo y tiene 31 días.");
			break;
		case 5 :
			System.out.println("El mes anterior es Abril y tiene 30 días.");
			break;
		case 6 :
			System.out.println("El mes anterior es Mayo y tiene 31 días.");
			break;
		case 7 :
			System.out.println("El mes anterior es Junio y tiene 30 días");
			break;
		case 8 :
			System.out.println("El mes anterior es Julio y tiene 31 días");
			break;
		case 9 :
			System.out.println("El mes anterior es Agosto y tiene 31 días");
			break;
		case 10 :
			System.out.println("El mes anterior es Septiembre y tiene 30 días");
			break;
		case 11 :
			System.out.println("El mes anterior es Octubre y tiene 31 días");
			break;
		case 12 :
			System.out.println("El mes anterior es Noviembre y tiene 30 días");
			break;
		}
		
	}

}
