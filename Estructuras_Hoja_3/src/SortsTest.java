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

	/**
	 * 
	 */
	public SortsTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @throws Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * 
	 */
	@Test
	void test() {
		fail("No ha sido implementado.");
	}
	
	@Test
	public void Testquick() {
		test.quickSort(prueba,prueba.length-1);
		assertArrayEquals(ordenado,(int[]) prueba);
	}
	@Test
	public void Testselection(){
		test.selectionSort(prueba);
		assertArrayEquals(ordenado,(int[])prueba);
	
	}
	
	@Test
	public void Testmerge() {
		test.mergeSort(prueba,0,prueba.length-1);
		assertArrayEquals(ordenado,(int[])prueba);
	}
	
	@Test
	public void Testgnome() {
		test.gnomeSort(prueba);
		assertArrayEquals(ordenado,(int[])prueba);
	}
	
	@Test
	public void Testradix() {
		test.radixSort(prueba, prueba.length-1);
		assertArrayEquals(ordenado,(int[]) prueba);
	}
	
}
