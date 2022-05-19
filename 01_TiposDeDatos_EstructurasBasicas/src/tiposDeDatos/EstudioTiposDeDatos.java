package tiposDeDatos;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class EstudioTiposDeDatos {
	enum Dias {Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo};
	public EstudioTiposDeDatos() {
		
		System.out.println("Estudio tipos de datos");
		byte tipobyte = 0;
		tipobyte = 24;
		System.out.println("tipobyte = "+ tipobyte);
		int x; // Declara la variable como idea
		x = 5; // Asigna el valor 5 a la varible x
		//Muestra el valor de x
		System.out.println("El valor actual de mi variable es" + x);
		x = 7; //Asigna el valor 7 a la variable x
		// Muestra el valor de x
		System.out.println("y ahora es" + x);
		// Long tipoLong=76578897377777777; //Da error
		long tipoLong2 = 76578897377777777L; // correcto
		char letra1 = 'c';
		char letra2 = 'a';
		char letra3 = 's';
		char letra4 = 'a';
		System.out.println("letra1: " + letra1);
		System.out.println("letra3: " + letra3);
		System.out.println("todas las letras juntas: " + letra1 + letra2 + letra3+ letra4);
		char c = 'A';
		int codAscii = c;
		System.out.println("Caracter" + c + "Ascii =" + codAscii);
		// los decimales son considerados como double si queremos utilizar float,
		// tendremos que utilizar un casting
		float tipofloat;
		//tipofloat = 23.4; //Da error
		tipofloat = (float) 23.4;
		float tipofloat2 = 23.4F;
		double a; // se declaran las variables x e y
		double b; // de tal forma que puedan almacenar decimales.
		a = 7;
		b = 25.01;
		System.out.println(" a vale" + a);
		System.out.println(" b vale" + b);
		//CONSTANTES
		final double PI = 3.14;
		//CONVERSION DE TIPOS ....CASTING
		double div;
		int dividendo, divisor;
		dividendo = 7;
		divisor = 3;
		div = dividendo / divisor;
		System.out.println("La division de " + dividendo + "/" + divisor + "=" + div);
		//BOOLEAN
		boolean sw=false;
		sw=true;
		
		//CADENAS
		String miPalabra = "cerveza";
		String miFrase = "¿dónde está mi cerveza";
		System.out.println("Una palabra que uso con frecuencia:" + miPalabra);
		System.out.println("Una frase que uso a veces:" + miFrase);
		// PEDIR POR TECLADO
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = leer.nextLine();
		//String nombre = leer.next();
		//leer=null;s = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = leer.nextInt();
		
		System.out.println("Tu nombre es " + nombre + "y tu edad es" + edad);
		
		//TIPOS ENUMERADOS;
		Dias diaActual=Dias.Miercoles;
		Dias diaSiguiente=Dias.Jueves;
		System.out.println("hoy es :" +diaActual);
		System.out.println("mañana es :" +diaSiguiente);
		
	}
//end class
	}


