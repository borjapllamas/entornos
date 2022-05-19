package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XVIIEstructurasBasicas {

	public XVIIEstructurasBasicas() {
		//Visualizar todos los números binarios representables con 4 bits, ordenados de menor a
		//mayor, así como su valor decimal.
		Scanner leer = new Scanner(System.in);
		for (int dec=0; dec<16; dec++) {
			int d=dec,cont=1; //cont indicara el tamaño
			String binario = "";
			int coc;
			while((coc = d/2) >=1) {
				int resto = d%2;
				binario=resto+binario;
				
				d=coc;
				cont++; 
			}
			binario = d + binario;
			int tam=4-cont;
			switch(tam) {
			case 0:
				System.out.printf("%3d .. %s %n",dec,binario);
				break;
			case 1:
				System.out.printf("%3d .. 0%s %n",dec,binario);
				break;
			case 2:
				System.out.printf("%3d .. 00%s %n",dec,binario);
				break;
			case 3:
				System.out.printf("%3d .. 000%s %n",dec,binario);
				break;
			
			}
		}
	}

}
