package ejercicio4;

public class ClaseEj4 {

	public static boolean compruebaVocal(String caracter){

		boolean res = false;
		
		switch (caracter.toLowerCase()) {
        case "a", "e", "i", "o", "u":
        	res = true;
            return true;
        default:
            return false;
		
		}
		
     }
	}


