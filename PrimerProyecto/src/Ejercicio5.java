import java.util.Scanner;

/**
 * 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y 
muestra por pantalla la longitud y el área de la circunferencia. Longitud de la 
circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2 
 * @author charo
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el radio: ");
		double radio = entrada.nextDouble();
		
		/*double longitud = 2*Math.PI*radio;
		double area = Math.PI* Math.pow(radio,2);*/
		
		final double PI = 3.14159;
		double area = PI*radio *radio;
		double longitud = 2 *PI *radio;
		
		// System.out.println("La longitud de la circunferencia es "+ longitud+" y el area " + area+ " cm.");
		
		System.out.printf("El área es %.2f cm2 y la longitud es %.2f cm.", area, longitud);
	}

}
