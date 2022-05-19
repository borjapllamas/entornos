package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XEstructurasBasicas {

	public XEstructurasBasicas() {
		//Leer 10 datos, compuesto cada uno de ellos por un nombre de persona y su sueldo
		//neto mensual, y obtener y visualizar el nombre y sueldo de la persona que más cobra y de
		//la que menos. Si hay varias con el mismo sueldo (máximo o mínimo) se presentará la
		//primera que aparezca en la secuencia de entrada.
		Scanner leer = new Scanner(System.in);
		int sueldoMayor = 0, sueldoMenor = Integer.MAX_VALUE, sueldo = 0;
		String nombreMayorSalario = "", nombreMenorSalario = "", nombre = "";
		for (int x = 1; x < 11; x++) {
		System.out.println("Introduzca el nombre :");
		nombre = leer.next();
		System.out.println("Introduzca su salario :");
		sueldo = leer.nextInt();
		if (sueldo > sueldoMayor) {
		sueldoMayor = sueldo;
		nombreMayorSalario = nombre;
		}
		if (sueldo < sueldoMenor) {
		sueldoMenor = sueldo;
		nombreMenorSalario = nombre;
		}
		}
		System.out.println(nombreMayorSalario + " es la persona con mayor salario.. " + sueldoMayor + " euros");
		System.out.println(nombreMenorSalario + " es la persona con menor salario.. " + sueldoMenor + " euros");
		
	}

}
