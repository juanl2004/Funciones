package ejercicio10;

public class EcoEj10 {

	public static void main(String[] args) {
		boolean esCorrecta = false;
		
		switch (mes){
		case 2:
			if(esBisiesto(anyo))
				if(dia >=1 && dia <= 29) {
					esCorrecta = true;
				}
		}
		
		return esCorrecta;

	}
	
	public static boolean esBisiesto(iny anyo) {
		boolean bisiesto = false;
		
		if((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0)
		bisiesto = true;
	}
return bisiesto;
}
