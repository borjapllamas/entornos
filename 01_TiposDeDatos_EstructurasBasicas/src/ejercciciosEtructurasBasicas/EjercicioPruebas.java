package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class EjercicioPruebas {

	private String[] cartas;

	public EjercicioPruebas() {
		//En un array saber cuántas veces le ha salido una carta repetida.
		//Luego sacar una carta al azar y al que más veces le haya salido la carta, ganará. 
		Scanner leer = new Scanner(System.in);
		String [] baraja = {"oro1","oro2","oro3","oro4","oro5","oro6","oro7","oroS","oroC","oroR",
							"copa1","copa2","copa3","copa4","copa5","copa6","copa7","copaS","copaC","copaR",
							"espada1","espada2","espada3","espada4","espada5","espada6","espada7","espadaS","espadaC","espadaR",
							"basto1","basto2","basto3","basto4","basto5","basto6","basto7","bastoS","bastoC","bastoR",};
		System.out.println("¿Cuántas manos quiere jugar?");
		int cantidadManos = leer.nextInt();
		int [] arrayGeneradorManos = null;
		for (int x=0; x<cantidadManos; x++) {
			System.out.println();
			System.out.println("jugada " + (x+1));
			arrayGeneradorManos = generadorAleatorios (8,0,39);
			for (int y=0; y<arrayGeneradorManos.length; y++) {
				if(y==0) {
					System.out.println();
					System.out.println("Mano de Borja");
				}
				if(y==4) {
					System.out.println();
					System.out.println("Mano de Claudia");
				}
				System.out.println(cartas[arrayGeneradorManos[y]] + ",");
			}
		}	
		
	}

	private int[] generadorAleatorios(int numerosGenerar, int minimo, int maximo) {
		// TODO Auto-generated method stub
		int[] aleatorio = null;
		int num = 0;
		for (int x=0; x<aleatorio.length;x++) {
			do {
				num = (int) Math.floor(Math.random() * (maximo - minimo + 1)+ minimo);
			}
			while(repetido(num,aleatorio));
		}
		return null;
	}

	private boolean repetido(int num, int[] aleatorio) {
		// TODO Auto-generated method stub
		boolean repetido = false;
		for(int y=0; y<aleatorio.length; y++) {
			repetido = true;
					break;
		}
		return repetido;
	}

}
