package ejerciciosBucles;

import java.util.Scanner;

public class OXIBucles {

	public OXIBucles() {
		// Realiza un programa que pida primero un n?mero y a continuaci?n un d?gito. El
		// programa nos debe dar la posici?n (o posiciones) contando de izquierda a
		// derecha que ocupa ese d?gito en el n?mero introducido.
		Scanner leer = new Scanner(System.in);
		 System.out.print("Introduzca un n?mero entero: ");
		    int numeroIntroducido = leer.nextInt();
		    System.out.print("Introduzca un d?gito: ");
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
