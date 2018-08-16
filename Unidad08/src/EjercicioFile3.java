import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class EjercicioFile3 {
	public static void main(String[] args) throws IOException {
		File dir = new File("/home/fernando/carpeta1");
		
		File[] subDirs = dir.listFiles();
		System.out.println("Numero elementos array = " + subDirs.length);
		System.out.println(Arrays.toString(subDirs));
		
		for (File file : subDirs) {
			if (!file.isDirectory() || file.listFiles().length == 0) {
				file.delete();
			}
		}
		
		System.out.println("Numero elementos despues de eliminar = " + subDirs.length);
		System.out.println(Arrays.toString(subDirs));
	}
}
