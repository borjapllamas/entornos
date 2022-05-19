package ejerciciosBucles;

import java.util.Scanner;

public class OIXBucles {

	public OIXBucles() {
		// Realiza un programa que vaya pidiendo números hasta que se introduzca un
		// número negativo y nos diga cuantos números se han introducido, la media de
		// los impares y el mayor de los pares. El número negativo sólo se utiliza para
		// indicar el final de la introducción de datos pero no se incluye en el
		// cómputo.
		Scanner leer = new Scanner(System.in);
		System.out.println("Vaya introduciendo números enteros.");
		System.out.println("Puede terminar mediante la introducción de un número negativo.");

		int numeroIntroducido;
		int numeroDeElementos = 0;
		int sumaImpares = 0;
		int numeroDeElementosImpares = 0;
		int maximoPar = 0;

		do {
			numeroIntroducido = leer.nextInt();
			if (numeroIntroducido >= 0) {
				numeroDeElementos++;
				if ((numeroIntroducido % 2) == 1) { // número impar
					sumaImpares += numeroIntroducido;
					numeroDeElementosImpares++;
				} else { // número par
					if (numeroIntroducido > maximoPar)
						maximoPar = numeroIntroducido;
				}
			}
		} while (numeroIntroducido >= 0);

		System.out.println("Ha introducido " + numeroDeElementos + " números");
		System.out.println("La media de los impares es " + sumaImpares / numeroDeElementosImpares);
		System.out.println("El máximo de los pares es " + maximoPar);
	}

}
