package main;


import java.util.Scanner;
import funciones.Eco;

public class MainProgram {

	public static void main(String[] args) { 
		int num;
		
		Scanner scanner = new Scanner(System.in);
	        
		 System.out.print("Introduce un número: ");
	        num = scanner.nextInt();

	        // Llama a la función eco() y pasa el número introducido por el usuario
	       
	        Eco.eco(num);

	        scanner.close();	

	}

}
