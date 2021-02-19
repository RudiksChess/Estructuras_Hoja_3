
import java.util.stream.IntStream;
import java.util.Random;

public class ListaRandom {
	
	public int[] Generador() {
		//Se crea un array de 3000 elementos de 0 a 2999
		int[] lista = IntStream.range(0, 3000).toArray();
		//Se crea un elemento random
		Random random = new Random();
		//Aquí se empieza a hacer un shuffle a los datos
		//Parte del codigo obtenido de un comentario random de StackOverFlow de
		//https://stackoverflow.com/questions/40494624/random-shuffling-an-array-of-integers-in-java
		for (int i = 0; i < lista.length; ++i) {
			   int indice = random.nextInt(lista.length - i);
			   int temporal = lista[lista.length - 1 - i];
			   lista[lista.length - 1 - i] = lista[indice];
			   lista[indice] = temporal;
			}
		return lista;
	   }
		
}
