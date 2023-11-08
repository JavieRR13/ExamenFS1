package javiermartin.fullstack.galeria.model;

import jakarta.validation.constraints.NotNull;

public class ArtistaDTO {
	
	@NotNull
	Integer id;
	String name;
	

	public ArtistaDTO() {
		
	}
	
	public ArtistaDTO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
