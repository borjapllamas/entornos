package ejerciciosClases;

import java.util.Scanner;

public class EjercicioFuncionesSumaPrimos {

	public boolean esPrimo(int num) {
		boolean esprimo = true;
		int resto = 0;
		for (int x = 2; x < num; x++) {
			if (num % x == 0) {
				esprimo = false;
			}
		}
		return esprimo;
	}

	public int suma(int x, int y) {
		int resultado;
		resultado = x + y;
		return resultado;
	}

	public EjercicioFuncionesSumaPrimos() {

		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un número entero por pantalla.");

		int num = leer.nextInt();
		int num2 = leer.nextInt();

		if (esPrimo(num) && esPrimo(num2)) {
			System.out.println(suma(num, num2));
		}

	}

}
