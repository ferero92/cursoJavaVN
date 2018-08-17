import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.Vector;

public class CuentaPalabras {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			if (args.length != 2) {
				throw new IOException("Numero de argumentos invalidos");
			}
			String original = args[0];
			String copia = args[1];
			
			BufferedReader reader = new BufferedReader(new FileReader(original));
			BufferedWriter writer = new BufferedWriter(new FileWriter(copia));
			
			StringBuffer sb = new StringBuffer();
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
				sb.append(' ');
			}
			
			StringTokenizer st = new StringTokenizer(sb.toString());
			Vector vector = new Vector();
			while (st.hasMoreTokens()) {
				vector.add(st.nextToken());
			}
			Collections.sort(vector);
			
			Hashtable<String, Integer> resultado = new Hashtable<>();
			for (Object o : vector) {
				String s = (String) o;
				Integer contador = 1;
				if (resultado.get(s) != null) {
					contador = resultado.get(s) +1;
				}
				resultado.put(s, contador);
			}
			
			for (Entry<String, Integer> entry : resultado.entrySet()) {
				writer.write(entry.getKey() + ": " + entry.getValue());
				writer.newLine();
			}
			
			reader.close();
			writer.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Archivo no encontrado");
		} catch (IOException ex) {
			System.out.println("Error---" + ex.getMessage());
		}
	}
}
