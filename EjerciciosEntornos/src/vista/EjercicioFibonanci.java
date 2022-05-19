package vista;

public class EjercicioFibonanci {


	public static void main(String[] args) {
		
	//Fibonanci
		int cant=50;
		int ant=0;
		int sig=1;
		int fibo;
		for(int x=0;x<cant;x++) {
			fibo=ant+sig;
			System.out.print(fibo+"-");
			ant=sig;
			sig=fibo;
		}
		
	}
}
