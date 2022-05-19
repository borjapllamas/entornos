package sentenciaCondicionalesSinBucles;

import java.util.Scanner;

public class OV {

	public OV() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una hora");
		System.out.println("Introduce los minutos");
		int hora = sc.nextInt();
		int minutos = sc.nextInt();
		if (minutos == 00 && hora <= 23 ||  minutos == 0 && hora <= 23) {
			System.out.println("Los segundos restantes hasta media noche serían "+(24 -hora)*3600);
		}
		else{
			System.out.println("Los segundos restantes hasta media noche serían"+(((24 - hora)*3600)+(60-minutos)+60));
		}
	}
	

}
