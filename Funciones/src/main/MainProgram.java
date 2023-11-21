package main;

import java.util.Scanner;
import funciones.Eco;

public class MainProgram {

	public static void main(String[] args) {
		// Creo la variable num para guardar el valor introducido por el usuario
		int num;

		// Creamos el Scanner
		Scanner scanner = new Scanner(System.in);

		//Le pedimos que introduzca un número el usuario
		System.out.print("Introduce un número: ");
		//Leemos el número del teclado
		num = scanner.nextInt();

		// Llama a la función eco() y pasa el número introducido por el usuario
		Eco.eco(num);

		//Cerramos el Scanner
		scanner.close();

	}

}
