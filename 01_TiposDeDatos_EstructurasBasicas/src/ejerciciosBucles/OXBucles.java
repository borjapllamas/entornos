package ejerciciosBucles;

import java.util.Scanner;

public class OXBucles {

	public OXBucles() {
		// Realiza un programa que pida un número por teclado y que luego muestre ese
		// número al revés.
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un número");
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
