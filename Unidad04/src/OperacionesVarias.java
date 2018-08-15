import java.io.*;

public class OperacionesVarias {
	public static void main(String args[]) throws IOException {
		double total = 0D;
		double totalPositivos = 0D;
		double totalNegativos = 0D;
		
		int size = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Cuantos numeros quieres sumar?");
				size = Integer.parseInt(br.readLine());
			} catch (NumberFormatException ex) {
				System.out.println("Debes introducir un numero");
			}
		} while (size == 0);
		
		System.out.println("Teclea el primero y pulsa Enter, teclea el segundo y pulsa Enter, etc");
		for (int i = 0; i < size; i++) {
			double d = 0;
			do {				
				try {
					d = Double.parseDouble(br.readLine());
				} catch (NumberFormatException ex) {
					System.out.println("Solo se admiten numeros");
				}
			} while (d == 0);
			total += d;
			if (d <= 0D) {
				totalPositivos += d;
			} else {
				totalNegativos += d;
			}
		}
		System.out.println(
				"No va mas. Serie de numeros completada"
				+ "\nSuma total = " + total
				+ "\nSuma de los positivos = " + totalPositivos
				+ "\nSuma de los negativos = " + totalNegativos
				+ "\nFIN DEL PROGRAMA"
			);
	}
}