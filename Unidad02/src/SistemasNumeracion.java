     public class SistemasNumeracion {
        public static void main (String args[]){
            int num=47;
            
            SistemasNumeracion sistemasNumeracion = new SistemasNumeracion();
            sistemasNumeracion.muestraDecimal(num);
            sistemasNumeracion.muestraHexadecimal(num);
            sistemasNumeracion.muestraOctal(num);
            sistemasNumeracion.muestraBinario(num);
        }
        
        void muestraDecimal(int num) {
        	System.out.println("Numero " + num + " en sistema decimal: " + num);
        }
        
        void muestraHexadecimal(int num) {
        	System.out.println("Numero " + num + " en hexadecimal: " + Integer.toHexString(num));
        }
        
        void muestraOctal(int num) {
        	System.out.println("Numero " + num + " en sistema decimal: " + Integer.toOctalString(num));
        }
        
        void muestraBinario(int num) {
        	System.out.println("Numero " + num + " en sistema decimal: " + Integer.toBinaryString(num));
        }
    }