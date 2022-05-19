package ejerciciosClases;
import java.util.Scanner;

public class EjercicioAplicaDescuento {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio del producto");
		double num = sc.nextDouble();
		double descuento = 0;
		double precioFinal = 0;
		if (num > 0) {
			if (num >= 0 && num <= 50) {
				System.out.println("No tiene descuento");
			} else if (num > 50 && num <= 100) {
				System.out.println("Tiene un 25% de descuento");
				descuento = num * 0.25;
			} else if (num > 100 && num <= 150) {
				descuento = num * 0.50;
				System.out.println("Tiene un 50% de descuento");
			} else {
				System.out.println("Tiene un 75% de descuento");
				descuento = num * 0.75;
			}

			precioFinal = num - descuento;
			System.out.println("Se ha ahorrado " + descuento);
			System.out.println("Precio con descuento " + precioFinal);
		}
	}
}
