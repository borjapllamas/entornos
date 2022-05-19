package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class VIIIEstructurasBasicas {

	public VIIIEstructurasBasicas() {
		//Calcular la suma : 1 + 2 + 3 +.....+ 20. Luego, la suma : 1 + 3 + 5 + + 51. Y, por último,
		//la suma : 1 - 2 + 3 - + 19 - 20.
		Scanner leer = new Scanner(System.in);
		int sum=0;
		for(int x=1;x<21;x++)
		sum+=x;
		System.out.println("La suma de 1+2+3+...20 ="+sum);
		sum=0;
		for(int x=1;x<52;x+=2)
		sum+=x;
		System.out.println("La suma de 1+3+5+...51 ="+sum);
		sum=0;
		int n=1,num;
		for(int x=1;x<21;x++){
		num=x*n;
		sum+=num;
		n*=-1;//n irá alternando los valores 1 y -1
		}
		System.out.println("La suma de 1-2+3-4...-20 ="+sum);
	}

}
