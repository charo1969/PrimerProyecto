import java.util.Scanner;

/**
 * 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

 * @author charo
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una velocidad por km/h ");
		
		double velocidad = entrada.nextDouble();
		double mpors = 1000*3600;
		System.out.println("La velocidad en km/h es "+ velocidad+" a "+ mpors +" m/s");

	}

}
