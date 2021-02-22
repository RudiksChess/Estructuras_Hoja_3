import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		//1. Se le dice al usuario que genere una lista random de valores
		//2. Se le dice si quiere ordenar los datos acorde al algortimo sort que quiera
		
		int opcion= 0; 
		Scanner entrada = new Scanner(System.in);
		
		while(opcion != 6){
			System.out.println("-------- Programa de ordenamiento ------");
			System.out.println("Seleccionar una opcion:");
			System.out.println("1. Encender programa");
			System.out.println("2. Cerrar");
			System.out.println("Respuesta: ");
			int a= entrada.nextInt();
			ListaRandom lista = new ListaRandom();
			Conversor conversor = new Conversor();
			int[] arr = lista.Generador();
			conversor.Convertir_CSV(arr);
			Sorts ordenador = new Sorts();
			
			
			if (a == 1){
				System.out.println("Seleccione algoritmo para ordenar el datos.txt: ");
				System.out.println("1. Gnome Sort");
				System.out.println("2. Selection Sort");
				System.out.println("3. Merge Sort");
				System.out.println("4. Quick Sort");
				System.out.println("5. Radix Sort");
				System.out.println("Respuesta: ");
				
				int b= entrada.nextInt();
				
				if (b==1) {
					int[] ordenado= ordenador.gnomeSort(arr,arr.length);
					conversor.Convertir_CSV(ordenado);
				}
				
				else if (b==2) {
					int[] ordenado=ordenador.selectionSort(arr,arr.length);
					conversor.Convertir_CSV(ordenado);
				}
				
				else if (b==3) {
					int[] ordenado= ordenador.mergeSort(arr,arr.length);
					conversor.Convertir_CSV(ordenado);
					
				}
				
				else if (b==4) {
					int[] ordenado=	ordenador.quickSort(arr,arr.length);
					conversor.Convertir_CSV(ordenado);
				}
				
				else if (b==5) {
					int[] ordenado= ordenador.radixsort(arr,arr.length);
					conversor.Convertir_CSV(ordenado);
				}
				
				else {
					System.out.println("El programa se ha cerrado. Valor desconocido.");
				}
				
			}

			else{
				System.out.println("El programa se ha cerrado.");
				}
			
			}
		
	}

}
