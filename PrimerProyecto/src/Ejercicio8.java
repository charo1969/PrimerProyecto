import java.util.Scanner;

/**
 * 8. Programa que calcula el volumen de una esfera.
 * @author charo
 *
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el radio de una esfera: ");
		double radio = teclado.nextDouble();
		
		//double volumen= 4 *Math.PI*Math.pow(radio, 3)/3;
		double volumen= 4/3.0 *Math.PI*Math.pow(radio, 3);
		
		System.out.printf("El volumen de una esfera es %.2f ", volumen);
		
		
		
 
	}

}
