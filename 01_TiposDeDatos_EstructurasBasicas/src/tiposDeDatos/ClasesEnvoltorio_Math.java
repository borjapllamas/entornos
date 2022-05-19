package tiposDeDatos;

public class ClasesEnvoltorio_Math {

	public ClasesEnvoltorio_Math() {
		String n="123";
		int x=123;
		int num;
		
		num=Integer.parseInt("12345"); 
		System.out.println(num);
		
		String numString=Integer.toString(x);
		System.out.println("Número "+x+ " como cadena :"+numString);
		
		System.out.println("1111 en base 2 = "+Integer.parseInt("1111",2));
		System.out.println("123456 en hexadecimal = "+Integer.toHexString(123456));
		System.out.println("135 en binario = "+Integer.toBinaryString(135));
		char c='9';
		boolean sw=true;
		System.out.println("El caracter c es una letra ? .."+ Character.isLetter(c));
		System.out.println("El caracter c es un dígito ? .."+ Character.isDigit(c));
		System.out.println("El caracter c es una mayuscula ? .."+ Character.isUpperCase(c));
		
		String numDoble="53.725538";
		double d= Double.parseDouble(numDoble);
		System.out.printf("La cadena %s es el numero %.3f %n",numDoble,d);
		
		// LA CLASE MATH
		System.err.println("Math.ceil==========================");
		System.out.println(Math.ceil(2.3));//muestra por consola 3.0
		System.out.println(Math.ceil(0.895));//muestra por consola 1.0
		System.out.println(Math.ceil(-1.87));//muestra por consola .1.0
		System.out.println(Math.ceil(-0.9));//muestra por consola .0.0
		System.err.println("Math.floor==========================");
		System.out.println(Math.floor(2.8));//muestra por consola 2.0
		System.out.println(Math.floor(0.895));//muestra por consola 0.0
		System.out.println(Math.floor(-1.87));//muestra por consola .2.0
		System.out.println(Math.floor(-0.9));//muestra por consola .1.0
		System.err.println("Redondeos==========================");
		System.out.println(Math.rint(0.891));//muestra por consola 1.0
		System.out.println(Math.rint(6.5));//muestra por consola 6
		System.out.println(Math.rint(6.51));//muestra por consola 7
		System.err.println("Potencias y raices==========================");
		System.out.println(Math.pow(5,  2));//muestra por consola 25
		System.out.println(Math.sqrt(25));//muestra por consola 5
		System.out.println(Math.pow(25, 1/2.0));//raiz cuadrada 25 = 5
		System.out.println(Math.pow(125, 1/3.0));//raiz cubica 125 = 5
		System.err.println("Trigonometría==========================");
		int angulo=30;
		System.out.println(Math.sin(Math.toRadians(angulo)));//raiz cubica 125 = 5
		System.out.printf("El seno de un angulo de %d grados es = %.1f %n",
				angulo, Math.sin(Math.toRadians(angulo)));
		double cosAngulo=0.86;	
		System.out.printf("Un coseno de %.2f corresponde a un angulo de %f %n",
				cosAngulo, Math.toDegrees(Math.acos(cosAngulo)));
		System.err.println("Max de dos numeros===============");
		System.out.println(Math.max(3,  14));
		System.err.println("Aleatorios==========================");
		System.out.println(Math.random());
		int ale=0;
		for (x=0; x<10;x++) {
			ale=(int) Math.floor(Math.random()*5);
			System.out.print(ale+"-");
		}
		System.out.println();
		for(x=0; x<10; x++) {
			ale=(int) Math.floor(Math.random()*10+1);
			System.out.print(ale+"-");
		}
		System.out.println();
		int menor=5 ,mayor=7;
		for(x=0; x<10; x++) {
			ale=(int) Math.floor(Math.random()*(mayor-menor+1)+menor);
			System.out.println(ale+"-");
		}
	}

}
