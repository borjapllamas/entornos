package ejercicioArrays;

public class OXEjercicioArrays {

	public OXEjercicioArrays() {
		// 10.-Dise?ar un programa en Java que permita registrar 200 n?meros enteros en
		// un array.
		// Para cargar el array con los 200 n?meros puede generar n?meros aleatorios
		// usando la funci?n random(Math.random).
		// A continuaci?n deber? indicar si dicho array esta o no ordenado.
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
			System.out.println("\nEl array est? ordenado ascendentemente");
		else
			System.out.println("\nEl array no est? ordenado ascendentemente");

	}

}
