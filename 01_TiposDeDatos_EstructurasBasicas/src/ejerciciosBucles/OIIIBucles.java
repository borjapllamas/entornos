package ejerciciosBucles;

import java.util.Scanner;

public class OIIIBucles {

	public OIIIBucles() {
		// Realiza el control de acceso a una caja fuerte. La combinaci?n ser? un n?mero
		// de 4 cifras. El programa nos pedir? la combinaci?n para abrirla. Si no
		// acertamos, se nos mostrar? el mensaje "Lo siento, esa no es la combinaci?n" y
		// si acertamos se nos dir? "La caja fuerte se ha abierto satisfactoriamente".
		// Tendremos cuatro oportunidades para abrir la caja fuerte.
		Scanner leer = new Scanner(System.in);
		int intentos = 4;
		int numeroIntroducido = 0;
		boolean acertado = false;
		do {
			System.out.println("tiene" + intentos + "intentos");
			System.out.println("Introduzca la clave de la caja fuerte");
			numeroIntroducido = leer.nextInt();
			if (numeroIntroducido == 1234) {
				acertado = true;
			} else {
				System.out.println("Clave incorrecta");
			}
			intentos--;
		} while ((intentos > 0) && (!acertado));
		if (acertado) {
			System.out.println("Ha abierto la caja fuerte.");
			
	} else {
		System.out.println("Lo siento, ha agotado las 4 oportunidades.");
	}
		
  }
}
