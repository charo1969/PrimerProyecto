import java.util.Scanner;

/**
 * 9. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
 * con la fórmula de Herón.
 * @author charo
 *
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserta lado 1 del triangulo: ");
		double lado1= teclado.nextDouble();
		
		System.out.println("Inserta lado 2 del triangulo: ");
		double lado2= teclado.nextDouble();
		
		System.out.println("Inserta lado 3 del triangulo: ");
		double lado3= teclado.nextDouble();
		
		double semiarea = (lado1+lado2+lado3)/2;
		double area= Math.sqrt(semiarea*(semiarea-lado1)*(semiarea-lado2)*(semiarea-lado3));
		
		//System.out.printf("El area del triángulo es %.2f ", area);
		
		System.out.printf("El area del triángulo de lados %.2f,"
				+ "%.2f y %.2f es %.2f ",lado1,lado2,lado3, area);

	}

}
