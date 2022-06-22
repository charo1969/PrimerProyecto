import java.util.Scanner;

/**13. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el final 
igual que en el ejemplo
 * 
 * @author charo
 *
 */
public class Ejerciciio13 {

	public static void main(String[] args) {
		// Es cambiar el orden del ejercicio12
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int num = entrada.nextInt();
		
		System.out.println("El número es "+ num);
		
		
		System.out.printf("%5d\n",num%10);
		System.out.printf("%5d\n",num%100);
		System.out.printf("%5d\n",num%1000);
		System.out.printf("%5d\n",num%10000);
		System.out.printf("%5d\n",num);
	}

}
