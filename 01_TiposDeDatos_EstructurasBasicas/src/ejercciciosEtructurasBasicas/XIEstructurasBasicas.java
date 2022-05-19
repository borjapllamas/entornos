package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XIEstructurasBasicas {

	public XIEstructurasBasicas() {
		//Calcular la suma de los números pares y, al mismo tiempo, la de los impares
		//comprendidos entre 1 y 100, ambos inclusive.
		Scanner leer = new Scanner(System.in);
		String nombre;
		int sueldo;
		int mayor=0;
		String elquemas=" ";
		int menor=Integer.MAX_VALUE;
		String elmenos=" ";
		
		for (int x=0;x<4;x++) {
			System.out.println("Introduzca el nombre");
			nombre=leer.next();
			System.out.println("Introduzca el sueldo");
			sueldo=leer.nextInt();
			if (sueldo>mayor) {
				mayor=sueldo;
				elquemas=nombre;
			}
			if (sueldo<menor) {
				menor=sueldo;
				elmenos=nombre;
			}
		}
		System.out.println("El que más sueldo gana es "+elquemas+" con"+mayor+" euros.");
		System.out.println("El que más sueldo gana es "+elmenos+" con"+menor+" euros.");
	}

}
