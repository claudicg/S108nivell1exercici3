package n1exercici3.handlers;

import java.util.Arrays;
import java.util.List;

public class Imprimir {

	public void imprimir() {
		
		List<String> months = Arrays.asList("January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", "December");
		
		months.forEach(month -> System.out.print( month + " "));
	}
}
