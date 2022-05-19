package ejercicioArrays;

public class ClaseParaDepurar {
	int[]ale=null;
	public ClaseParaDepurar() {
	// Generar un Array de números Aleatorios que no se repitan
	//(int) Math.floor(Math.random()*(mayor-menor+1)+menor)
	}
	public int[] generaAleatorios(int cant, int menor, int mayor) {
		// Esbozo de método genrado automáticamente

		ale = new int[cant];
		int num = 0;
		for (int x = 0; x < ale.length; x++) {
			do {
				num = (int) Math.floor(Math.random() * (mayor - menor + 1) + menor);
			} while (repetido(num, ale));
			ale[x] = num;
		}
		return ale;
	}

	private boolean repetido(int num, int[] ale) {
		// Esbozo de método generado automáticamente
		boolean repe = false;
		for (int x = 0; x < ale.length; x++) {
			if (ale[x] == num) {
				repe = true;
				break;
			}
		}
		return repe;
	}

}
