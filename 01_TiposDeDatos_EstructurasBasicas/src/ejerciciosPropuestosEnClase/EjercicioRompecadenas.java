package ejerciciosPropuestosEnClase;

public class EjercicioRompecadenas {

	public EjercicioRompecadenas() {
		// TODO Auto-generated constructor stub
		System.out.println("Rompe cadenas");
		String cadena = "Vamos a ir a Sevilla hoy";
		String espacio = " ";
		int cont = 0;
		for (int x = 0; x < cadena.length(); x++)
			if (cadena.charAt(x) == espacio.charAt(0))
				cont++;
		if (!(cont % 2 == 0))
			cont++;
		String[] palabra = new String[cont];
		int y = 0;
		for (int x = 0; x < palabra.length; x++) {
			while (y < (cadena.length())) {
				if (cadena.charAt(y) == espacio.charAt(0)) {
					break;
				}
				if (palabra[x] == null)
					palabra[x] = "";
				palabra[x] += cadena.charAt(y);
				y++;
			}
			y++;
		}
		for (int x = 0; x < palabra.length; x++) {
			System.out.printf("%s%n", palabra[x]);
		}
	}

}
