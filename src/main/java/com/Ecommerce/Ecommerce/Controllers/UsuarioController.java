package com.Ecommerce.Ecommerce.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Ecommerce.Repository.UsuarioRepository;
import com.Ecommerce.Ecommerce.model.Usuario;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	//pode escrever private UsuarioRepository repository ou ->
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>>GetAll(){
		
	return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> GetById (@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
}
	
	/*@GetMapping("/nome{nome}")
	public ResponseEntity<List<Usuario>> GetByTitulo(@PathVariable String nome){
		return ResponseEntity.ok(repositoryUsuario.findAllUsuario(nome));
	
	}
	
	@GetMapping("/email{email}")
	public ResponseEntity<List<>>
	}*/
