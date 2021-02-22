import java.util.Arrays;
import java.util.Vector; 

/**
 * @author loren
 *
 */
public class Sorts {
	
	

	//Se usara dentro de los sorts
	/**
	 * Este metodo intercambia la informacion de dos posiciones de un array de enteros
	 * @param data lista
	 * @param i uso propio
	 * @param j uso propio
	 */
	public static void swap(int data[], int i, int j)
	// pre: 0 <= i,j < data.length
	// post: data[i] and data[j] are exchanged
	{
	int temp;
	temp = data[i];
	data[i] = data[j];
	data[j] = temp;
	}
	
	
	/**
	 * Algoritmo de  Gnome Sort 
	 * @param arr lista a ordenar
	 * @param n elementos
	 * @return un array de enteros ordenado
	 */
	public static int[] gnomeSort(int arr[], int n) 
	    { 
	        int index = 0; 
	  
	        while (index < n) { 
	            if (index == 0) 
	                index++; 
	            if (arr[index] >= arr[index - 1]) 
	                index++; 
	            else { 
	                int temp = 0; 
	                temp = arr[index]; 
	                arr[index] = arr[index - 1]; 
	                arr[index - 1] = temp; 
	                index--; 
	            } 
	        } 
	        return arr; 
	    } 
	
	//Referencia: Java Structures: Data Structures for the Principled Programmer
	/** Algoritmo de Selection Sort
	 * @param data datos a utilizar
	 * @param n elementos
	 * @return un array de enteros ordenado
	 */
	public static int[] selectionSort(int data[], int n)
	// pre: 0 <= n <= data.length
	// post: values in data[0..n-1] are in ascending order
	{
	int numUnsorted = n;
	int index; // general index
	int max; // index of largest value
	while (numUnsorted > 0){
	// determine maximum value in array
	max = 0;
	for (index = 1; index < numUnsorted; index++)
	{
	if (data[max] < data[index]) max = index;
	}
	swap(data,max,numUnsorted-1);
	numUnsorted--;
	}
	return data;
	}
	
	//Referencia: Java Structures: Data Structures for the Principled Programmer
	/**
	 * Algoritmo auxiliar del algoritmo de Merge Sort
	 * @param data datos a utilizar
	 * @param temp dato temporal
	 * @param low extremo bajo
	 * @param high extremo alto
	 */
	private static void mergeSortRecursive(int data[],
			int temp[],
			int low, int high)
			// pre: 0 <= low <= high < data.length
			// post: values in data[low..high] are in ascending order
			{
			int n = high-low+1;
			int middle = low + n/2;
			int i;
			if (n < 2) return;
			// move lower half of data into temporary storage
			for (i = low; i < middle; i++)
			{
			temp[i] = data[i];
			}
			// sort lower half of array
			mergeSortRecursive(temp,data,low,middle-1);
			// sort upper half of array
			mergeSortRecursive(data,temp,middle,high);
			// merge halves together
			merge(data,temp,low,middle,high);
			}
	
	//Referencia: Java Structures: Data Structures for the Principled Programmer
	/**
	 * Algoritmo merge sort
	 * @param data datos a utilizar
	 * @param n elementos
	 * @return un array de enteros ordenado
	 */
	public static int[] mergeSort(int data[], int n)
	// pre: 0 <= n <= data.length
	// post: values in data[0..n-1] are in ascending order
	{
	mergeSortRecursive(data,new int[n],0,n-1);
	
	return data;
	}
	//Referencia: Java Structures: Data Structures for the Principled Programmer
	/**
	 * @param data datos
	 * @param temp temporal
	 * @param low extremo bajo
	 * @param middle centro
	 * @param high alto
	 */
	private static void merge(int data[], int temp[],
			int low, int middle, int high)
			// pre: data[middle..high] are ascending
			// temp[low..middle-1] are ascending
			// post: data[low..high] contains all values in ascending order
			{
			int ri = low; // result index
			int ti = low; // temp index
			int di = middle; // destination index
			// while two lists are not empty merge smaller value
			while (ti < middle && di <= high)
			{
			if (data[di] < temp[ti]) {
			data[ri++] = data[di++]; // smaller is in high data
			} else {
			data[ri++] = temp[ti++]; // smaller is in temp
			}
			}
			// possibly some values left in temp array
			while (ti < middle)
			{
			data[ri++] = temp[ti++];
			}
			// ...or some values left (in correct place) in data array
			}
	
	//Referencia: Java Structures: Data Structures for the Principled Programmer
	/**
	 * @param data datos 
	 * @param left bajo
	 * @param right alto
	 * @return un array de enteros ordenado
	 */
	private static int partition(int data[], int left, int right)
	// pre: left <= right
	// post: data[left] placed in the correct (returned) location
	{
	while (true)
	{
	// move right "pointer" toward left
	while (left < right && data[left] < data[right]) right--;
	if (left < right) swap(data,left++,right);
	else return left;
	// move left pointer toward right
	while (left < right && data[left] < data[right]) left++;
	if (left < right) swap(data,left,right--);
	else return right;
	}
	}
	//Referencia: Java Structures: Data Structures for the Principled Programmer
	/**
	 * @param data datos 
	 * @param n elemetnos 
	 * @return un array bien nice
	 */
	public static int[] quickSort(int data[], int n)
	// post: the values in data[0..n-1] are in ascending order
	{
	quickSortRecursive(data,0,n-1);
	return data;
	}
	//Referencia: Java Structures: Data Structures for the Principled Programmer
	/**
	 * @param data datos
	 * @param left extremo bajo
	 * @param right extremo alto
	 */
	private static void quickSortRecursive(int data[],int left,int right)
	// pre: left <= right
	// post: data[left..right] in ascending order
	{
	int pivot; // the final location of the leftmost value
	if (left >= right) return;
	pivot = partition(data,left,right); /* 1 - place pivot */
	quickSortRecursive(data,left,pivot-1); /* 2 - sort small */
	quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
	/* done! */
	}
	
	//Codigo de GeeksForGeeks https://www.geeksforgeeks.org/radix-sort/
	/**
	 * Encuentra el maximo dentro de un array de enteros
	 * @param arr lista de elementos 
	 * @param n elementos
	 * @return la entrada de maximo valor
	 */
	static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
	//Codigo de GeeksForGeeks https://www.geeksforgeeks.org/radix-sort/
    // A function to do counting sort of arr[] according to 
    // the digit represented by exp. 
     /**
     * @param arr lista
     * @param n elemetnos 
     * @param exp exponente o ni idea 
     */
    public static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0); 
  
        // Store count of occurrences in count[] 
        for (i = 0; i < n; i++) 
            count[(arr[i] / exp) % 10]++; 
  
        // Change count[i] so that count[i] now contains 
        // actual position of this digit in output[] 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        // Build the output array 
        for (i = n - 1; i >= 0; i--) { 
            output[count[(arr[i] / exp) % 10] - 1] = arr[i]; 
            count[(arr[i] / exp) % 10]--; 
        } 
  
        // Copy the output array to arr[], so that arr[] now 
        // contains sorted numbers according to curent digit 
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
   //Codigo de GeeksForGeeks https://www.geeksforgeeks.org/radix-sort/
    // The main function to that sorts arr[] of size n using 
    // Radix Sort 
    /**
     * @param arr elementos
     * @param n elementos
     * @return un array bien chidorri 
     */
    public static int[] radixsort(int arr[], int n) 
    { 
        // Find the maximum number to know number of digits 
        int m = getMax(arr, n); 
  
        // Do counting sort for every digit. Note that 
        // instead of passing digit number, exp is passed. 
        // exp is 10^i where i is current digit number 
        for (int exp = 1; m / exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
        
        return arr;
    } 
	

}
