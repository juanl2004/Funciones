package ejercicio7;

import java.util.Scanner;

import ejercicio6.ClaseEj6;

public class MainEj7 {

	public static void main(String[] args) {
		int num;
		boolean res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		res = ClaseEj7.esPrimo(num);
		
		if (res) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		sc.close();
	}

}
