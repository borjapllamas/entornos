package ejerciciosBucles;

import java.util.Scanner;

public class OXIBucles {

	public OXIBucles() {
		// Realiza un programa que pida primero un número y a continuación un dígito. El
		// programa nos debe dar la posición (o posiciones) contando de izquierda a
		// derecha que ocupa ese dígito en el número introducido.
		Scanner leer = new Scanner(System.in);
		 System.out.print("Introduzca un número entero: ");
		    int numeroIntroducido = leer.nextInt();
		    System.out.print("Introduzca un dígito: ");
		    int digito = leer.nextInt();
		    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
		    int numero = numeroIntroducido;
		    int longitud = String.valueOf(numero).length();
		    int posicion = 0;
		    while (numeroIntroducido > 0) {
		      if ((numero % 10) == digito) {
		        System.out.print(longitud - posicion);
		      }
		      numero /= 10;
		      posicion++;
		    } 
		    System.out.println();
	}
}
