import java.io.*;
import java.util.Arrays;

import adr.cursojava.ArrayIndices;

public class YoControlo {
	int primerEle, ultimoEle;

	void introducirEleInicialFinal() throws IOException, NumberFormatException {
		/*
		 * Debe pedir por consola al usuario el primer y último elemento del array que
		 * va a generarse en la clase ArrayIndices. Si se introduce incorrectamente
		 * alguno de los números que van a ser primer y último elemento del array el
		 * programa mostrará un mensaje de formato incorrecto y finalizará su ejecución
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Primer elemento del array:");
		primerEle = Integer.parseInt(br.readLine());

		System.out.println("Ultimo elemento (mayor que el primero):");
		ultimoEle = Integer.parseInt(br.readLine());
	}

	void mostrarEleArray(int misEnteros[]) {
		/* Mostrará por consola los elementos del array */
		System.out.println("Los elementos del array son " + Arrays.toString(misEnteros));
	}

	public static void main(String args[]) throws IOException {
		/*
		 * Debe crear los objetos adecuados e invocar a los métodos oportunos para que
		 * todo funcione correctamente. Mostrará por consola el producto y la suma de
		 * los elementos del array y el cociente entre ambos.
		 */
		try {
			YoControlo yo = new YoControlo();
			yo.introducirEleInicialFinal();

			ArrayIndices array = new ArrayIndices();
			array.crearArray(yo.primerEle, yo.ultimoEle);

			yo.mostrarEleArray(array.enteros);

			double producto = array.productoEleArray();
			double suma = array.sumaEleArray();

			System.out.println("Producto elementos del array: " + producto);
			System.out.println("Suma elementos del array: " + suma);

			System.out.println("Cociente producto/suma: " + (producto / suma));
		} catch (NumberFormatException ex) {
			System.out.println("Formato de numero incorrecto");
		} catch (IOException ex) {
			throw ex;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("FIN DE PROGRAMA");
		}
	}
}