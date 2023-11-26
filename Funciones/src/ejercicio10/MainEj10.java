package ejercicio10;

import java.util.Scanner;

public class MainEj10 {

	public static void main(String[] args) {
		int dia, mes, anyo;
		
		boolean esCorrecta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el dia, mes y año");
		dia = sc.nextInt();
		mes = sc.nextInt();
		anyo = sc.nextInt();
		
		esCorrecta = ClaseEj10.esFechaCorrecta(dia, mes, anyo);
		
		sc.close();
	}

}
