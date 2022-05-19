package ejercicioArrays;

import java.util.Scanner;

public class OVIEjercicioArrays {

	public OVIEjercicioArrays() {
		// 6.-Escriba un programa que cree el siguiente array y lo inicialice con estos
		// valores:
		// 3 6 9 12
		// 15 18 0 0
		// 0 0 0 0
		int valores[] = { 3, 6, 9, 12, 15, 18, 0, 0, 0, 0, 0, 0, };
		for (int x = 0; x < valores.length; x++) {
			if (x==4 || x==8 || x==12)
			System.out.println();
			if (x == 5) 
				System.out.print("  ");
			System.out.print(valores[x]+ "  ");
		}
	}

}
