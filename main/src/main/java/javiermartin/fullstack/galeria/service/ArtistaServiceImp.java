package javiermartin.fullstack.galeria.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import javiermartin.fullstack.galeria.model.ArtistaDTO;

@Service
public class ArtistaServiceImp implements ArtistaService{

	ArrayList<ArtistaDTO> artistas = new ArrayList<>();

	ArtistaDTO ar = new ArtistaDTO(1, "Goya");
	ArtistaDTO ar2 = new ArtistaDTO(2, "Picasso");
	ArtistaDTO ar3 = new ArtistaDTO(3, "Dalí");
	ArtistaDTO ar4 = new ArtistaDTO(4, "Miró");

	public ArtistaServiceImp(){
	artistas.add(ar);
	artistas.add(ar2);
	artistas.add(ar3);
	artistas.add(ar4);

	}
	
	@Override
	public ArtistaDTO getArtistaById(Integer id) {
		for(ArtistaDTO a : artistas) {
			if(a.getId() == id) {
				return a;
			}
		}
		return null;
	}
}
