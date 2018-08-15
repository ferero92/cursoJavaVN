import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectanguloConConstructorPorLineaComando {
        double x1,y1,x2,y2;
        
        RectanguloConConstructorPorLineaComando() throws IOException {
            System.out.println("Inicio constructor");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            x1 = Double.parseDouble(br.readLine());
        	x2 = Double.parseDouble(br.readLine());
        	y1 = Double.parseDouble(br.readLine());
        	y2 = Double.parseDouble(br.readLine());
            
            System.out.println("Fin constructor");
        }
        double calculaArea(){
            
            return Math.abs((x2-x1)*(y2-y1));
        }
        
        public static void main(String args[]) throws IOException {
        	
        	RectanguloConConstructorPorLineaComando r1=new RectanguloConConstructorPorLineaComando();
            System.out.println("Area="+r1.calculaArea());
            
            System.out.println("FIN DE PROGRAMA");
        }
    }