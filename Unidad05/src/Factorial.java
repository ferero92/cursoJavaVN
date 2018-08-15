import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Factorial {
	public static void main(String[] args) throws IOException {
		int n = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		try {
			do {
				System.out.println("Escribe un numero positivo entero");
				n = Integer.parseInt(br.readLine());
			} while (n <= 0);
		} catch (NumberFormatException ex) {
			System.out.println("Debes introducir un numero entero");
		}
		
		int[] array = new int[n];
		int i = 0;
		double factorial = 1;
		
		do {
			array[i] = ++i;
			factorial *= i;
		} while (i < array.length);
		
		System.out.println("Elementos del array: " + Arrays.toString(array));
		System.out.println("El factorial de " + n + " es " + factorial);
	}
}
