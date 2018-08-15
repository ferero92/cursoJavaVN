public class EjercicioString2 {
    public static void main(String[] args) {
        String cadena = "Esta es una frase de prueba para el ejercicio de contar letras";

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("El numero de veces que aparece el caracter 'a' en la cadena es: " + contador + ".");
    }
}