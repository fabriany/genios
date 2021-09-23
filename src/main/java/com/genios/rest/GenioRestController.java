package com.genios.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genios.aplication.IGestionarGenio;
import com.genios.entitys.Genio;

@RestController
@RequestMapping("/genios")
public class GenioRestController {
	
	@Autowired
	IGestionarGenio servicio;
	
	@GetMapping("/listar")
	public List<Genio> listarGenios(){
		return servicio.listarGenios();
	}
	
	@PostMapping("/insertar")
	public void insertarGenios(@RequestBody Genio genio){
		servicio.crearGenio(genio);
	}
	
	@PutMapping("/modificar")
	public void modificarGenios(@RequestBody Genio genio){
		servicio.modificarGenio(genio);
	}
	
	@DeleteMapping("/borrar")
	public void borrarGenios(@RequestBody Genio genio){
		servicio.modificarGenio(genio);
	}

}
