import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class ComprobarNIF{
    public static void main(String args[])throws IOException{
        ComprobarNIF comprobarNIF = new ComprobarNIF();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String nif = null;
        do {
            try {
                System.out.println("Introduzca NIF:");
                nif = br.readLine();
            } catch (Exception ex) {
                System.out.println("NIF no valido, vuelva a introducirlo");
                nif = null;
            }
        } while(nif == null);
        comprobarNIF.mostrarMensaje(nif, comprobarNIF.comprobar(nif));
        System.out.println("FIN DEL PROGRAMA");
    }
    
    /*
     * Método que comprueba si un nif es válido o no. Condiciones que debo comprobar:
     * Longitud cadena = 9
     * Último carácter debe ser letra; el resto dígitos
     * @param nif El nif a comprobar
     * @return true si nif válido
     */
    public boolean comprobar(String nif){
        boolean retorno = false;
        
        if (nif.length() == 9
            && extraerParteNumerica(nif).length() == 8
            && Character.isLetter(nif.charAt(nif.length() -1))) {
                    retorno = true;
        }
        return retorno;
    }
    
    /*
     * Muestra la parte numérica del nif y un mensaje indicando si es válido
     * @param nif El nif
     * @param nifValido Si es true, el nif es válido
     */
    public void mostrarMensaje(String nif,boolean nifValido){
        System.out.println("La parte numerica del NIF es: " + extraerParteNumerica(nif));

        if (comprobar(nif)) {
            System.out.println("Es un NIF valido");
        }
    }

    /*
     * Extrae la parte numerica de un nif
     * @param String nif
     * @return String parte numerica. Devuelve String vacio si no contiene parte numerica
     */
    public String extraerParteNumerica(String nif) {
        String retorno = "";

        for (int i = 0; i < nif.length(); i++) {
            char c = nif.charAt(i);
            if (Character.isDigit(c)) {
                retorno += c;
            }
        }
        return retorno;
    }

}
