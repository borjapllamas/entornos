package tiposDeDatos;

public class ArrayUnidimensional {

	public ArrayUnidimensional() {
		//TODO Esbozo de constructor generado automáticamente
		
		int[]enteros;
		enteros=new int[10];
		enteros[5]=7;
		int[] enteros2 = new int[10];
		int notas[]= {1,2,3,4,5,6,7,8,9,10};
		int notas2[]=notas;
		notas2[0]=10;
		metodo1(notas);
		int primitiva[]=generaPrimitiva();
		for(int x=0;x<primitiva.length;x++)
			System.out.println(primitiva[x]+"-");
		String nombres[]= {"Alba","Cristina","Elena","Cristian","Antonio","Andres","Gabi","Jose Antonio",
				"Pedro","Dani"};
		for(int x=0;x<notas.length;x++) {
			
			System.out.println(nombres[x]+" : "+notas[x]);
			
		}
		System.out.println();
		}
	private int[] generaPrimitiva() {
		//TODO Apéndice de método generado automáticamente
		int nuevaPrimitiva[]= {5,14,28,9,6,38};
		return nuevaPrimitiva;
	}
	
	private void metodo1(int[] notasModificadas) {
		//TODO Apéndice de método generado automáticamente
		notasModificadas[9]=0;
	}

}
