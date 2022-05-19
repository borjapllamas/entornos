package sentenciaCondicionalesSinBucles;

import java.util.Scanner;

public class OI {
	public OI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número del día");
		int numSemana = sc.nextInt();
		switch (numSemana) {
		case 1:
			System.out.println("Es lunes y hay SI");
			break;
		case 2:
			System.out.println("Es martes y hay Programación");
			break;
		case 3:
			System.out.println("Es miércoles y hay FOL");
			break;
		case 4:
			System.out.println("Es jueves y hay FOL");
			break;
		case 5:
			System.out.println("Es viernes y hay FOL");
			break;
		default:
			System.out.println("No hay clases ese día de la semana");
		}
		
	}

}
