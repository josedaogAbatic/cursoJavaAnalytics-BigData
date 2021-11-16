package Aplicacion;

import java.util.Optional;

public class HolaOptionals {

	public static void main(String[] args) {
		
		Optional<String> optional1 = Optional.of("Hola");
		Optional<String> optional2 = Optional.of("Juan");
		
		String cadena1 = "Hola";
		String cadena2 = null;
		
		System.out.println("optional1: " + optional1);
		System.out.println("optional2: " + optional2);
		System.out.println("cadena1: " + cadena1);
		System.out.println("cadena2: " + cadena2);
		
		
		if (optional1.isPresent()) {
			System.out.println("optional1.get: " + optional1.get());
		}else System.out.println("Optional1 no tiene nada");
		
		if (optional2.isPresent()) {
			System.out.println("optional2.get: " + optional2.get());
		}else System.out.println("Optional2 no tiene nada");
		
		
		optional1.ifPresent( (contenido123) -> 
		{
			System.out.println("optional1 desde lambda: "+ contenido123);
			System.out.println("segundo mensaje del lambda: " + contenido123.toUpperCase());
		});
		
		optional2.ifPresent( valor -> System.out.println(valor));
		
		optional2.ifPresent(System.out::println);

	}

}
