package vista;

import java.util.Scanner;

public class EjercicioNumeroPrim {

	public EjercicioNumeroPrim() {
		// TODO Auto-generated constructor stub
		
		int num, x = 2, resto = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un número entero.");
		num = leer.nextInt();
        while (num>x && resto!=0) {
        	resto = num%x;
        	if (resto!=0) {
        		x++;
        	}
        }
        if (num%x == 0) {
            System.out.println("el numero " + num + " No es primo ");
            
        } else if (num%x != 0) {
            System.out.println("el numero " + num + " Es primo ");
            
        }
	}

}
