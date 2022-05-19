package tiposDeDatos;

import java.util.Scanner;

public class EstudioEstructurasRepeticion {

	public EstudioEstructurasRepeticion() {
		Scanner leer = new Scanner(System.in);
		String pausa = "";
		
		System.out.println("Estudio Estructuras de Repeticion ############");
		System.out.println("Bucle For ****************");
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("pulsa para continuar");
		pausa=leer.next();
		System.out.println("=========================");
		for (int i = 1; i < 11; i +=2) {
			System.out.println(i);
		}
		System.out.println("pulsar para continuar");
		pausa=leer.next();
		System.out.println("==========================");
		for (int i = 10; i > 0; i --) {
			System.out.println(i);
		}
		System.out.println("pulsar para continuar");
		pausa=leer.next();
		
		System.out.println("Bucle while *****************");
		int i = 1;
		
		while (i < 11) {
			System.out.println(i);
			i++;
		}
		System.out.println("pulsar para continuar ");
		pausa=leer.next();
		
		System.out.println("Bucle do while *********************");
		i = 1;
		do {
		System.out.println(i);
		i++;
		}while (i < 11);
		System.out.println("pulsar para continuar");
		pausa=leer.next();
		//PARA EL VIDEO Y REALIZA LOS SIGUIENTES EJERCICIOS
		/**
		 * Bucle while que termine cuando se introduce por teclado un número negativo.
		 * Muestra la cantidad de números introducidos y la suma.
		 */
	
		/*
		 * Bucle while que termina cuando se introduce por teclado un número impar.
		 */
		
		
		
		
		System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
		System.out.println("Para terminar, introduzca un número negativo.");
		
		
		int numeroIntroducido = 0;
		int cuentaNumeros = 0;
		int suma = 0; 
		
		while (numeroIntroducido >= 0) {
			numeroIntroducido = leer.nextInt();
			cuentaNumeros++; //Incrementa en uno la variable
			suma += numeroIntroducido; //Equivale a suma = suma + numeroIntroducido
		}
		
		System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos." );
		System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));
		
		/**
		 * Bucle do-while que termina cuando se introduce por teclado un número impar.
		 */
		int numero = 0;
		boolean esPar = false;
		do {
				System.out.println("Dime un número: ");
				numero = leer.nextInt();
				esPar = numero % 2 == 0;
				if (esPar) {// comprueba si el número introducido es par
					System.out.println("Qué bonito es el " + numero);
				}else {
					System.out.println("No me gustan los números impares, adios.");
				}
		} while (esPar);
		
		//end ()
	}
}
