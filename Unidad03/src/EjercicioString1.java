public class EjercicioString1 {
    public static void main(String[] args) {
        String cadena = "En mi proxima vida, creere en la reencarnacion";

        System.out.println("Longitud de la cadena: " + cadena.length());
        System.out.println("Indice 7 asociado al caracter " + cadena.charAt(7));
        System.out.println("La subcadena generada desde 20 incluido hasta 26 excluido es " + cadena.substring(20, 26));
        System.out.println("El indice del caracter x es " + cadena.indexOf('x'));
        System.out.println("La cadena en mayusculas es " + cadena.toUpperCase());
        System.out.println("La String comienza por " + cadena.charAt(0));
    }
    
}