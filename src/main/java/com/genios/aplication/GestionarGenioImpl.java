package com.genios.aplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.genios.entitys.Genio;
import com.genios.repo.IGenioRepo;

public class GestionarGenioImpl implements IGestionarGenio {

	@Autowired
	IGenioRepo repo;
	
	@Override
	public void crearGenio(Genio genio) {
		repo.save(genio);
	}

	@Override
	public void modificarGenio(Genio genio) {
		repo.save(genio);
	}

	@Override
	public List<Genio> listarGenios() {
		return repo.findAll();
	}

	@Override
	public void borrarGenio(Genio genio) {
		repo.delete(genio);
	}

}
