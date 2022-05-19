package ejerciciosPropuestosEnClase;

public class EjercicioPalindroma {

	public EjercicioPalindroma() {
		// TODO Auto-generated constructor stub
		String frase = "Isaac no ronca asi";
		System.out.println(frase);
		String pali = "";
		int fin;
		frase = frase.replace(" ","");
		
		fin = frase.length();
		for (int x = 0; x < fin; x++) {
			pali = frase.charAt(x)+pali;
		}
		
		boolean sw = frase.equalsIgnoreCase(pali);
		if (sw) {
			System.out.println("Es palíndroma");
		}else {
			System.out.println("No es palíndroma");
		}
		
	}

}
