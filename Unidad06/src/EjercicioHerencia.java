     class MiJefe{
     
        String nombre = "Pepito";
        String telefonoCasa = "123456";
        String telefonoMovil = "987654";
        void muestraTelefonos(){
            System.out.println("Nombre= " + nombre);
            System.out.println("Telefono de casa= " + telefonoCasa);
            System.out.println("Telefono movil= " +  telefonoMovil);
        }
    }
     
    public class EjercicioHerencia extends MiJefe{
        public static void main (String args[]){
            EjercicioHerencia eh = new EjercicioHerencia();
            eh.muestraTelefonos();
        }
        void muestraTelefonos(){
            System.out.println("Los datos de mi jefe:");
            super.muestraTelefonos();
            String miNombre = "Jesus";
            String miTelefonoCasa = "941200639";
            String miTelefonoMovil = "678905582";
            System.out.println("Mis datos:");
            System.out.println("Nombre= " + miNombre);
            System.out.println("Telefono de casa= " + miTelefonoCasa);
            System.out.println("Telefono movil= " +  miTelefonoMovil);
            System.out.println("FIN DE PROGRAMA");
        } 
    }