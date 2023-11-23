package ejercicio5;

import java.util.Scanner;

import ejercicio2.ClaseEj2;

public class MainEj5 {

	public static void main(String[] args) {
		int num; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número del que deseas conocecer su tabla --> ");
		num = sc.nextInt();
		
		ClaseEj5.tabla(num);
	}

}
