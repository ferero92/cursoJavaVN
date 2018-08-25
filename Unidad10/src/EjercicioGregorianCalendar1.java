import java.util.*;
import java.text.*;

public class EjercicioGregorianCalendar1 {
	public static void main(String args[]) {
		DateFormatSymbols dfs = new DateFormatSymbols(new Locale("ES"));
		String diasSemana[] = dfs.getWeekdays();

		final GregorianCalendar navidadesFuturas = new GregorianCalendar(2025, 12, 25);
		int diaNav = navidadesFuturas.get(Calendar.DAY_OF_WEEK);
		System.out.println("La Navidad de 2025 caera en " + diasSemana[diaNav]);

		Date ahora = new Date();
		System.out.println("Fecha actual: " + ahora);

		Date date = navidadesFuturas.getTime();
		long dias = date.getTime() - ahora.getTime();

		long msgUnDia = (24 * 60 * 60 * 1000);
		System.out.println("Dias que faltan: " + dias / msgUnDia);
	}
}