import java.util.Arrays;

public class Pruebas {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,10,4};
		Sorts ordenador = new Sorts();
		System.out.println(Arrays.toString(ordenador.gnomeSort(arr,arr.length)));
		System.out.println(Arrays.toString(ordenador.selectionSort(arr,arr.length)));
		System.out.println(Arrays.toString(ordenador.mergeSort(arr,arr.length)));
		System.out.println(Arrays.toString(ordenador.quickSort(arr,arr.length)));
		System.out.println(Arrays.toString(ordenador.radixsort(arr,arr.length)));
	}

}
