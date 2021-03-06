package ejerciciosBucles;

import java.util.Scanner;

public class OIXBucles {

	public OIXBucles() {
		// Realiza un programa que vaya pidiendo n?meros hasta que se introduzca un
		// n?mero negativo y nos diga cuantos n?meros se han introducido, la media de
		// los impares y el mayor de los pares. El n?mero negativo s?lo se utiliza para
		// indicar el final de la introducci?n de datos pero no se incluye en el
		// c?mputo.
		Scanner leer = new Scanner(System.in);
		System.out.println("Vaya introduciendo n?meros enteros.");
		System.out.println("Puede terminar mediante la introducci?n de un n?mero negativo.");

		int numeroIntroducido;
		int numeroDeElementos = 0;
		int sumaImpares = 0;
		int numeroDeElementosImpares = 0;
		int maximoPar = 0;

		do {
			numeroIntroducido = leer.nextInt();
			if (numeroIntroducido >= 0) {
				numeroDeElementos++;
				if ((numeroIntroducido % 2) == 1) { // n?mero impar
					sumaImpares += numeroIntroducido;
					numeroDeElementosImpares++;
				} else { // n?mero par
					if (numeroIntroducido > maximoPar)
						maximoPar = numeroIntroducido;
				}
			}
		} while (numeroIntroducido >= 0);

		System.out.println("Ha introducido " + numeroDeElementos + " n?meros");
		System.out.println("La media de los impares es " + sumaImpares / numeroDeElementosImpares);
		System.out.println("El m?ximo de los pares es " + maximoPar);
	}

}
