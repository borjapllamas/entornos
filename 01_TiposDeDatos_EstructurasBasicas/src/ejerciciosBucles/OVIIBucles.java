package ejerciciosBucles;

import java.util.Scanner;

public class OVIIBucles {

	public OVIIBucles() {
		// Escribe un programa que diga si un n?mero introducido por teclado es o no
		// primo. Un n?mero primo es aquel que s?lo es devisible entre ?l mismo y la
		// unidad.
		int num, x = 2, resto = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un n?mero entero.");
		num = leer.nextInt();
        while (num>x && resto!=0) {
        	resto = num%x;
        	if (resto!=0) {
        		x++;
        	}
        }
        if (num%x == 0) {
            System.out.println("el numero " + num + " No es primo ");
            
        } else if (num%x != 0) {
            System.out.println("el numero " + num + " Es primo ");
            
        }
	}
}
