import java.io.*;
import java.util.*;

public class EjercicioHilos2 {
	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("Ejecucion incorrecta. Se ejecuta asi:");
			System.out.println("java EjercicioHilos2 arg1");
			System.out.println("donde");
			System.out.println("arg1= ruta del fichero a analizar (c:\\miFichero.txt, por ejemplo)");
			return;
		}
		String rutaFichero = args[0];
		new DetectarInsultos(rutaFichero);
		new Registro(new Date());
	}
}

class DetectarInsultos extends Thread {
	String rutaFichero;

	// Deberían agregarse
	// puta.
	// puta:
	// etc.
	String insultos[] = { "puta", "puta,", "gilipollas", "gilipollas,", "subnormal", "subnormal," };

	DetectarInsultos(String rutaFichero) {
		super();
		this.rutaFichero = rutaFichero;
		start();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void run() {
		try {
			// Flujo y filtro para leer datos del fichero
			FileReader fr = new FileReader(rutaFichero);
			BufferedReader br = new BufferedReader(fr);

			// El fichero se va a leer línea a línea. Cada línea será una String. En base a
			// esa String y mediante una
			// StringTokenizer se obtendrán cada una de sus palabras. Se comprobará si cada
			// palabra es uno de los
			// insultos especificados en el array insultos. Si eso sucede, se agrega a un
			// Hashtable la palabra analizada
			// y se va sumando el número de veces que aparece.
			String siguienteLinea;
			String palabra;
			Hashtable h = new Hashtable();
			StringTokenizer st;
			boolean control = false;
			while ((siguienteLinea = br.readLine()) != null) {
				st = new StringTokenizer(siguienteLinea);
				while (st.hasMoreTokens()) {
					palabra = st.nextToken();
					for (int i = 0; i < insultos.length; i++) {
						// Comprobar si la palabra de la línea analizada es un insulto
						if (palabra.equalsIgnoreCase(insultos[i])) {
							Integer numVeces = (Integer) h.get(palabra);
							control = true;

							// Si no hay ningún valor asociado al insulto analizado
							// devuelve null. Implica que es la primera vez que aparece
							if (numVeces == null)
								h.put(palabra, new Integer(1));

							// Si es distinto de null, se elimina el elemento del Hashtable
							// cuya clave coincide con el insulto y se agrega un nuevo elemento
							// teniendo en cuenta que el valor será un Integer, que almacena un
							// entero una unidad mayor que el del elemento eliminado
							else {
								h.remove(palabra);
								int k = numVeces.intValue();
								h.put(palabra, new Integer(k + 1));
							}
						}
					}
				}
			}
			// Mostrar el Hashtable que contiene el número de veces que aparecen
			// los insultos o un mensaje indicando que el fichero esta limpio
			if (control) {
				System.out.println("Fichero sucio");
				System.out.println(h);
			} else
				System.out.println("Fichero limpio");

			br.close();
		} catch (IOException e) {
			System.out.println("Error---" + e.toString());
		}
	}
}

class Registro extends Thread {
	Date fecha;

	Registro(Date fecha) {
		super();
		this.fecha = fecha;
		start();
	}

	public void run() {
		String destino = "c:\\registro.txt";
		try {
			// Flujo y filtro para escribir datos en el fichero
			FileWriter fw = new FileWriter(destino, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(fecha.toString());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println("Error---" + e.toString());
		}
	}
}