import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaFicheros {
	public static void main(String[] args) throws IOException {
		final String rutaWrite = "/home/fernando/resultados.txt";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ruta del fichero a leer:");
			String ruta = br.readLine();
			
			BufferedReader brf = new BufferedReader(new FileReader(ruta));
			BufferedWriter bw = new BufferedWriter(new FileWriter(rutaWrite));
			
			String line;
			int i = 0;
			int j = 0;
			
			while ((line = brf.readLine()) != null) {
				char firstChar = line.charAt(0); 
				if ('+' == firstChar || '-' == firstChar) {
					bw.write(line + "\n");
					i++;
				} else {
					System.out.println(line);
					j++;
				}
			}
			brf.close();
			bw.close();
			
			System.out.println("Lineas escritas en " + rutaWrite + " = " + i);
			System.out.println("Lineas leidas en " + ruta + " = " + j);
		} catch (FileNotFoundException ex) {
			System.out.println("Archivo no encontrado");
		} finally {
			System.out.println("FIN DE PROGRAMA");
		}
	}
}
