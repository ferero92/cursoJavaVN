import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdivinarNumero {
	
	static final String GUIONES = "--------------------------------";
	static final String ASTERISCO = "*";
	
	public static void main(String[] args) {
		
		int n = (int) (Math.random() * 101);
		String entrada = "";
		boolean check = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(GUIONES);
		System.out.println("Adivina un numero entre 0 y 100");
		System.out.println(GUIONES);
		
		do {
			try {
				System.out.println("Introduce un numero o pulsa * para salir");
				entrada = br.readLine();
				
				if (entrada.equals(ASTERISCO)) {
					System.out.println("Saliendo de la aplicacion");
				} else {
					try {
					int entradaNumero = Integer.parseInt(entrada);
					String resultado = "El numero buscado es ";
					if (entradaNumero < n) {
						resultado += "mayor";
					} else if (entradaNumero > n) {
						resultado += "menor";
					} else {
						resultado += "correcto. Felicidades!";
						check = true;
					}
					System.out.println(resultado);
					} catch (NumberFormatException ex) {
						System.out.println("Entrada no valida. Vuelva a intentarlo");
					}
				}
			} catch (IOException ex) {
				System.out.println("Error al introducir entrada, pruebe de nuevo");
			}
		} while(!entrada.equals(ASTERISCO) && !check);
		
		System.out.println("FIN DEL PROGRAMA");
	}

}
