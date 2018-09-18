package programa;

public class TestPiero2 {

	//Metodo que indique si un numero es perfecto, un numero es perfecto si la suma de sus divisores(sin contarse a sí mismo) es el mismo numero.
	//Ejemplo. 6->3,2,1. La suma de 3+2+1=6. POr lo tanto 6 es un número perfecto.

	private static String comprobarPerfecto(int num) {
		
		int sum = 0;
		for(int aux = num - 1; aux > 0; aux--) {
			if(num % aux == 0) {
				sum += aux;
			}
		}
		
		return sum == num ? "Perfecto" : "Común";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(comprobarPerfecto(6));
	}

}
