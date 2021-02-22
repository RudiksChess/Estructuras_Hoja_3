	import java.util.Arrays;
import java.util.Vector; 

public class Sorts {

	//Se usará dentro de los sorts
	public static void swap(int data[], int i, int j)
	// pre: 0 <= i,j < data.length
	// post: data[i] and data[j] are exchanged
	{
	int temp;
	temp = data[i];
	data[i] = data[j];
	data[j] = temp;
	}
	
	public Integer[] Gnome(Integer[] array) {
		
		return array;
	}
	 static void gnomeSort(int arr[], int n) 
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
	        return; 
	    } 
	
	//Referencia: Java Structures: Data Structures for the Principled Programmer
	public static void selectionSort(int data[], int n)
	// pre: 0 <= n <= data.length
	// post: values in data[0..n-1] are in ascending order
	{
	int numUnsorted = n;
	int index; // general index
	int max; // index of largest value
	while (numUnsorted > 0)
	{
	// determine maximum value in array
	max = 0;
	for (index = 1; index < numUnsorted; index++)
	{
	if (data[max] < data[index]) max = index;
	}
	swap(data,max,numUnsorted-1);
	numUnsorted--;
	}
	}
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
	public static void mergeSort(int data[], int n)
	// pre: 0 <= n <= data.length
	// post: values in data[0..n-1] are in ascending order
	{
	mergeSortRecursive(data,new int[n],0,n-1);
	}
	
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
	
	public static void quickSort(int data[], int n)
	// post: the values in data[0..n-1] are in ascending order
	{
	quickSortRecursive(data,0,n-1);
	}
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
	
	public static int digit(int n, int d)
	// pre: n >= 0 and d >= 0
	// post: returns the value of the dth decimal place of n
	// where the units place has position 0
	{
	if (d == 0) return n % 10;
	else return digit(n/10,d-1);
	}
	public static void bucketPass(int data[], int d)
	// pre: data is an array of data values, and d >= 0
	// post: data is sorted by the digit found in location d;
	// if two values have the same digit in location d, their
	// relative positions do not change; i.e., they are not swapped
	{
	int i,j;
	int value;
	// allocate some buckets
	Vector<Vector<Integer>> bucket = new Vector<Vector<Integer>>(10);
	bucket.setSize(10);
	// allocate Vectors to hold values in each bucket
	for (j = 0; j < 10; j++) bucket.set(j,new Vector<Integer>());
	// distribute the data among buckets
	int n = data.length;
	for (i = 0; i < n; i++)
	{
	value = data[i];
	// determine the d'th digit of value
	j = digit(value,d);
	// add data value to end of vector; keeps values in order
	bucket.get(j).add(value);
	}
	// collect data from buckets back into array
	// collect in reverse order to unload Vectors
	// in linear time
	i = n;
	for (j = 9; j >= 0; j--)
	{
	// unload all values in bucket j
	while (!bucket.get(j).isEmpty())
	{
	i--;
	value = bucket.get(j).remove(j);
	data[i] = value;
	}
	}
	}
	
	public static void radixSort(int data[])
	// pre: data is array of values; each is less than 1,000,000
	// post: data in the array are sorted into increasing order
	{
	for (int i = 0; i < 6; i++)
	{
	bucketPass(data,i);
	}
	}
	

}
