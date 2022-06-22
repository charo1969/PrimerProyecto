import java.util.Scanner;

/**
 * 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

 * @author charo
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una velocidad por km/h: ");
		double km = entrada.nextDouble();
		
		double mpors = km*1000/3600;
		System.out.printf("%.2f km/h son %.2f m/s",km, mpors);
	}

}
