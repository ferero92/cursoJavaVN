
public class Alumno {
	
	String nombre;
	String apellido;
	int edad;
	
	public Alumno(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Fernando", "Rodriguez", 26);
		Alumno a2 = new Alumno("Liviu", "Coronciuc", 27);
		Alumno a3 = new Alumno("Sumit", "Pal", 25);
		
		mostrarNosotros(new Alumno[] {a1, a2, a3});
	}

	private static void mostrarNosotros(Alumno[] alumnos) {
		for (Alumno a : alumnos) {
			System.out.println("Mi nombre es " + a.nombre + " " + a.apellido);
			System.out.println("Tengo " + a.edad + " años");
			System.out.println("------------");
		}
	}

}
