     public class MetodosEstaticosEjercicio1Corregido{
        static String nombre="Carlos";
        static void dimeNombre(){
            String mote="cucu";
            System.out.println("Tu nombre es "+nombre+" y tu mote es "+mote);
        }
        int mostrarEdad(int anNacimiento){
            return 2003-anNacimiento;
        }
        public static void main(String args[]){
            dimeNombre();
            MetodosEstaticosEjercicio1Corregido estaticos = new MetodosEstaticosEjercicio1Corregido();
            System.out.println(nombre+" tiene "+estaticos.mostrarEdad(1960)+" años");
            System.out.println("FIN DEL PROGRAMA");
        }
    }