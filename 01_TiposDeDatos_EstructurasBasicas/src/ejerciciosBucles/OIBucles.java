package ejerciciosBucles;

import java.util.Scanner;

public class OIBucles {

	public OIBucles() {
//Muestra todos los números multiplos de 5 de 0 a 100, utilizando un bucle for,
		// while y do while.

Scanner leer = new Scanner(System.in);
		for (int i = 5; i <= 100; i += 5) {
			System.out.println(i);
		}
		int i = 5;
		while (i <= 100) {
			System.out.println(i);
			i += 5;
		}
		i = 5;
		do {
			System.out.println(i);
			i += 5;
		} while (i <= 100);
		
	}
}