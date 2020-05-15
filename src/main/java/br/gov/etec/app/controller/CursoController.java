package br.gov.etec.app.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app.dtos.CursoDTO;
import br.gov.etec.app.entity.Curso;
import br.gov.etec.app.repository.CursoRepository;



@RestController
public class CursoController {
	
	@Autowired
	CursoRepository repository;
	
	private static final Logger Log = LoggerFactory.getLogger(CursoController.class);
		
	@PostMapping	
	@RequestMapping(value = "/cadastrar")
	public void cadastarCurso(@RequestBody CursoDTO cursoDTO) {		
		repository.save(transformarDtoEntity(cursoDTO));
	}
	
	private Curso transformarDtoEntity(CursoDTO cursoDto) {
		Curso c = new Curso();
		c.setDescricao(cursoDto.getDescricao());
		c.setNome(cursoDto.getNome());
		return c;
	}
	
	@GetMapping
	@RequestMapping(value = "/listacursos")
	public List<Curso> listaCurso(){
		List<Curso> retorno = repository.findAll();
		
		for(Curso c: retorno) {
			Log.info(c.toString());
		}
          return retorno;	  
		 
	}
	
	
}
