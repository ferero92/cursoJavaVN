package ejercicioBasico01;

public class EjercicioBasico01 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		CuadradoSuma cs = new CuadradoSuma();
		CuadradoDiferencia cd = new CuadradoDiferencia();
		Conclusion c = new Conclusion();
		
		System.out.println(cs.calcularCuadradoSuma(a, b));
		System.out.println(cd.calcularCuadradoDiferencia(a, b));
		c.mostrarConclusion();
	}

}
