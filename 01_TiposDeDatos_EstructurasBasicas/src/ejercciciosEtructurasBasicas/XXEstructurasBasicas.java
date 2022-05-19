package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XXEstructurasBasicas {

	public XXEstructurasBasicas() {
		// Calcula la suma de la progresi�n geom�trica 1 + x + x + x + x +.....+ x ,
		// siendo x y n valores enteros que se introducir�n desde teclado.
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce el valor que recibir� x");
		int x = leer.nextInt();
		System.out.println("Introduce las veces que se repetir� (el valor n)");
		int n = leer.nextInt();
		int suma = serie(x, n);
		System.out.println("La suma de la progresi�n geom�trica es : " + suma);
	}

	private int serie(int x, int n) {
		int fooder = 0;
		for (int i = 0; i <= n; i++) {
			fooder += Math.pow(x, i);
		}
		return fooder;
	}

}