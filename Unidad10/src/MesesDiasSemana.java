import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.Locale;

public class MesesDiasSemana {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Escribe el idioma. Puede ser aleman, frances, italiano o castellano:");

		String idioma = br.readLine();

		Locale locale;
		switch (idioma) {
		case "aleman":
			locale = Locale.GERMANY;
			break;
		case "frances":
			locale = Locale.FRANCE;
			break;
		case "italiano":
			locale = Locale.ITALY;
			break;
		default:
			locale = new Locale("ES");
			break;
		}
		DateFormatSymbols dfs = new DateFormatSymbols(locale);
		String[] months = dfs.getMonths();
		String[] days = dfs.getWeekdays();

		System.out.println("Meses en " + idioma);
		for (int i = 0; i < months.length - 1; i++) {
			System.out.print(months[i] + " ");
		}

		System.out.println("\nDias de la semana en " + idioma + ", comenzando por el domingo");
		for (int i = 1; i < days.length; i++) {
			System.out.print(days[i] + " ");
		}
	}
}
