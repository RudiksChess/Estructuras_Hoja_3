import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		//1. Se le dice al usuario que genere una lista random de valores
		//2. Se le dice si quiere ordenar los datos acorde al algortimo sort que quiera
		
		int opcion= 0; 
		Scanner entrada = new Scanner(System.in);
		
		while(opcion != 6){
			
			System.out.println("Seleccionar una opcion:");
			System.out.println("1. Encender programa");
			System.out.println("2. Cerrar");
			int a= entrada.nextInt();
			ListaRandom lista = new ListaRandom();
			Conversor conversor = new Conversor();
			int[] arr = lista.Generador();
			conversor.Convertir_CSV(arr);
			
			
			if (a == 1){
				System.out.println("Seleccione algoritmo para ordenar el datos.txt: ");
				System.out.println("1.");
				System.out.println("2.");
				System.out.println("3.");
				System.out.println("4.");
				System.out.println("5.");
				System.out.println("6.");
				
				int b= entrada.nextInt();
				
				if (b==1) {
					
				}
				
				else if (b==2) {
					
				}
				
				else if (b==3) {
					
				}
				
				else if (b==4) {
					
				}
				
				else if (b==5) {
					
				}
				
				
				
				
				
				
		
			}

			else{
				System.out.println("El programa se ha cerrado.");
				}
			
			}
		
	}

}
