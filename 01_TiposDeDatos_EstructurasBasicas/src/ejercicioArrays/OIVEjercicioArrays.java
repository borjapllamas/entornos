package ejercicioArrays;

public class OIVEjercicioArrays {

	public OIVEjercicioArrays() {
		// 4. Escriba un programa que cree un array unidimensional de tipo entero.
		// Inicializalo en la propia declaracion.
		// A continuación el programa debe copiar el contenido de ese array a otro
		// similar mediante un bucle y mostrar por
		// pantalla los valores de ambos array para comprobar la copia.
		int enteros[] = { 1, 2, 3, 4, 5 };
		int[] enteros2 = new int[enteros.length];
		for (int x = 0; x < enteros.length; x++) {
			enteros2[x] = enteros[x];
		}
		System.out.println("\nlista de números del segundo array: ");
		for (int x = 0; x < enteros.length; x++) {
			System.out.print(enteros2[x] + " ");
		}
		int[] enteros3 = enteros.clone();

		System.out.println("\nlista de números del tercer array: ");
		for (int x = 0; x < enteros.length; x++) {
			System.out.println(enteros3[x] + " ");
		}

		System.out.println("\nlista de números del primer array: ");
		for (int x = 0; x < enteros.length; x++) {
			System.out.println(enteros[x] + " ");
		}

	}

}
