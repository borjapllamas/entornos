package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XIVEstructurasBasicas {

	public XIVEstructurasBasicas() {
		//Dado un n?mero entero positivo hallar si es primo o no.(Funciones)
		Scanner leer = new Scanner(System.in);
		boolean esprimo=false;
		int n=leer.nextInt();
		esprimo(n);
	if (esprimo) {
		System.out.println("El n?mero "+n+" es primo");
	}
	else {
		System.out.println("El n?mero "+n+" no es primo");
	}
	}

	private boolean esprimo(int n) {
		int resto=0;
		int x=2;
		while(n>x && resto!=0) {
			resto=n%x;
			if (resto !=0) {
				x++;
			}
		}
		return true;
	}

}
