package sopra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Lista {
	
	
	public static void main(String[] args)
	{
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6);
		
		

		Stream<Integer> numerosPares = lista.stream().filter(e -> e % 2 == 0);
		numerosPares.forEach(
				numero -> System.out.println("Numero par:".concat(numero.toString()))
				);
		
        
	}
	
	
	

}
