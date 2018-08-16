import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopiarPegar {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ruta del fichero a copiar:");
			String rutaOriginal = br.readLine();
			
			System.out.println("Ruta del fichero copia el anterior:");
			String rutaCopia = br.readLine();
			
			BufferedReader reader = new BufferedReader(new FileReader(rutaOriginal));
			BufferedWriter writer = new BufferedWriter(new FileWriter(rutaCopia));
			String line;
			
			while ((line = reader.readLine()) != null) {
				writer.write(line + "\n");
			}
			writer.flush();
			
			reader.close();
			writer.close();
		} catch (IOException ex) {
			System.out.println("Error---" + ex.getMessage());
		} finally {
			System.out.println("FIN DE PROGRAMA");
		}
	}
}
