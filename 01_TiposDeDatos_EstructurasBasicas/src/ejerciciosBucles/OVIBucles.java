package ejerciciosBucles;

import java.util.Scanner;

public class OVIBucles {

	public OVIBucles() {
		// Escribe un programa que muestre los n primeros términos de la serie
		// Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
		// el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
		// términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
		// debe introducir por teclado.
		Scanner leer = new Scanner(System.in);
		int numero, fibo1, fibo2, i;

		do {
			System.out.print("Introduce un numero mayor que 1: ");
			numero = leer.nextInt();
		} while (numero <= 1);

		System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");

		fibo1 = 0;
		fibo2 = 1;

		System.out.print(fibo1 + " ");
		for (i = 2; i <= numero; i++) {
			System.out.print(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println();

		System.out.println("-----------------------------------------------------");

		
		int x = 1, a = 0, suma = 0, vueltas;
		System.out.println("Hasta donde para");
		vueltas = leer.nextInt();
		for (int y = 0; y < vueltas; y++) {
			System.out.println(a);
			suma = a + x;
			x = a;
			a = suma;
		}
	}
}
