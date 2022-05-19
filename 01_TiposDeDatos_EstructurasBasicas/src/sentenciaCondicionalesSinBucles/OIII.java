package sentenciaCondicionalesSinBucles;

import java.util.Scanner;

public class OIII {

	public OIII() {
		Scanner sc = new Scanner(System.in);
		int valorHora = 12;
		int valorHoraExtra = 16;
		System.out.println("Introduce el número de horas semanales que has trabajado");
		int horas = sc.nextInt();
		int salario = 0;
		if (horas <= 40) {
			salario = horas * valorHora;
			System.out.println("Tu salario es " + salario + "€");
		} else {
			int horasExtra = horas - 40;
			salario = (40 * valorHora) + (horasExtra * valorHoraExtra);
			System.out.println("Tu salario es " + salario + "€");
		}
		

	}

}
