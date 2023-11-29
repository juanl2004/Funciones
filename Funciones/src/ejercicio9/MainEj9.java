package ejercicio9;

import java.util.Scanner;

import ejercicio6.ClaseEj6;

public class MainEj9 {

	public static void main(String[] args) {
		int num1, num2, opc;
		double res;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número -->");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número --> ");
		num2 = sc.nextInt();
		
		System.out.println("Elige --> Suma[1] - Resta[2] - Multiplicación[3] - División[4]");
		opc = sc.nextInt();
		
		res = ClaseEj9.operaciones(num1, num2, opc);
		
		System.out.println("La solución es " + res);
		

	}

}
