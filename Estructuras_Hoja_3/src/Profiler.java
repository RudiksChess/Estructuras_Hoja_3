import java.util.Random;
import java.util.stream.IntStream;

public class Profiler {
	/**
	 * Algoritmo para generar una lista de números aleatorios
	 * @param numero un numero entero al array para la cantidad de datos necesarios en la lista
	 * @return un array de enteros aleatorio en un rango seleccionado
	 */
	
	public int[] Generador(int numero) {
		//Se crea un array de 3000 elementos de 0 a 2999
		int[] lista = IntStream.range(0, numero).toArray();
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

	public static void main(String[] args) {
		
		Profiler gen = new Profiler();
		int [] numero = {10,50,100,500,700,1000,1500,2000,2500,3000};
		
		
		for (int num : numero) {
			
			int[] desordenado = gen.Generador(num);
			int[] ordenado = IntStream.range(0, num).toArray();
			Sorts ordenador = new Sorts();
			
			long startTime = System.nanoTime(); 
			
			//ordenador.gnomeSort(desordenado,desordenado.length);
			ordenador.selectionSort(desordenado,desordenado.length);
			//ordenador.mergeSort(desordenado,desordenado.length);
			//ordenador.quickSort(desordenado,desordenado.length);
			//ordenador.gnomeSort(desordenado,desordenado.length);
			
			//ordenador.gnomeSort(ordenado,ordenado.length);
			//ordenador.selectionSort(ordenado,ordenado.length);
			//ordenador.mergeSort(ordenado,ordenado.length);
			//ordenador.quickSort(ordenado,ordenado.length);
			//ordenador.radixsort(ordenado,ordenado.length);
			
			long estimatedTime = System.nanoTime() - startTime;
			System.out.println(estimatedTime);  
			
			
			
		}
		
		
		
	}

}
