package ejercicioBasico01;

public class EjercicioBasico02 {
	
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		EjercicioBasico02 eb02 = new EjercicioBasico02();
		
		System.out.println(eb02.calcularCuadradoSuma(a, b));
		System.out.println(eb02.calcularCuadradoDiferencia(a, b));
		eb02.mostrarConclusion();
	}
	
	private int calcularCuadradoSuma(int a, int b) {
		return (a + b) * (a + b);
	}
	
	private int calcularCuadradoDiferencia(int a, int b) {
		return (a - b) * (a - b);
	}
	
	private void mostrarConclusion() {
		System.out.println(
			"Has calculado el cuadrado de una suma y el de una diferencia. Eres un buen programador."
		);
	}

}
