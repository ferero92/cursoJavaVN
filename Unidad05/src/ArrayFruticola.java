import java.util.Arrays;

public class ArrayFruticola {
	String frutas[] = new String[5];

	void inicializarArray() {
		/*
		 * Inicializa el array frutas con los siguientes nombres de frutas: pera, limón,
		 * melocotón, nectarina y uva. Además llama al método mostrarArrayInicial
		 * pasándo como parámetro un array que contiene el número de caracteres de cada
		 * elemento del array frutas
		 */
		frutas[0] = "pera";
		frutas[1] = "limon";
		frutas[2] = "melocoton";
		frutas[3] = "nectarina";
		frutas[4] = "uva";
		int[] frutasCaracteres = new int[5];
		
		for (int i = 0; i < frutas.length; i++) {
			frutasCaracteres[i] = frutas[i].length();
		}
		mostrarArrayInicial(frutasCaracteres);
	}

	void mostrarArrayInicial(int frutasCaracteres[]) {
		/*
		 * Muestra por consola los elementos del array frutas y el producto de los
		 * números de caracteres de sus elementos.
		 */
		int producto = 1;
		
		for (int i = 0; i < frutasCaracteres.length; i++) {
			producto *= frutasCaracteres[i];
		}
		
		System.out.println("Elementos del primer array fruticola: " + Arrays.toString(frutas));
		System.out.println("Producto del numero de caracteres = " + producto);
	}

	String[] crearNuevoArray() {
		/*
		 * Crea un nuevo array basándose en el array frutas pero sin modificarlo, del
		 * siguiente modo: Aquellas frutas que tengan más de 6 caracteres se cambiarán
		 * por la fruta melón. El resto seguirá sin cambios. El nuevo array se llamará
		 * frutillasNuevo y sus componentes serán: pera, limón, melón, melón y uva.
		 */
		String[] retorno = new String[5];
		final String MELON = "melon";
		
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i].length() > 6) {
				retorno[i] = MELON;
			} else {
				retorno[i] = frutas[i];
			}
		}
		
		return retorno;
	}

	void mostrarNuevoArray(String frutasNuevo[]) {
		/*
		 * Muestra por consola los elementos del array pasado por parámetro.
		 */
		System.out.println("Elementos del nuevo array fruticola: " + Arrays.toString(frutasNuevo));
	}

	public static void main(String args[]) {
		/*
		 * Se encargará del control de la ejecución. En él se creará una instancia de la
		 * clase y se usará para realizar las llamadas a los métodos que permitirán: 1)
		 * Inicializar el array frutas. 1) Crear un nuevo array y mostrar sus datos por
		 * consola. 3) Mensaje de FIN DE PROGRAMA.
		 */
		ArrayFruticola arrayFruticola = new ArrayFruticola();
		
		arrayFruticola.inicializarArray();
		arrayFruticola.mostrarNuevoArray(arrayFruticola.crearNuevoArray());
		
		System.out.println("FIN DEL PROGRAMA");
	}
}