package sentenciaCondicionalesSinBucles;

import java.util.Scanner;

public class OII {

	public OII() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduce qué hora es");
		num = sc.nextInt();
		if (num >= 6 && num <= 12) {
			System.out.println("Buenos días.");
		}
		else if (num >= 13 && num<= 20) {
			System.out.println("Buenas tardes.");
		}
		else if (num >= 21 || num<= 5) {
			System.out.println("Buenas noches.");
		}
		else {
			System.out.println("No exixte esa hora");
		}
		
	}

}
