package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class OIEstructurasBasicas {

	public OIEstructurasBasicas() {
		// Introducir un n?mero entero de dos d?gitos por teclado. Si es positivo y tiene dos cifras,
		//indicar cu?nto suman sus dos d?gitos; si no cumple esas condiciones, mostrar el mensaje:
		//?No es positivo o no tiene dos cifras.?.
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un n?mero entero de dos cifras por teclado");
		int num = leer.nextInt();
		int suma = 0;
		int digito = 0;
		if (num > 9 && num <=99) {
			digito = num%10;
			suma = num/=10;	
			System.out.println(digito + suma);
			}
		else System.out.println("No es positivo o no tiene dos cifras.");
	}

}
