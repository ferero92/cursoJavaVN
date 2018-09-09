public class EjercicioHilosRunnable {
	public static void main(String[] args) throws InterruptedException {
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

class CalcularFactorialR implements Runnable {
	private Thread thread;
	private int number;
	public double factorial;

	public CalcularFactorialR(int number, String name) {
		this.number = number;
		
		thread = new Thread(this, name);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
	}
	
	@Override
	public void run() {
		factorial = 1D;
		System.out.println("Comienza hilo " + thread.getName());
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		System.out.println("Factorial de " + number + " = " + factorial);
		System.out.println("Acaba hilo " + thread.getName());
	}
}

class CalcularRaizCuadradaR implements Runnable {
	private Thread thread;
	private int number;
	public double raizCuadrada;
	
	public CalcularRaizCuadradaR(int number, String name) {
		this.number = number;
		
		thread = new Thread(this, name);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
	}
	
	@Override
	public void run() {
		System.out.println("Comienza hilo " + thread.getName());
		raizCuadrada = Math.sqrt(number);
		System.out.println("Raiz cuadrada de " + number + " = " + raizCuadrada);
		System.out.println("Acaba hilo " + thread.getName());
	}
}

class CalcularCuadradoR implements Runnable {
	private Thread thread;
	private int number;
	public double cuadrado;
	
	public CalcularCuadradoR(int number, String name) {
		this.number = number;
		
		thread = new Thread(this, name);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Comienza hilo " + thread.getName());
		cuadrado = Math.pow(number, 2);
		System.out.println("Cuadrado de " + number + " = " + cuadrado);
		System.out.println("Acaba hilo " + thread.getName());
	}
}
