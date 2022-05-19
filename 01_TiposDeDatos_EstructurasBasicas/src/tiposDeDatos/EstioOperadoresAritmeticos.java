package tiposDeDatos;

public class EstioOperadoresAritmeticos {

	public EstioOperadoresAritmeticos() {
		System.out.println("Operadores Aritmeticos");
		
			int suma, a=-5,b=3,multi;
			double sumaDoble, num1=5.5,num2=2.3;
			suma=a-b;
			multi=a*b;
			System.out.println("suma ="+suma);
			System.out.println("multiplicacion = ="+multi);
			sumaDoble=num1+num2;
			System.out.println("sumaDoble ="+sumaDoble);
			sumaDoble=num1+a;
			suma=(int)sumaDoble;
			int divEntera,divid=7,div=3;
			double divReal,div2=3;
			divEntera=divid/div;
			System.out.println("Divi entera ="+divEntera);
			divReal=divid/(double)div;//division de enteros
			System.out.println("Divi real ="+divReal);
			divReal=divid/div2;//entero/real
			System.out.println("Divi real 2 ="+divReal);
			int resto;
			divid=8;div=2;
			resto=divid%div;
			System.out.println("El resto de la division es ="+resto);
			int cont=0;
			cont=cont+1; //contador
			System.out.println("Contador ="+cont);//1
			cont++;
			System.out.println("Contador ="+cont);//2
			++cont;
			System.out.println("Contador ="+cont);//3
			int y=cont++; //primero se asigna y con el valor de cont y luego se incrementa este
			System.out.println("Contador ="+y);//4
			y=++cont; //primero se incrementa cont y luego se hace la asignacion
			System.out.println("Contador ="+y);//5
			//contadores
			cont=cont+2;
			cont+=2;
			cont *=4; //cont=cont*4
			cont/=2; //cont=cont/2
			//acumuladores
			int acu=3;
			acu=acu+cont;
			acu+=cont;
			acu*=cont; //acu=acu*cont
			
			//Operadores de relacion
			
			int z = 3, r = 4;
			boolean sw = false, sw1, sw2;
			
			sw = z == r;//perguntamos si z es igual que r
			sw = z != r;//si z es distinto de r
			sw = z >= r;//si z es mayor o igual
			
			System.out.println("sw +" + sw);
			
			//Operadores ternario en java
			
			int resultado = (z > r) ? z : r;
			int notaNumerica = 6;
			String notaCadena = notaNumerica < 5 ? "suspenso" : "aprobado";
			
			System.out.println("El mayor es :" + resultado);
			System.out.println("Resultado del examen :" + notaCadena);
			
			
			sw1 = true;
			sw2= false;
			
			//Operadoers Lógicos
			
			System.out.println(!sw1);//Devuelve lo contrario de sw
			System.out.println(sw1 || sw2);//Devuelve true si al menos uno es verdadero
			System.out.println(sw1 && sw2);//Devuelve true sólo cuando los dos son verdaderos
			System.out.println(sw1 ^ sw2);//Devuelve true sólo si uno de los operandos es verdadero
			
			boolean a1 = true;
			boolean b1 = false;
			
			System.out.println("a =" + a1);
			System.out.println("b =" + b1);
			System.out.println("a && b =" + (a1 && b1));
			System.out.println("a || b =" + (a1 || b1));
			System.out.println("!a =" + !a1);
			System.out.println("a || (6 > 10) =" + (a1 || (6> 10)));
			System.out.println("((4 <= 4) || false) && (!a) =" + (((4 <= 4) || false) && (!a1)));
			
			
			
			
			
			
			
			
			
			
			
			acu+=cont;
			
			
			
			
	}

}
