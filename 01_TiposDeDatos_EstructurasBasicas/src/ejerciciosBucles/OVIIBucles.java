package ejerciciosBucles;

import java.util.Scanner;

public class OVIIBucles {

	public OVIIBucles() {
		// Escribe un programa que diga si un número introducido por teclado es o no
		// primo. Un número primo es aquel que sólo es devisible entre él mismo y la
		// unidad.
		int num, x = 2, resto = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un número entero.");
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
