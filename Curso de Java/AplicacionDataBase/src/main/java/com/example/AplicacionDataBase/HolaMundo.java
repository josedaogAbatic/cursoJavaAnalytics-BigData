package com.example.AplicacionDataBase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HolaMundo implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ProductoRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		
		Producto producto1 = new Producto();
		
		producto1.setId(1L);
		producto1.setNombre("Libro Fundación");
		producto1.setPrecio(3.0F);
		
		Producto producto2 = new Producto();
		
		producto2.setId(2L);
		producto2.setNombre("Coche");
		producto2.setPrecio(2.0F);
		
		repositorio.save(producto1);
		repositorio.save(producto2);
		
		Optional<Producto> productoLeido = repositorio.findById(2L);
		
		if (productoLeido.isPresent()) {
			Producto p = productoLeido.get();
			log.info("El producto es: {} {} {}", p.getId(), p.getNombre(), p.getPrecio() );
		}
		else {
			log.error("El producto no se ha encontrado");
		}
		
		
		/*List<Producto> listaProducto = repositorio.findAll();
		
		Stream<Producto> flujo = listaProducto.stream();
		
		flujo.forEach( elemento -> log.info("El producto (foreach) es: {} {} {}", elemento.getId(), elemento.getNombre(), elemento.getPrecio()));*/
		
		repositorio.findAll()
			.stream()
			.forEach(elemento -> log.info("El producto (foreach) es: {} {} {}", elemento.getId(), elemento.getNombre(), elemento.getPrecio()));
		
	}
	
}
