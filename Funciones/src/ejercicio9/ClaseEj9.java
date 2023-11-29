package ejercicio9;


public class ClaseEj9 {

	public static double operaciones(int num1, int num2, int opc) {
		double res = 0;

		switch (opc) {
		case 1:
			res = num1 + num2;
			break;
		case 2:
			res = num1 - num2;
			break;
		case 3:
			res = num1 * num2;
			break;
		case 4:
			res = num1 / num2;
			break;
		}

		return res;
	}

}