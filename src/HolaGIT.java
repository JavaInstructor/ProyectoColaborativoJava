import java.util.Scanner; 

public class HolaGIT {

	public static void main(String[] args) {

		System.out.println("Proyecto inicial para trabajo colaborativo.");
		
	
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribí un número para verificar paridad: ");
		int numeroIngresado = teclado.nextInt();
		
		System.out.println("¿Es par?: " + esPar(numeroIngresado));


	}

	public static boolean esPar(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}