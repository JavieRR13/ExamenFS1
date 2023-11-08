package javiermartin.fullstack.galeria.service;

import java.util.ArrayList;

import javiermartin.fullstack.galeria.model.CuadroDTO;

public interface CuadroService {

	ArrayList<CuadroDTO> getAllCuadros();
	void createCuadro(CuadroDTO c);
	
}
