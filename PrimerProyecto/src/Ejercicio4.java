import java.util.Scanner;

/**
 * 4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La 
fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 * @author charo
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		float centigrados;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe los grados centigrados: ");
		
		centigrados = entrada.nextFloat();
		
		float f = 32 + (9* centigrados / 5);
		
		System.out.println("Son "+ f + " grados fahrenheit.");
		
		

	}

}
