package javiermartin.fullstack.galeria.controllers;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javiermartin.fullstack.galeria.model.CuadroDTO;
import javiermartin.fullstack.galeria.service.CuadroService;

@RestController
@RequestMapping("/cuadros")
public class CuadroDTORestController {

	@Autowired
	CuadroService cs;
	
	@GetMapping()
	public ResponseEntity<?> getAllCuadros(){
		return ResponseEntity.ok(cs.getAllCuadros());
	}
	
	@PostMapping()
    public ResponseEntity<CuadroDTO> createCuadro(@RequestBody @Validated CuadroDTO c){
        cs.createCuadro(c);
        URI u = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(c.getId()).toUri(); 
        return ResponseEntity.created(u).build();
        //return ResponseEntity.ok().build();


    }
}