     public class ResolverEcuacionesSegundoGrado {
     
        double a=1.5;
        double b=3.5;
        double c=1.5;
        double discriminante=Math.pow(b, 2)-4*a*c;
        double s1, s2;
        public static void main(String args[]) {
            /* El método main se encargará de crear un objeto de la clase 
             * y llamar al método resolucion()
             */
        	ResolverEcuacionesSegundoGrado resg = new ResolverEcuacionesSegundoGrado();
        	resg.resolucion();
        }
        void resolucion(){
            /* Este método se encargará de mostrar por consola las soluciones
             * de la ecuación y de llamar al método calculitos() cuando la 
             * ecuación tenga dos soluciones reales. Si la ecuación tiene una
             * sola solución real o soluciones complejas se mostrará un mensaje 
             * por consola indicándolo no se llamará al método calculitos()
             */
        	s1 = (-b + Math.sqrt(discriminante)) / 2 * a;
        	s2 = (-b - Math.sqrt(discriminante)) / 2 * a;
        	
        	System.out.println("Las soluciones son " + s1 + " y " + s2);
        	
        	if (s1 != s2) {
        		calculitos(s1, s2);
        	}
        }
        void calculitos(double num1, double num2){
            double solMayor;
            double solMenor;
            /* Este método, mediante métodos estáticos de la clase Math, 
             * inicializará las variables locales solMenor y solMayor en base
             * a los argumentos num1 y num2.
             * Luego mostrará por consola:
             * 1) La solución mayor.
             * 2) La exponencial elevada a la solución mayor
             * 3) El coseno de la solución menor
             * 4) Las soluciones redondeadas hasta cuatro decimales
             * 5) El arcoseno de la solución mayor en radianes
             * 6) El arcoseno de la solución mayor en grados sexagesimales
             */
            solMayor = Math.max(num1, num2);
            solMenor = Math.min(num1, num2);
            // 1)
            System.out.println("Solucion mayor: " + solMayor);
            // 2)
            System.out.println("La exponencial elevada a la solucion mayor vale: " + Math.pow(solMenor, solMayor));
            // 3)
            System.out.println("El coseno de la solucion menor vale: " + Math.cos(solMenor));
            // 4)
            System.out.println("Soluciones redondeadas hasta cuatro decimales: " + redondearNumero(solMayor, 4) + " y " + redondearNumero(solMenor, 4));
            // 5)
            System.out.println("El arcoseno de la solucion mayor en radianes: " + Math.toRadians(Math.acos(solMayor)));
            // 6)
            System.out.println("El arcoseno de la solucion mayor en grados sexagesimales: " + Math.toDegrees(Math.acos(solMayor)));
        }
        
    	static double redondearNumero(double valorInicial, int numeroDecimales) {
        	double retorno = valorInicial * Math.pow(10, numeroDecimales);
        	retorno = Math.round(retorno);
        	retorno = retorno / Math.pow(10, numeroDecimales);
        	return retorno;
        }
    }