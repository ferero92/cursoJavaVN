import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EjercicioStringTokenizer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce una frase con varias palabras:");
		
		String frase = br.readLine();
		StringTokenizer st = new StringTokenizer(frase);
		
		System.out.println("Numero de palabras: " + st.countTokens());
		StringBuffer[] array = new StringBuffer[st.countTokens()];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = new StringBuffer(st.nextToken());
			System.out.println(array[i]);
		}
		
		System.out.println("Elementos del array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].reverse() + "\t" + array[i].getClass().getName());
		}
	}
}
