package ejercicio3;

import java.util.Scanner;

import ejercicio2.ClaseEj2;

public class MainEj3 {

	public static void main(String[] args) {
		
		int num1, num2;
		int esMayor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número --> ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca otro número --> ");
		num2 = sc.nextInt();
	
		
		esMayor = ClaseEj3.esMayor(num1, num2);
		System.out.println("El número mayor es --> " + esMayor);
			
	}

}
