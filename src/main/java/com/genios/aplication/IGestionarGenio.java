package com.genios.aplication;

import java.util.List;
import com.genios.entitys.Genio;

public interface IGestionarGenio {

	void crearGenio(Genio genio);
	void modificarGenio(Genio genio);
	List<Genio> listarGenios();
	void borrarGenio(Genio genio);
	
}
