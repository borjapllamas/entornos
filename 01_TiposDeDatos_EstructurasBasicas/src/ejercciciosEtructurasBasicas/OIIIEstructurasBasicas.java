package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class OIIIEstructurasBasicas {

	public OIIIEstructurasBasicas() {
		//Introducir un número entero por teclado que se supone que es una hora del día. Indicar
		//si corresponde a la mañana (entre las 6 y las 11, ambas inclusive), si es una hora de la
		//tarde (entre las 12 y las 19, ambas inclusive), si es de la noche (entre las 20 y las 23,
		//ambas inclusive), si es de la madrugada (entre las 0 y las 5, ambas inclusive) o bien, si no
		//puede corresponder a una hora del día.
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce una hora");
		int num = leer.nextInt();
		if (num>=6 && num<=11) {
			System.out.println("La hora corresponde a la mañana.");
		}
		else if (num>=12 && num<=19) {
			System.out.println("La hora corresponde a la tarde.");
		}
		else if (num>=20 && num<=23) {
			System.out.println("La hora corresponde a la noche.");
		}
		else if (num>=0 && num<=5) {
			System.out.println("La hora corresponde a la madrugada");
		}
		else {
			System.out.println("No corresponde a ninguna hora del día.");
		}
	}

}
