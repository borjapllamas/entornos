package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XVIIIEstructurasBasicas {

	public XVIIIEstructurasBasicas() {
		//Calcular y visualizar las potencias de 2. El exponente variará de 0 a 10 del siguiente modo:
		//2 elevado a 0 es 1.
		//2 elevado a 1 es 2.
		//................
		//2 elevado a 10 es 1024
		//(NOTA: No usar la función de exponenciación – pow -)
		Scanner leer = new Scanner(System.in);
		int num=2;
		int resultado=1;
		System.out.println(num+" elevado a 0 es 1");
		for (int i=1;i<11;i++) {
			resultado=resultado*num;
			System.out.println(num+" elevado a "+i+" es "+resultado);
		}
	}

}
