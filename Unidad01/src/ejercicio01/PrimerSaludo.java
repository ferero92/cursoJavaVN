package ejercicio01;

public class PrimerSaludo {

	public static void main(String args[]) {
		System.out.println("Hola Alumno");
		PrimerSaludo ps = new PrimerSaludo();
		ps.mostrarMensaje();
		System.out.println("Fin del programa");
	}
	
	void mostrarMensaje() {
		System.out.println("Primera clase del curso Java");
	}

}
