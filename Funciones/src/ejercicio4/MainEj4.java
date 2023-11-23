package ejercicio4;

import java.util.Scanner;

public class MainEj4 {

	public static void main(String[] args) {

		boolean esVocal = false;
		String vocal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una vocal --> ");
		vocal = sc.next();
		
		ClaseEj4.esVocal(esVocal);
		

	}

}
