package ejercicio2;

import java.util.Scanner;

public class MainEj2 {

	public static void main(String[] args) {
		
		// Creo la variable num para guardar el valor introducido por el usuario
		int num1, num2;

		// Creamos el Scanner
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Introduce el primer número: ");
		num1 = scanner.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		num2 = scanner.nextInt();

		ClaseEj2.eco(num1, num2);
	
		// Cerramos el Scanner
		scanner.close();

	}

}