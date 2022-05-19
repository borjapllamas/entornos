package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class OIIEstructurasBasicas {

	public OIIEstructurasBasicas() {
		//Introducir un número entero por teclado. Si es positivo, entonces averiguad si es par o
		//impar. Si es par, hallar si es múltiplo de 2, de 4 o de 8 y, en ese caso, mostrad el
		//mensaje:”El número es par y múltiplo de 2 o de 4 o de 8". Si es impar, hallar si es múltiplo
		//de 3, de 5 o de 7 y, en ese caso, mostrad el mensaje:”El número es impar y múltiplo de 3 o
		//de 5 o de 7".
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un número entero por teclado");
		int num = leer.nextInt();
		int multiplo2, multiplo4, multiplo8; 
		int multiplo3, multiplo5, multiplo7;
		if (num%2==0) {
		 multiplo2 = num/=2;
		 multiplo4 = num/=4;
		 multiplo8 = num/=8;
		 System.out.println("El número es par y multiplo de 2, 4 o 8.");
		}
		else if (num%2!=0) {
		multiplo3 = num/=3;
		multiplo5 = num/=5;
		multiplo7 = num/=7;
		System.out.println("El número es impar y multiplo de 3, 5 o 7.");
		}
	}
}
