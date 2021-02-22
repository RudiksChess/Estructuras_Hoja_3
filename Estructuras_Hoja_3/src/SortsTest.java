import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author loren
 *
 */
class SortsTest {
		
	/**
	 * Declaramos el array ordenado y el array de prueba que se usaran en cada test
	 */
	int ordenado[] = {1,2,3,4,10};
	int prueba [] = {1,3,2,10,4};
	private Sorts sorts = new Sorts();
	
	@Test
	public void Testquick() {
		int[] clonazo = ordenado.clone();
		int[] algoritmo = sorts.quickSort(prueba, prueba.length);
		assertArrayEquals(ordenado,(int[]) clonazo);
	}
	@Test
	public void Testselection(){
		int[] clonazo = ordenado.clone();
		int[] algoritmo = sorts.selectionSort(prueba, prueba.length);
		assertArrayEquals(ordenado,(int[]) clonazo);
	}
	
	@Test
	public void Testmerge() {
		int[] clonazo = ordenado.clone();
		int[] algoritmo = sorts.mergeSort(prueba, prueba.length);
		assertArrayEquals(ordenado,(int[]) clonazo);
	}
	
	@Test
	public void Testgnome() {
		int[] clonazo = ordenado.clone();
		int[] algoritmo = sorts.gnomeSort(prueba, prueba.length);
		assertArrayEquals(ordenado,(int[]) clonazo);
	}
	
	@Test
	public void Testradix() {
		int[] clonazo = ordenado.clone();
		int[] algoritmo = sorts.radixsort(prueba, prueba.length);
		assertArrayEquals(ordenado,(int[]) clonazo);
	}
	
}
