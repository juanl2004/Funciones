package ejercicio7;

public class ClaseEj7 {

	public static boolean esPrimo(int n) {
		boolean primo;
		
		if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
	}

}
