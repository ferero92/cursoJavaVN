package adr.cursojava;

public class ArrayIndices {
	public int enteros[];

	public int[] crearArray(int inferior, int superior) throws Exception {
		/*
		 * Este método va a recibir dos enteros que serán el primer y el último elemento
		 * del array que devuelve. El resto de elementos se obtendrán sumando uno al
		 * primero hasta que se llegue al último. Si el número asociado al argumento
		 * inferior es mayor que el asociado al argumento superior se mostrará por
		 * consola el mensaje
		 * "El último elemento debe ser mayor o igual que el primero.". Después el
		 * programa finalizará su ejecución.
		 */
		if (inferior > superior) {
			throw new Exception("El ultimo elemento debe ser mayor o igual que el primero");
		}
		int length = superior - inferior + 1;
		enteros = new int[length];
		int i;

		enteros[0] = inferior;

		for (i = 1; inferior < superior - 1; i++) {
			enteros[i] = ++inferior;
		}

		if (inferior != superior) {
			enteros[length - 1] = superior;
		}

		return enteros;
	}

	public double productoEleArray() {
		/* Devuelve el producto de los elementos del array */
		double retorno = 1D;

		for (int i : enteros) {
			retorno *= i;
		}

		return retorno;
	}

	public double sumaEleArray() {
		/* Devuelve la suma de los elementos del array */
		double retorno = 1D;

		for (int i : enteros) {
			retorno += i;
		}

		return retorno;
	}
}