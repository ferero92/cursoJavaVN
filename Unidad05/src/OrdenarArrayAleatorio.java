import java.util.Arrays;

public class OrdenarArrayAleatorio {
	public static void main(String[] args) {
		double[] array = new double[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int)(Math.random() * 1000000)) / 1000000D;
		}
		
		System.out.println("Elementos del array: " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Elementos del array ordenados de menor a mayor: " + Arrays.toString(array));
//		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Elementos del array ordenados de mayor a menor: " + Arrays.toString(array));
	}
}
