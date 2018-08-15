import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioExcepciones {
	public static void main(String[] args) {
		final String GUIONES = "--------------------------------";
		
		int inicio;
		int fin;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Introduce el comienzo del bucle:");
			inicio = Integer.parseInt(bf.readLine());
			System.out.println("Introduce el final del bucle");
			fin = Integer.parseInt(bf.readLine());
			
			for (int i = inicio; i > fin; i--) {
				System.out.print((10 / i) + " ");
			}
			System.out.println();
		} catch (ArithmeticException ex) {
			System.out.println("\nOjito, division por cero " + ex);
		} catch (NumberFormatException ex) {
			System.out.println("\nSolo admito numeros enteros " + ex);
		} catch (IOException ex) {
			System.out.println("\nError al introducir el numero "+ ex);
		} finally {
			System.out.println(GUIONES);
			System.out.println("Estoy en el finally");
			System.out.println(GUIONES);
		}
		System.out.println("FIN DE PROGRAMA");
	}
}
