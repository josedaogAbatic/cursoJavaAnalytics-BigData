package Analytics;

import java.util.ArrayList;
import java.util.Optional;

public class PracticaReduce {

	public static void main(String[] args) {

		// Creamos una lista
		ArrayList<Float> lista1 = new ArrayList<>();
		lista1.add(2.3F);
		lista1.add(5.0F);
		lista1.add(2.9F);
		lista1.add(7.2F);
		lista1.add(6.8F);

		// Aplicamos el reduce para sumar todos sus valores (Nos devuelve un Optional)
		Optional<Float> suma = lista1.stream().reduce((x, y) -> x + y);

		// Pintamos el optional: Si trae algo hace el primer lambda, y si está vacío
		// ejecuta el segundo lambda
		suma.ifPresentOrElse(item -> System.out.println(item), () -> System.out.println("No hay datos"));

		// Segunda forma del reduce
		// Aplicamos el reduce para sumar todos sus valores (Nos devuelve un Optional)
		Float resultado = lista1.stream().parallel().reduce(10.0F, (x, y) -> x + y);

		System.out.println("Segunda forma del reduce: "+resultado);

	}

}
