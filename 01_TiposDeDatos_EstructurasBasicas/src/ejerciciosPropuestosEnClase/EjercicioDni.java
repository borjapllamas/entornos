package ejerciciosPropuestosEnClase;

public class EjercicioDni {

	public EjercicioDni() {
		// TODO Auto-generated constructor stub
		String dni = "49049693P";
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		dni = dni.toUpperCase();
		if (dni.length() == 9) {
			String nums = dni.substring(0,8);
			int num = Integer.parseInt(nums);
			int resto = num % 23;
			int ascii = letras.charAt(resto);
			if (dni.charAt(8) == ascii) {
				System.out.println("DNI válido");
			} else {
				System.out.println("DNI no válido");
			}
		} else {
			System.out.println("DNI no válido");
		}
	}
}
