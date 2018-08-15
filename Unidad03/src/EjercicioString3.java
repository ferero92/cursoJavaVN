public class EjercicioString3 {
    public static void main(String[] args) {
        String cadena = "Esta es una frase de prueba para el ejercicio de contar letras";

        int a = 0;
        int o = 0;
        int e = 0;

        for (int i = 0; i < cadena.length(); i++) {
            Character c = cadena.charAt(i);

            if (c.equals('a')) {
                a++;
            }
            
            if (c.equals('o')) {
                o++;
            }

            if (c.equals('e')) {
                e++;
            }
        }

        System.out.println("La letra a aparece " + a + " veces");
        System.out.println("La letra o aparece " + o + " veces");
        System.out.println("La letra e aparece " + e + " veces");

        if (a > 5) {
            System.out.println("Exceso de letra a");
        }
        
        if (o > 5) {
            System.out.println("Exceso de letra o");
        }

        if (e > 5) {
            System.out.println("Exceso de letra e");
        }

        System.out.println("FIN DEL PROGRAMA");
    }
}