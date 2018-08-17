public class EjercicioStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hola,bienvenido");
		
		System.out.println("La StringBuffer es: " + sb.toString());
		System.out.println("Capacidad: " + sb.capacity());
		System.out.println("Longitud: " + sb.length());
		
		sb.replace(0, 1, "B");
		System.out.println(sb.toString());
		
		int n = 5000;
		String s = "cursoJava";
		sb.append(n);
		sb.append(s);
		System.out.println(sb.toString());
		
		sb.insert(sb.indexOf("bien"), "--");
		System.out.println(sb.toString());
		
		sb.delete(0, 3);
		System.out.println(sb.toString());
		
		String string = sb.substring(sb.length() -4, sb.length());
		System.out.println(string);
		
		System.out.println("Capacidad final: " + sb.capacity());
		System.out.println("Longitud final: " + sb.length());
		
		StringBuffer nombre = new StringBuffer("Fernando");
		StringBuffer apellido1 = new StringBuffer("Rodriguez");
		StringBuffer apellido2 = new StringBuffer("Reyes");
		System.out.println(nombre + " " + apellido1 + " " + apellido2);
	}
}
