     class Padre{
     
        String nombre = "PEPE";
        void saludo(){
            System.out.println("Estas en la clase Padre y me llamo " + nombre);
        }
    }
     
    class Hijo extends Padre{
        String nombre = "Carlos";
        void saludo(){
            System.out.println("Estas en la clase Hijo y me llamo " + nombre);
        }
        void muestraInformacion(){
            System.out.println("Nombre hijo=" + nombre);
            System.out.println("Nombre padre=" + super.nombre);
            saludo();
            super.saludo();
        }
    }
     
    public class ControladoraPadre {
        public static void main(String[] args) {
            Hijo hijo = new Hijo();
            hijo.muestraInformacion();
            System.out.println("-------------------------------------");
            hijo.saludo();
            System.out.println("FIN DE PROGRAMA");
        }
    }