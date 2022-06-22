import java.util.Scanner;

/**12. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el 
principio como en el ejemplo.
Por ejemplo, para un número N = 12345 La salida debe ser:
1
12
123
1234
12345
 * 
 * @author charo
 *
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int num = entrada.nextInt();
		
		System.out.println("El número es "+ num);
		
		System.out.println(num/10000);
		System.out.println(num/1000);
		System.out.println(num/100);
		System.out.println(num/10);
		System.out.println(num);

	}

}
