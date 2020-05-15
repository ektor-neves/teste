package br.gov.etec.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app.dtos.AlunoDTO;
import br.gov.etec.app.entity.Aluno;

import br.gov.etec.app.repository.AlunoRepository;



@RestController
public class AlunoController {

	@Autowired
	AlunoRepository repository;
	

	@PostMapping	
	@RequestMapping(value = "/cadastrarAluno")
	public void cadastarAluno(@RequestBody AlunoDTO alunoDTO) {		
		repository.save(transformarDtoEntity(alunoDTO));
	}
	
	private Aluno transformarDtoEntity(AlunoDTO alunoDTO) {
		Aluno c = new Aluno();
		c.setNome(alunoDTO.getNome());
		c.setRg(alunoDTO.getRg());
		c.setCpf(alunoDTO.getCpf());
		c.setData_nasc(alunoDTO.getData_nasc());
		c.setId_curso(alunoDTO.getId_curso());
		return c;
	}
}
