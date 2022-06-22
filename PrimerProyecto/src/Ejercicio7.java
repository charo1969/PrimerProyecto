import java.util.Scanner;

/**
 * 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud 
de la hipotenusa según el teorema de Pitágoras. 
 * @author charo
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el cateto 1: ");
		double cateto1= teclado.nextDouble();
		
		System.out.println("Introduce el cateto 2: ");
		double cateto2 = teclado.nextDouble();
		
		double hipotenusa = Math.sqrt((cateto1*cateto1) + Math.pow(cateto2,2));
		// double hipotenusa = cateto1*cateto1+Math.pow(cateto2,2);
		// double hipotenusa = Math.sqrt cateto1*cateto1+ cateto2*cateto2;
		
		//System.out.println("La longitud de la hipotenusa es "+ hipotenusa);
		
		System.out.printf("La longitud de la hipotenusa %.2f ", hipotenusa);



	}

}
