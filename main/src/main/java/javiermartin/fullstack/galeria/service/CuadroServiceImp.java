package javiermartin.fullstack.galeria.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javiermartin.fullstack.galeria.model.ArtistaDTO;
import javiermartin.fullstack.galeria.model.CuadroDTO;
import javiermartin.fullstack.galeria.exceptions.ArtworkCreationException;

@Service
public class CuadroServiceImp implements CuadroService{

	ArrayList<CuadroDTO> cuadros = new ArrayList<>();

	CuadroDTO ar = new CuadroDTO(1, "Titulo1", "hola soy la descripción uno", 1);
	CuadroDTO ar2 = new CuadroDTO(2, "Titulo2", "hola soy la descripción dos", 2);
	CuadroDTO ar3 = new CuadroDTO(3, "Titulo3", "hola soy la descripción tres", 1);
	CuadroDTO ar4 = new CuadroDTO(4,"Titulo4", "hola soy la descripción cuatro",3);
	
	public CuadroServiceImp(){
		cuadros.add(ar);
		cuadros.add(ar2);
		cuadros.add(ar3);
		cuadros.add(ar4);
	}
	
	
	
	@Autowired
	ArtistaService as;
	
	
	@Override
	public ArrayList<CuadroDTO> getAllCuadros() {
		return cuadros;
	}
	
	@Override
	public void createCuadro(CuadroDTO c) {
		
		ArtistaDTO a = as.getArtistaById(c.getArtistId());
		
		if(c.getArtistId() == a.getId()) {
			cuadros.add(c);
		}else {
		
			throw new ArtworkCreationException("El artista no esta en la élite.");
		}

	}
	
}
