package br.gov.etec.app.entity;

import java.util.Date;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

	@Id
	@SequenceGenerator(name ="seq-aluno", sequenceName = "tb_aluno_seq", initialValue = 1, allocationSize = 0 )
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq-aluno")
	@Column(name = "id_aluno", nullable = false)
	private int id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "rg")
	private String rg;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "data_nasc", nullable = false)
	private Date data_nasc;
	
	@Column(name = "id_curso", nullable = false)
	private int id_curso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	
	
	
	
}
