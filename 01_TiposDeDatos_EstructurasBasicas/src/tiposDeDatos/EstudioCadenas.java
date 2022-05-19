package tiposDeDatos;

public class EstudioCadenas {

	public EstudioCadenas() {
		
		/*//String nombre=new String("Jesus");
		String nombre="jesus";
		nombre="Pepe";*/
		System.out.println("Propiedades de las cadenas");
		String cadena="Bienvenido a la clase de programacion ";
		String cad2="AAA";
		// devuelve la longitud de la String, incluyendo espacios en blanco.
		int tam=cadena.length();
		System.out.println("El tamaño de "+cadena+" = "+tam);
		/*char charAt (int indice): devuelve el carácter asociado al índice que se le pasa como argumento de la String sobre la que se aplica el método. 
		*Si el índice no existe se lanza una StringIndexOutOfBoundsException que hereda de IndexOutOfBoundsException.
		MUY USADO.*/
		System.out.println("======================");
		System.out.println("====charAt=============");
		System.out.println("Caracter = "+cadena.charAt(0));
		for(int x=0;x<cadena.length();x++) {
		System.out.print(cadena.charAt(x)+"-");
		}
		System.out.println("======================");
		System.out.println("====Substring=============");
		/*String substring(int indiceIni, int indiceFin): devuelve una String

		obtenida a partir del índice inicial

		incluido y del índice final excluido; es decir, se comporta como un

		intervalo semiabierto [indiceIni,

		i n d i c e F i n ) . S i e l í n d i c e f i n a l s o b r e p a s a l a l o n g i t u d d e l a S t r i n g , l a n z a u n a
		IndexOutOfBoundsException. MUY USADO*/
		
		System.out.println(cadena.substring(0, 10));
		System.out.println(cadena.substring(2));
		/*int indexOf(String str, int indice): devuelve el índice en el que aparece por primera vez la String del

		primer argumento en la que se aplica el método, a partir del índice especificado en el segundo

		argumento. Recordar que una String está indexada. Si el índice a partir del que se inicia la búsqueda

		no existe o la String no aparece, devuelve .1. MUY USADO.*/
		
		System.out.println("======================");
		System.out.println("====indexOf=============");
		System.out.println(cadena.indexOf("clase"));
		System.out.println(cadena.indexOf('o'));
		System.out.println(cadena.indexOf('x'));
		
		//equals permite saber si dos cadenas son iguales
		System.out.println("======================");

		System.out.println("====equals=============");
		String nombre="Antonio",nombre2="Antonio";
		System.out.println(nombre.equals(nombre2));
		nombre="antonio";
		System.out.println(nombre.equalsIgnoreCase(nombre2));
		/* compareTo Permite comparar dos cadenas entre sí lexicográficamente.
		Retornará 0 si son iguales, un número menor que cero si la cadena (cad1) es
		anterior en orden alfabético a la que se pasa por argumento (cad2), y
		un número mayor que cero si la cadena es posterior en orden alfabetico*/
		//tambien tenemos compareToIgnoreCase()
		System.out.println("======================");
		System.out.println("====compareTo=============");
		nombre="Ana";
		System.out.println(nombre.compareTo(nombre2));
		
		//trim devuelve otra cadena donde elimina espacios por delante y por detras de una cadena

		System.out.println("======================");
		System.out.println("====trim=============");
		String cad3 =cadena.trim();
		System.out.println(cad3.length());
		
		//toUpperCase() devuelve una cadena en minusculas toUpperCase() a mayusculas

		System.out.println("======================");
		System.out.println("====toLowerCase=============");
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		/* replace Generará una copia de la cadena cad1, en la que se sustituirán todas las
		apariciones de cad2 por cad3. El reemplazo se hará de izquierda a derecha*/
		
		System.out.println("======================");
		System.out.println("====replace=============");
		System.out.println(cadena.replace(" ", ""));
		System.out.println(cadena.replace("a", "*"));
		
		/*cad1.startsWith(cad2) Retornará true si la cadena comienza por la cadena pasada como argumento. 
		En caso contrario retornará false tambien tenemos cad1.endsWith(cad2) y cad1.contains(cad2)*/

		System.out.println(cadena.startsWith("Bienvenido"));
		System.out.println(cadena.contains("ido"));
		
		/*cadena.split Lo usaremos mucho con los ficheros*/
		
		String alumno="Jesus,Alcocer,1DAW,programacion,bbdd,sistemas,lenguaje de marcas,4,8,true";

		String[] rompeCadena=alumno.split(",");
		
		//char[]caracteres =cadena.toCharArray() devuelve un array con los caraceres de la cadena

		String asignatura="Programacion";
		char[]caracteres=asignatura.toCharArray();
		
		System.out.println();

	}

}
