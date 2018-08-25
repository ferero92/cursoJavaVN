import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class EjercicioNumberFormat01 {
	public static void main(String[] args) throws IOException {
		final double conversion = 166.386;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Teclea una cantidad en pesetas:");
		int pesetas = Integer.parseInt(br.readLine());
		double euros = pesetas / conversion;
		
		System.out.println(pesetas + " pesetas son " + euros + " euros sin redondear y sin formato");
		
		NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("ES"));
		System.out.println(pesetas + " pesetas son " + format.format(euros) + " euros redondeados con dos decimales y con formato");
		
	}
}
