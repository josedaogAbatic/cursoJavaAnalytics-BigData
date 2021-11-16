package Analytics;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Aplicacion {

	public static void main(String[] args) {
		
		/*Creamos una lista que se guarda en memoria*/
		ArrayList<Float> lista1 = new ArrayList<>();
		lista1.add(2.3F);
		lista1.add(5.0F);
		lista1.add(2.9F);
		lista1.add(7.2F);
		lista1.add(6.8F);
		
		System.out.println("Lista1: " + lista1);

		/*Creamos un Stream, desde cero y apartir de la lista anterior y los mostramos*/
		Stream<Float> flujo1 = Stream.of(10.3F, 5.0F, 2.9F, 7.2F, 6.8F);
		System.out.println("Flujo1: " + flujo1);
		
		Stream<Float> flujo2 = lista1.stream();
		System.out.println("Flujo2: " + flujo2);
		
		System.out.println(""); //Salto de línea para mejor visibilidad
		
		/*Recorrer todos los elementos del stream y mostrarlos*/
		flujo1.forEach( pepito -> System.out.println("Item Flujo1: " + pepito));
		
		flujo1.forEach( antonio -> System.out.println("Item Flujo11: " + antonio));
		
		System.out.println(""); //Salto de línea para mejor visibilidad
		
		flujo2.forEach(valor -> System.out.println("Item Flujo2: " + valor));
		
	}

}


