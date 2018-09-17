package programa;

public class TestPiero {
	
	//

	//Metodo que reciba un array numérico e indique si los numeros que lo componen esta ordenados de forma creciente, descendiente, se encuentrar revueltos o son iguales.
	
	public static String comprobarArray(int[] arr) {
		boolean asc = true, desc = true;
		
		for(int i = 1; i < arr.length && (asc || desc); i++){
			if(arr[i - 1] < arr[i]) desc = false;
			
			if(arr[i - 1] > arr[i]) asc = false;
		}
		
		if(asc || desc) {
			if (asc && desc) {
				return "Todos los numeros son iguales";
			}
			return asc ? "El orden es ascendente" : "El orden es descendiente";
		}
		return "Estan desordenados";
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,10};
		int[] arr2 = {5,4,3,2,1,-1};
		int[] arr3 = {1,1,1,1,1};
		int[] arr4 = {5,1,10,-1};
		
		System.out.println(comprobarArray(arr));
		System.out.println(comprobarArray(arr2));
		System.out.println(comprobarArray(arr3));
		System.out.println(comprobarArray(arr4));
	}

}
