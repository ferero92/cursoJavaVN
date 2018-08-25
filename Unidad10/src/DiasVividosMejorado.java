import java.text.*;
import java.util.*;
import java.io.*;

public class DiasVividosMejorado {
	public static void main(String args[]) {
		DiasVividosMejorado dvm = new DiasVividosMejorado();
		try {
			dvm.comunicarUsuario();
		} catch (IllegalArgumentException iae) {
			System.out.println("La fecha tecleada no existe o su formato es incorrecto");
			return;
		}
	}

	public void comunicarUsuario() {
		System.out.print("Hola majete, escribe tu nombre y pulsa enter: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String nombre = br.readLine().toUpperCase();
			System.out.println("BIENVENIDO, " + nombre);
			System.out.println("Si me ayudas un poquito te dire el dia de la semana en que naciste y tu edad en dias.");
			System.out.println("Sigue las instrucciones.");
			System.out.print("Teclea tu fecha de nacimiento (dd/mm/aaaa): ");
			String fechaNacString = br.readLine();

			GregorianCalendar calNac = obtenerCalendar(fechaNacString);

			Date fechaNac = calNac.getTime();
			Date ahora = new Date();
			if (fechaNac.before(ahora)) {
				calcularDiaSemanaNacimiento(calNac);
				calcularDiasVividos(calNac);
			} else
				System.out.println("Imposible. No puedes nacer en el futuro");

		} catch (IOException e) {
			System.out.println("Error--- " + e.toString());
		}
	}

	private GregorianCalendar obtenerCalendar(String fechaNacString) {
		StringTokenizer st = new StringTokenizer(fechaNacString, "/");
		int tokens[] = new int[st.countTokens()];
		for (int i = 0; i < tokens.length; i++) {
			tokens[i] = Integer.parseInt(st.nextToken());
		}
		tokens[1]--;

		GregorianCalendar calNac = new GregorianCalendar(tokens[2], tokens[1], tokens[0]);
		calNac.setLenient(false);
		return calNac;
	}

	private void calcularDiaSemanaNacimiento(GregorianCalendar calNac) {
		DateFormatSymbols dfs = new DateFormatSymbols(new Locale("ES"));
		String diasSemana[] = dfs.getWeekdays();

		int diaSemanaNacimiento = calNac.get(Calendar.DAY_OF_WEEK);
		System.out.println("Naciste en " + diasSemana[diaSemanaNacimiento]);
	}

	private void calcularDiasVividos(GregorianCalendar calNac) {
		Date ahora = new Date();
		Date fechaNac = calNac.getTime();

		long msg = ahora.getTime() - fechaNac.getTime();

		long msgUnDia = (24 * 60 * 60 * 1000);
		System.out.println("Dias vividos: " + msg / msgUnDia);
	}
}