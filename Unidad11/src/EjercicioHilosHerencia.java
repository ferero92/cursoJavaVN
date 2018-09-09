public class EjercicioHilosHerencia {
	public static void main(String args[]) {
		int numero = Integer.parseInt(args[0]);
		CalcularFactorialR cf = new CalcularFactorialR(numero, "CalcFactorial");
		CalcularRaizCuadradaR crc = new CalcularRaizCuadradaR(numero, "CalcRaiz");
		CalcularCuadradoR cc = new CalcularCuadradoR(numero, "CalcCuadrado");

		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Comienza hilo principal");
		double suma = cf.factorial + crc.raizCuadrada + cc.cuadrado;
		System.out.println("\nSuma de los tres valores: " + suma);
		System.out.println("Acaba hilo principal");
	}
}

class CalcularFactorial extends Thread {
	private int number;
	public double factorial;
	
	public CalcularFactorial(int number, String name) {
		super(name);
		this.number = number;
		
		setPriority(Thread.MAX_PRIORITY);
		
		start();
	}
	
	public void run() {
		factorial = 1D;
		System.out.println("Comienza hilo " + getName());
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		System.out.println("Factorial de " + number + " = " + factorial);
		System.out.println("Acaba hilo " + getName());
	}
}

class CalcularRaizCuadrada extends Thread {
	private int number;
	public double raizCuadrada;
	
	public CalcularRaizCuadrada(int number, String name) {
		super(name);
		this.number = number;
		
		setPriority(MAX_PRIORITY);
		
		start();
	}
	
	public void run() {
		System.out.println("Comienza hilo " + getName());
		raizCuadrada = Math.sqrt(number);
		System.out.println("Raiz cuadrada de " + number + " = " + raizCuadrada);
		System.out.println("Acaba hilo " + getName());
	}
}

class CalcularCuadrado extends Thread {
	private int number;
	public double cuadrado;
	
	public CalcularCuadrado(int number, String name) {
		super(name);
		this.number = number;
		
		setPriority(MAX_PRIORITY);
		
		start();
	}
	
	public void run() {
		System.out.println("Comienza hilo " + getName());
		cuadrado = Math.pow(number, 2);
		System.out.println("Cuadrado de " + number + " = " + cuadrado);
		System.out.println("Acaba hilo " + getName());
	}
}









