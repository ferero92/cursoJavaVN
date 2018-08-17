import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class EjercicioHashtable1 {
	public static void main(String[] args) {
		Hashtable<Integer, Boolean> table = new Hashtable<>();
		
		table.put(1505, true);
		table.put(2800, false);
		table.put(1350, false);
		table.put(4200, true);
		table.put(3200, true);
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduzca su codigo para ver su calificacion");
			if (table.get(Integer.parseInt(br.readLine()))) {
				System.out.println("Enhorabuena. Su calificacion es APROBADO");
			} else {
				System.out.println("Lo siento. Su calificacion es SUSPENSO");
			}
		} catch (NullPointerException | NumberFormatException | IOException ex) {
			System.out.println("Clave incorrecta");
		}
	}
}
