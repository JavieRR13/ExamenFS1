package javiermartin.fullstack.galeria.model;

import javiermartin.fullstack.galeria.validator.CuadroDescValidator;

public class CuadroDTO {

	Integer id;
	String title;
	
	@CuadroDescValidator
	String desc;
	
	Integer artistId;
	
	
	public CuadroDTO() {
		
	}

	public CuadroDTO(Integer id, String title, String desc, Integer artistId) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.artistId = artistId;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getArtistId() {
		return artistId;
	}

	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

	


}
