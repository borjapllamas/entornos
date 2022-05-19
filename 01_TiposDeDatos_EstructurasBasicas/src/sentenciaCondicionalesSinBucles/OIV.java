package sentenciaCondicionalesSinBucles;

import java.util.Scanner;

public class OIV {

	public OIV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un día");
		System.out.println("Introduce un mes");
		int mes = sc.nextInt();
		int dia = sc.nextInt();
		if (mes == 12 && dia >= 22 || mes == 1 && dia <= 20) {
			System.out.println("Eres Capricornio");
		}
		else if (mes == 1 && dia >= 21 || mes == 2 && dia <= 19) {
			System.out.println("Eres Acuario");
		}
		else if (mes == 2 && dia >= 20 || mes == 3 && dia <= 20) {
			System.out.println("Eres Piscis");
		}
		else if (mes == 3 && dia >= 21 || mes == 4 && dia <= 20) {
			System.out.println("Eres Aries");
		}
		else if (mes == 4 && dia >= 21 || mes == 5 && dia <= 21) {
			System.out.println("Eres Tauro");
		}
		else if (mes == 5 && dia >= 22 || mes == 6 && dia <= 21) {
			System.out.println("Eres Géminis"); 
		}
		else if (mes == 6 && dia >= 22 || mes == 7 && dia <= 23) {
			System.out.println("Eres Cáncer");
		}
		else if (mes == 7 && dia >= 24 || mes == 8 && dia <= 23) {
			System.out.println("Eres Leo");
		}
		else if (mes == 8 && dia >= 24 || mes == 9 && dia <= 23) {
			System.out.println("Eres Virgo");
		}
		else if (mes == 9 && dia >= 24 || mes == 10 && dia <= 23) {
			System.out.println("Eres Libra");
		}
		else if (mes == 10 && dia >= 24 || mes == 11 && dia <= 22) {
			System.out.println("Eres Escorpio");
		}
		else if (mes == 11 && dia >= 23 || mes == 12 && dia <= 21) {
			System.out.println("Eres Sagitario");
		}
		else {System.out.println("La fecha introducida no existe");
		}
	}

}
