package ejerciciosClases;
import java.util.Scanner;

public class EjerciciosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Introduce un n?mero");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("El n?mero es par");
		}
		else {
			System.out.println("El n?mero es impar");
		}
		

	}

}
