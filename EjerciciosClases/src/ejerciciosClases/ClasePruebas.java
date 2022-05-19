package ejerciciosClases;
import java.util.Scanner;

public class ClasePruebas {
	enum Meses {Enero, Febrero, Marzo, Abril, Mayo};
	public static void main(String [] args){
		int numEnt;
		numEnt=5;
		double numReal=7.5;
		char c='a';
		String cat;
		cat="hola mundo";
		System.out.println(cat);
		System.out.println(numReal);
		Scanner sc=new Scanner(System.in);
		cat=sc.nextLine();
		System.out.println(cat);
		char caracter = 'H';
        System.out.println(caracter);
        int cod = caracter;
        System.out.println(cod);
        
        boolean bol = true;
        int num3 = 2;
        boolean cond = num3>0;
        // CASTING
        double real = 22.45;
        int entero = (int) real;
        System.out.println(real);
        
        //ConvertirATexto(variablenumerica); 
        
        String num = Double.toString(real);
        String numv2 = real + "";
        
        String numInt = Integer.toString(entero);
        String numIntv2 = entero + "";
        
        //ConvertirANumero(texto)
        String strReal = "1234.32";
        String strEntero = "342";
        double numreal = Double.parseDouble(strReal);
        double numint = Integer.parseInt(strEntero);
        
        //CONSTANTES
        final double G = 9.8;
        
        //DIVISIONES
        System.out.println("\n DIVISIONES \n");
        int num1 = 6;
        int num2 = 4;
        //división entera
        double divEnt = num1/num2;
        //división real
        double divRel = num1/(double)num2;
        System.out.println(divEnt);
        System.out.println(divRel);
        
        //ENUM
        Meses m1 = Meses.Marzo;
        
        
        //IMPRIMIR DATOS (escribir de pseint)
        System.out.println("Hola Adios ");
        System.out.print("Print sin n \n");
        System.out.println("Print con ln");
        
        //RECOGER DATOS (leer de pseint)
       Scanner scNumeros = new Scanner(System.in);
       
       Scanner scString = new Scanner(System.in);
       
       String palabra = scString.nextLine();
       int enteroE = scNumeros.nextInt();
       double realR = scNumeros.nextDouble();
       
      
       System.out.println(palabra + " - " + enteroE + " - " + realR);
		
		
		
		
	}
	
	public ClasePruebas() {
		// TODO Auto-generated constructor stub
	}

}
