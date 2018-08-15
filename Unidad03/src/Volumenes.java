import java.io.*;

public class Volumenes {
	double PI = Math.PI;

	double calculaVolumenCilindro(double altura, double radio) {
		return Math.PI * (Math.pow(radio, 2)) * altura;
	}

	double calculaVolumenEsfera(double radio) {
		return (4D / 3) * Math.PI * (Math.pow(radio, 3));
	}

	public static void main(String args[]) throws IOException {
		Volumenes volumenes = new Volumenes();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		Double radioCilindro = null;
		Double radioEsfera = null;
		do {
			try {
				System.out.println("Introduce el radio del cilindro:");
				radioCilindro = Double.valueOf(br.readLine());
				System.out.println("Introduce el radio de la esfera");
				radioEsfera = Double.valueOf(br.readLine());
			} catch (Exception ex) {
				System.out.println("Error al introducir los radios, vuelva a intentarlo");
			}
		} while(radioCilindro == null || radioEsfera == null);
		
		System.out.println("Volumen cilindro = " + volumenes.calculaVolumenCilindro(1D, radioCilindro));
		System.out.println("Volumen esfera = " + volumenes.calculaVolumenEsfera(radioEsfera));
		
		System.out.println("FIN DEL PROGRAMA");
	}
}