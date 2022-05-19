package ejercicioArrays;

public class OXIIEjercicioArrays {

	public OXIIEjercicioArrays() {
		// 12.- Disena un programa en Java que rellene un array de 4x4 de la siguiente
		// manera:
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		// A continuación muestre el contenido del array por pantalla.

		int[][] matriz = new int[4][4];
		int cont = 1;
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[0].length; y++) {
				if ( x == y ) {
					matriz[x][y] = 1;
				}
			}
		}

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[0].length; y++) {
				System.out.print(matriz[x][y] + "\t");
			}
			System.out.println();
		}
	}

}
