package sentenciaCondicionalesSinBucles;

import java.util.Scanner;

public class OI {
	public OI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el n?mero del d?a");
		int numSemana = sc.nextInt();
		switch (numSemana) {
		case 1:
			System.out.println("Es lunes y hay SI");
			break;
		case 2:
			System.out.println("Es martes y hay Programaci?n");
			break;
		case 3:
			System.out.println("Es mi?rcoles y hay FOL");
			break;
		case 4:
			System.out.println("Es jueves y hay FOL");
			break;
		case 5:
			System.out.println("Es viernes y hay FOL");
			break;
		default:
			System.out.println("No hay clases ese d?a de la semana");
		}
		
	}

}
