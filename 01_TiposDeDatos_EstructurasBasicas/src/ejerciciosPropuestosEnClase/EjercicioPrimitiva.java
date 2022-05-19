package ejerciciosPropuestosEnClase;

import java.util.Scanner;

public class EjercicioPrimitiva {

	public EjercicioPrimitiva() {
		// Hacer un programa que te pregunte cuántas primitivas quiere comprar y que las muestre por pantalla. (6 números entre el 1 y el 49)
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos boletos quiere?");
        int num = sc.nextInt();
        int[][] primitiva = new int[num][6];
        int randomNum = 0;
        for (int x = 0; x < primitiva.length; x++) {

            for (int y = 0; y < primitiva[0].length; y++) {
                do {
                    randomNum = (int) (Math.random() * 49 + 1);
                } while (repetido(randomNum, primitiva[x]));
                primitiva[x][y] = randomNum;
            }
        }

        for (int x = 0; x < primitiva.length; x++) {
            for (int y = 0; y < primitiva[0].length; y++) {
                System.out.print(primitiva[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public boolean repetido(int num, int[] fila) {
        for (int y = 0; y < fila.length; y++) {
            if (fila[y] == num) {
                return true;
            }
        }
        return false;
    }
}




