package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class PostagemController {

	@Autowired
	/*
	 * @Autowired (Injeção de Dependência), é a implementação utilizada pelo Spring
	 * Framework para aplicar a Inversão de Controle (IoC) quando for necessário. A
	 * Injeção de Dependência define quais Classes serão instanciadas e em quais
	 * lugares serão Injetadas quando houver necessidade.
	 */
	private PostagemRepository postagemRepository;

	
	
	@GetMapping
	public ResponseEntity <List<Postagem>>getAll(){
		return ResponseEntity.ok(postagemRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagem>getById(@PathVariable Long id){
		return postagemRepository.findById (id)
				.map (resposta -> ResponseEntity.ok (resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
}
