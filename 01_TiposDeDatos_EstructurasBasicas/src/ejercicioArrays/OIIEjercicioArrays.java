package ejercicioArrays;

public class OIIEjercicioArrays {

	public OIIEjercicioArrays() {
		// 2.-Escriba un programa que cree un array con los caracteres dela 'a' a la 'k'
		// y a continuación
		// sustituya todas las vocales que se encuentren en el array por el carácter
		// '*'.
		String[] caracteres = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };
		for (int x = 0; x < caracteres.length; x++) {
			if (caracteres[x] == "a") {
				caracteres[x] = caracteres[x].replace("a", "*");
			}
			if (caracteres[x] == "e") {
				caracteres[x] = caracteres[x].replace("e", "*");
			}
			if (caracteres[x] == "i") {
				caracteres[x] = caracteres[x].replace("i", "*");
			}
			System.out.print(caracteres[x] + "-");
		}

	}

}
