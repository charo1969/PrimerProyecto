import java.util.Scanner;

/**
 * 11. Programa que lee un número de 3 cifras y muestra sus cifras por separado.
345 
3
4
5 
 * @author charo
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número de tres cifras: ");
		
		int num = teclado.nextInt();
		
		System.out.println("El número es: "+num);
		
		int cifra1 = num/100;
		int resto=num%100;
		int cifra2 = resto/10;
		int cifra3 = resto%10;
		
		System.out.println(cifra1);
		System.out.println(cifra2);
		System.out.println(cifra3);
		

	}

}
