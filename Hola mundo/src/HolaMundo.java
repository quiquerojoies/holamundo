import java.util.Scanner;

/**
 * 
 */

/**Clase HolaMundo para explicar c�mo se crea un proyecto en eclipse
 * a los alumnos de DM1A del curso 2013-14
 * @author quiquerojo
 *
 */
public class HolaMundo {

	private static Scanner teclado;

	/**m�todo que imprime una frase creativa
	 * @param args par�metros para el main
	 */
	public static void main(String[] args) {
		teclado = new Scanner (System.in);
		String nombre  = null;
		
		System.out.println("Hola queridos amiguitos de primero de DAM");
		System.out.print("Dame tu nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Hola querido "+nombre+", habitante del mundo mundial");
		System.out.println("Adi�s");

	}

}
