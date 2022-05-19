package ejercicioArrays;

public class OXEjercicioArrays {

	public OXEjercicioArrays() {
		// 10.-Diseñar un programa en Java que permita registrar 200 números enteros en
		// un array.
		// Para cargar el array con los 200 números puede generar números aleatorios
		// usando la función random(Math.random).
		// A continuación deberá indicar si dicho array esta o no ordenado.
		int[] lista = new int[200];
		boolean ordenado = true;
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.println("\nLista de numeros: ");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + ", ");
		}
		for (int i = 0; i < (lista.length - 1) && ordenado; i++) {
			if (lista[i] > lista[i + 1])
				ordenado = false;
		}
		if (ordenado)
			System.out.println("\nEl array está ordenado ascendentemente");
		else
			System.out.println("\nEl array no está ordenado ascendentemente");

	}

}
