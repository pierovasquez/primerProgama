package programa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	//Metodo que indique si una cadena es palindromo o no ( un palindromo es una palabra o expresion que se lee igual de izquierda a derecha que de derecha a izquierda
	private static String describirCadena(String cadena) {
		for (int i = 0, j = cadena.length() - 1; j >= 0; i++, j--) {
			if(cadena.charAt(i) != cadena.charAt(j)) {
				return "No es palindromo";
			}
		}
		return "Si es palindromo";
	}
	
	//Metodo que a partir de una cadena indique cuales son los caracteres que la componen, cuantas veces estan dentro de la cadena y en que posiciones.
	
	private static void describirCadena2(String cadena) {
		Map<Character, List<Integer>> descripcion = new HashMap<>();
		for(int i = 0; i < cadena.length(); ++i) {
			char a = cadena.charAt(i);
			List<Integer> lista = descripcion.get(a);
			if (lista == null) {
				lista = new ArrayList<Integer>();
				descripcion.put(a, lista);
			}
			lista.add(i);
		}
		for (Map.Entry<Character, List<Integer>> entry : descripcion.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(comprobarPerfecto(6));
		
		System.out.println(describirCadena("sugusu"));
		
		describirCadena2("A continuación les muestro la resolución de un examen práctico de Java para obtener");
	}

}
