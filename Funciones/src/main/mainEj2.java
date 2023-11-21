package main;

import java.util.Scanner;

import funciones.Eco;

public class mainEj2 {

	public static void main(String[] args) {
		
		// Creo la variable num para guardar el valor introducido por el usuario
		int num1, num2;

		// Creamos el Scanner
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Introduce un número: ");
		num1 = scanner.nextInt();
		
		System.out.print("Introduce un número: ");
		num2 = scanner.nextInt();

		Eco.eco(num1);
		Eco.eco(num2);
		
		

		// Cerramos el Scanner
		scanner.close();

	}

}
