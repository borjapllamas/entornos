package ejerciciosBucles;

import java.util.Scanner;

public class OXBucles {

	public OXBucles() {
		// Realiza un programa que pida un n?mero por teclado y que luego muestre ese
		// n?mero al rev?s.
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un n?mero");
		int numero = leer.nextInt();
		int numeroIntroducido = numero;
	    int volteado = 0;
	    
	    while (numero > 0) {
	      volteado = (volteado * 10) + (numero % 10);
	      numero /= 10;
	    } // while
	    
	    System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
		
		
	}

}
