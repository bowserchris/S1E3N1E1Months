package n1e1ejericioMonth;
//import java.util.ArrayList;  //not needed if using *; for both ArrayList & List.
import java.util.*;	//needed to use List class or .List; if only for List
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		//creando lista array para meses
		List<Month> monthList = new ArrayList<Month>();
		
		//abajo añadiendo 11 meses manualmente sin agosto
		monthList.add(new Month("January"));
		monthList.add(new Month("February"));
		monthList.add(new Month("March"));
		monthList.add(new Month("April"));
		monthList.add(new Month("May"));
		monthList.add(new Month("June"));
		monthList.add(new Month("July"));
		monthList.add(new Month("September"));
		monthList.add(new Month("October"));
		monthList.add(new Month("November"));
		monthList.add(new Month("December"));
				
		System.out.println("The month´s are: " + monthList);
		
		monthList.add(7, new Month("August"));		//añadiendo agosto a su particular posicion 8 con indice 7
		monthList.add(7, new Month("August"));
		monthList.add(7, new Month("August"));
		monthList.add(7, new Month("August"));
		
		
		
		System.out.println("The month´s are: " + monthList);
		
		Set<Month> noDups = new HashSet<Month>(monthList); //creando un hashset para no tener duplicaciones
		
		System.out.println("The month´s are: " + noDups);	//imprimir que esta vacio	
		
		//metodo for loop para añadir la lista de meses al hashset
		for (Month a : monthList) {
			noDups.add(a);
		}
		
		//iteracion de for loop para imprimirlo
		System.out.println("Printing in for loop.");
		for (Month i : noDups) {	
			System.out.println(i);
		}
		
		//iterando por la lista con el iterador
		System.out.println("Printing in iterator loop.");	
		for (Iterator<Month> it = noDups.iterator(); it.hasNext(); ) {	
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println("The month´s are: " + noDups);
		
	}
	    	
}

/*
 * Exercise 1

Create a class called Month with a "name" attribute (which will store the name of the month of the year). 
Add 11 Month objects (each with a different attribute) to an ArrayList, except for the object with the "August" 
attribute. Then, it performs the insertion in the place that corresponds to that month and shows that the ArrayList 
maintains the correct order.

Convert the ArrayList from the previous exercise into a HashSet and make sure it doesn't allow duplicates.

Iterate through the list with a for and an iterator.

 */
