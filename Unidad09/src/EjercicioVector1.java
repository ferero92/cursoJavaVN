import java.util.Collections;
import java.util.Vector;

public class EjercicioVector1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		final String separador = "************************************************";
		final String planeta = "Saturno";
		final String ciudad = "Reus";
		
		Vector vector = new Vector();
		vector.add("Mercurio");
		vector.add("Venus");
		vector.add("Tierra");
		vector.add("Marte");
		vector.add("Jupiter");
		vector.add("Saturno");
		vector.add("Urano");
		vector.add("Neptuno");
		vector.add("Pluton");
		
		Collections.sort(vector);
		
		System.out.println("Capacidad: " + vector.capacity());
		System.out.println("Num. elem: " + vector.size());
		
		if (vector.contains(planeta)) {
			System.out.println("El vector contiene a Saturno");
			System.out.println("Posicion de Saturno: " + vector.indexOf(planeta));
		}
		
		System.out.println("Primer elemento: " + vector.get(0));
		System.out.println("Ultimo elemento: " + vector.get(vector.size() -1));
		
		System.out.println("Agregando " + ciudad);
		vector.add(ciudad);
		System.out.println("Nueva capacidad: " + vector.capacity());
		System.out.println("Nuevo num. elem: " + vector.size());
		
		Integer edad = 26;
		System.out.println("Agregamos objeto " + edad.getClass().getSimpleName() + " " + edad);
		System.out.println("Elementos del vector: ");
		System.out.println(separador);
		System.out.println(vector.toString());
		System.out.println(separador);
		
		System.out.println("Ahora los borro todos");
		vector.removeAllElements();
		System.out.println("Capacidad final: " + vector.capacity());
		System.out.println("Num. final elem: " + vector.size());
	}
}
