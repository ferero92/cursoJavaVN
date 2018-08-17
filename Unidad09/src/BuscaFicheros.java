import java.io.*;
import java.util.*;

public class BuscaFicheros {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		/*
		 * Muestra por consola los ficheros. Cada uno de ellos son elementos de un
		 * Vector llamado 'resultados' que se obtiene después de invocar al método
		 * obtenerFicehrosBuscados(...) pasándole el directorio donde se busca y la
		 * extensión de los ficheros buscados. Si el usuario no introduce dos parámetros
		 * durante la ejecución se informará de llo y se explicará cómo debe ejecutarse.
		 */
		try {
			if (args.length != 2)
				throw new Exception();
			String dir = args[0];
			String ext = args[1];
			
			Vector resultados = obtenerFicherosBuscados(dir, ext);
			System.out.println("Se han encontrado " + resultados.size() + " ficheros de extension " + ext);
			
			for (Object o : resultados) {
				File file = (File) o;
				System.out.println(file.getName());
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Directorio no encontrado");
		} catch (Exception ex) {
			System.out.println("Ejecucion incorrecta. Se ejecuta asi:");
			System.out.println("java BuscaFicheros arg1, arg2");
			System.out.println("donde");
			System.out.println("arg1 = ruta del directorio donde se busca (/home/fernando/cursoJava, por ejemplo) y");
			System.out.println("arg2 = extension del tipo de fichero que se busca (java, por ejemplo");
		}
		
	}

	private static boolean comprobarExtension(File f, String ext) {
		/*
		 * Asegura que el objeto File del primer argumento (representará a un fichero)
		 * tiene la extensión especificada en el segundo.
		 */
		return f.getName().endsWith(ext);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Vector obtenerFicherosBuscados(String dir, String ext) throws FileNotFoundException {
		/*
		 * Devuelve un Vector que contiene todos los ficehros de la extensión buscada en
		 * el directorio especificado. Hace uso del método comprobarExtension(...).
		 */
		Vector vector = new Vector();
		File directorio = new File(dir);
		
		if (directorio.isDirectory()) {
			for (File file : directorio.listFiles()) {
				if (comprobarExtension(file, ext)) {
					vector.add(file);
				}
			}
		}
		
		return vector;
	}
}