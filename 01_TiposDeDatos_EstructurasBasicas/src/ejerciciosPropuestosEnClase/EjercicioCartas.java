package ejerciciosPropuestosEnClase;

import java.util.Arrays;

public class EjercicioCartas {

	public EjercicioCartas() {
		// En un array saber cuántas veces le ha salido repetida una carta (40 posiciones).
		// Luego sacar una carta al azar y al que más veces le haya salido la carta ganará.
		
		String[] cartas = {"1O","2O","3O","4O","5O","6O","7O","SO","CO","RO",
						   "1C","2C","3C","4C","5C","6C","7C","SC","CC","RC",
						   "1E","2E","3E","4E","5E","6E","7E","SE","CE","RE",
						   "1B","2B","3B","4B","5B","6B","7B","SB","CB","RB",};
		//Repartir 4 cartas a 2 jugadores
		//Generar un array de 8 números del 0 al 39
		//Si quiero guardar la jugada necesitaré un array de [10][8]
		int[]jugada;
		int[][]partida=new int[10][];
		for(int x=0;x<partida.length;x++) {
			jugada=repartirCartas(8,0,39);
			partida[x]=jugada;
		}
		System.out.println();
		int cartaGanadora= (int) Math.floor(Math.random() * (39 - 0 + 1) +0);
		
		System.out.println();
		System.out.println("CARTA GANADORA "+cartas[cartaGanadora]);
		
		mostrarPartidas(partida,cartas,cartaGanadora);
		System.out.println();
		
		//METODO 1
		metodo1(partida,cartas,cartaGanadora);
		//METODO2
		metodo2(partida,cartas,cartaGanadora);
		System.out.println();}

	private void metodo1(int[][] partida, String[] cartas, int cartaGanadora) {
		// TODO Auto-generated method stub

	}

	private int[] repartirCartas(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	private void mostrarPartidas(int[][] partida, String[] cartas, int cartaGanadora) {
		// TODO Auto-generated method stub

	}

	private void metodo2(int[][] partida, String[] cartas, int cartaGanadora) {
		// TODO Auto-generated method stub
		int jugador1 = 0;
		int jugador2 = 0;
		for (int x = 0; x < partida.length; x++) {
			for (int y = 0; y < partida.length; y++) {
				if (y < 4) {
					if (partida[x][y] == cartaGanadora) {
						jugador1++;
					} else {
						if (partida[x][y] == cartaGanadora) {
							jugador2++;
						}
					}
				}
			}
		}

		System.out.println("Jugador 1 " + cartas[cartaGanadora] + " : " + jugador1);
		System.out.println("Jugador 2 " + cartas[cartaGanadora] + " : " + jugador2);
		if (jugador1 > jugador2)
			System.out.println("Gana el jugador 1");
		else if (jugador1 < jugador2)
			System.out.println("Gana el jugador 2");
		else {
			System.out.println();
		}

		System.out.println(Arrays.toString(jugador1));
		System.out.println(Arrays.toString(jugador2));
		if (jugador1[cartaGanadora] > jugador2[cartaGanadora])
			System.out.println("Gana el jugador 1");
		else if (jugador1[cartaGanadora] < jugador2[cartaGanadora])
			System.out.println("Gana el jugador 2");
		else
			System.out.println("Empate");

	}

}
