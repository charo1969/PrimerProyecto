import java.util.Scanner; // añadimos importación.

public class Prueba {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*System.out.println("Hola que tal ..");
		System.out.println('K');
		System.out.println("Yo soy charo, y estoy contenta!!!!");*/
		
		// para poner por pantalla un nombre con Scanner
		Scanner entrada = new Scanner(System.in); // definimos un objeto de tipo Scanner
		
		
		System.out.println("Introduce tu nombre: "); // escribimos el mandato.
		
		String nombre = entrada.nextLine(); // leemos el dato.
		
		System.out.println("Tu nombre es "+ nombre);// mostramos por pantalla
		entrada.close(); // cerramos.
		
	}

}
