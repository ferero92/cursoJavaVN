import java.io.File;

public class EjercicioFile1 {
	public static void main(String[] args) {
		String ruta1 = "/home/fernando/carpeta1/cucu.txt";
		String ruta2 = "/home/fernando/carpeta1/borrame.txt";
		
		File f1 = new File(ruta1);
		File f2 = new File(ruta2);
		
		if (f1.exists() && f2.exists()) {
			System.out.println("Tamaño del fichero " + f1.getName() + " = " + f1.length() + " bytes");
			System.out.println("Tamaño del fichero " + f2.getName() + " = " + f2.length() + " bytes");
			
			if (f1.canRead())
				System.out.println("Fichero leible");
			
			if (f1.canWrite())
				System.out.println("Fichero escribible");
			
			String parent = f1.getParent();
			System.out.println("Directorio padre: " + parent);
			if ('c' == parent.charAt(0) || 'C' == parent.charAt(0))
				System.out.println("El directorio padre empieza por c");
			
			System.out.println("Ruta: " + f1.getPath());
			
			if (f2.delete())
				System.out.println("Fichero \"" + f2.getName() + "\" borrado" );
		}
	}
}
