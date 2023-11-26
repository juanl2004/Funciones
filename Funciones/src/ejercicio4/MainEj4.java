package ejercicio4;

import java.util.Scanner;

public class MainEj4 {

	public static void main(String[] args) {
		
		String caracter;
		boolean esVocal;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una vocal --> ");
		caracter = sc.next();
		
		esVocal = ClaseEj4.compruebaVocal(caracter);
				
		if (esVocal) {
			System.out.println("Es una vocal");
		} else {
			System.out.println("No es una vocal");
		}		

		sc.close();
		
	}

}
