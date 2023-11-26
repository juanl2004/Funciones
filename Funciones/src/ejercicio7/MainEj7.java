package ejercicio7;

import java.util.Scanner;

public class MainEj7 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		if (esPrimo(num)) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		sc.close();
	}

}
