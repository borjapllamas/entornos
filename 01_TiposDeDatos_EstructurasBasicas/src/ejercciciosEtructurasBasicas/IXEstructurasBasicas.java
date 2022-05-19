package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class IXEstructurasBasicas {

	public IXEstructurasBasicas() {
		//Introducir un número entero que llamaremos <dia_semana>, y comprendido entre 0 y 6,
		//de modo que el 0 corresponderá al Domingo, el 1 al Lunes,. y así sucesivamente, hasta el
		//6 que señalará al Sábado. Suponed que el 1o de Enero de un año cualquiera “cae” en el
		//día que marca <dia_semana>. Tendréis que presentar en pantalla todos los días del mes
		//de Enero, cada uno en una línea, acompañado del nombre del día de la semana que le
		//corresponde.
		Scanner leer = new Scanner(System.in);
		int dia_semana; //Entre 0 y 6.
		dia_semana=leer.nextInt();
		for(int x=1;x<32;x++) {
			switch(dia_semana) {
			case 0: System.out.println(x+"de enero es "+" Domingo");
			break;
			case 1: System.out.println(x+"de enero es "+" Lunes");
			break;
			case 2: System.out.println(x+"de enero es "+" Martes");
			break;
			case 3: System.out.println(x+"de enero es "+" Miércoles");
			break;
			case 4: System.out.println(x+"de enero es "+" Jueves");
			break;
			case 5: System.out.println(x+"de enero es "+" viernes");
			break;
			case 6: System.out.println(x+"de enero es "+" Sábado");
			break;
			}
			dia_semana++;
			if (dia_semana>6) {
				dia_semana=0;
			}
		}
		
		
	}

}
