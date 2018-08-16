import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class EjercicioFile2 {
	public static void main(String[] args) throws IOException {
		File dir = new File("/home/fernando/carpeta1");
		
		
		if (dir.exists()) {
			File mortadelo = new File(dir.getPath() + "/mortadelo.txt");
			File filemon = new File(dir.getPath() + "/filemon.txt");
			
			mortadelo.createNewFile();
			filemon.createNewFile();
			System.out.println("Contenido de " + dir.getName() + " = " + Arrays.toString(dir.listFiles()));
			
			File hola = new File(dir.getPath() + "/hola");
			if (hola.mkdir()) {
				System.out.println("Directorio \"" + hola.getName() + "\" correctamente creado");
				
				File adios = new File(hola.getPath() + "/adios");
				if (adios.mkdir())
					System.out.println("Directorio \"" + adios.getName() + "\" creado");
			} else {
				System.out.println("Directorio \"" + hola.getName() + "\" no creado");
			}
		}
	}
}
