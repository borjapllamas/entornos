package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class IXEstructurasBasicas {

	public IXEstructurasBasicas() {
		//Introducir un n�mero entero que llamaremos <dia_semana>, y comprendido entre 0 y 6,
		//de modo que el 0 corresponder� al Domingo, el 1 al Lunes,. y as� sucesivamente, hasta el
		//6 que se�alar� al S�bado. Suponed que el 1o de Enero de un a�o cualquiera �cae� en el
		//d�a que marca <dia_semana>. Tendr�is que presentar en pantalla todos los d�as del mes
		//de Enero, cada uno en una l�nea, acompa�ado del nombre del d�a de la semana que le
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
			case 3: System.out.println(x+"de enero es "+" Mi�rcoles");
			break;
			case 4: System.out.println(x+"de enero es "+" Jueves");
			break;
			case 5: System.out.println(x+"de enero es "+" viernes");
			break;
			case 6: System.out.println(x+"de enero es "+" S�bado");
			break;
			}
			dia_semana++;
			if (dia_semana>6) {
				dia_semana=0;
			}
		}
		
		
	}

}
