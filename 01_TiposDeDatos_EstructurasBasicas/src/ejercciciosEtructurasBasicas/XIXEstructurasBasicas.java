package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XIXEstructurasBasicas {

	public XIXEstructurasBasicas() {
		// Introducir un número y desglosarlo de forma ideal en billetes y monedas de
		// curso legal.
		Scanner leer = new Scanner(System.in);
		int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, m2 = 0, m1 = 0;
		System.out.println("Introduzca una cantidad de dinero");
		int euros = leer.nextInt();
		int eur = euros;
		while (eur > 0) {
			b500 = eur / 500;
			eur -= (500 * b500);
			b200 = eur / 200;
			eur -= (200 * b200);
			b100 = eur / 100;
			eur -= (100 * b100);
			b50 = eur / 50;
			eur -= (50 * b50);
			b20 = eur / 20;
			eur -= (20 * b20);
			b10 = eur / 10;
			eur -= (10 * b10);
			b5 = eur / 5;
			eur -= (5 * b5);
			m2 = eur / 2;
			eur -= (2 * m2);
			m1 = eur / 1;
			eur -= (1 * m1);
		}
		System.out.println(euros + " euros se descompone en :");
		if (b500 > 0)
			System.out.println(b500 + " billetes de quinientos euros");
		if (b200 > 0)
			System.out.println(b200 + " billetes de doscientos euros");
		if (b100 > 0)
			System.out.println(b100 + " billetes de cien euros");
		if (b50 > 0)
			System.out.println(b50 + " billetes de cincuenta euros");
		if (b20 > 0)
			System.out.println(b20 + " billetes de veinte euros");
		if (b10 > 0)
			System.out.println(b10 + " billetes de diez euros");
		if (b5 > 0)
			System.out.println(b5 + " billetes de cinco euros");
		if (m2 > 0)
			System.out.println(m2 + " monedas de dos euros");
		if (m1 > 0)
			System.out.println(m1 + " monedas de un euros");
	}

}
