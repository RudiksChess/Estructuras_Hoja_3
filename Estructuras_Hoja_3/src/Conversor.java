import java.io.FileWriter;
import java.io.IOException;

public class Conversor {
	public void Convertir_CSV(int[] lista) {
		FileWriter writer;
		try {
			writer = new FileWriter("datos.txt");
			int arr[] = lista;
		 	int len = arr.length;
		      for (int i = 0; i < len; i++) {
		         writer.write(arr[i] + ",");
		      }
		      writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}

}
