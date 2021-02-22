
import java.util.stream.IntStream;
import java.util.Random;

public class ListaRandom {
	
	/**
	 * Algoritmo para generar una lista de números aleatorios
	 * @return un array de enteros aleatorio en un rango seleccionado
	 */
	
	public int[] Generador() {
		//Se crea un array de 3000 elementos de 0 a 2999
		int[] lista = IntStream.range(0, 3000).toArray();
		//Se crea un elemento random
		Random random = new Random();
		//Aquí se empieza a hacer un shuffle a los datos
		for (int i = 0; i < lista.length; ++i) {
			   int indice = random.nextInt(lista.length - i);
			   int temporal = lista[lista.length - 1 - i];
			   lista[lista.length - 1 - i] = lista[indice];
			   lista[indice] = temporal;
			}
		return lista;
	   }
		
}
