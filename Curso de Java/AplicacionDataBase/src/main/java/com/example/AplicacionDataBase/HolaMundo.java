package com.example.AplicacionDataBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HolaMundo implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public void run(String... args) throws Exception {
		
		Producto producto1 = new Producto();
		
		producto1.setId(1L);
		producto1.setNombre("Libro Fundación");
		producto1.setPrecio(3.0F);
		
		
		log.info("El producto id: {} nombre: {} precio: {}", producto1.getId(), producto1.getNombre(), producto1.getPrecio() ); 
		
		
	}
	
}
