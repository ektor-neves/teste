package br.gov.etec.app.dtos;

import java.io.Serializable;
import java.util.Date;

public class AlunoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private String nome;
	private String rg;
	private String cpf;
	private Date data_nasc;
	private int id_curso;
	
	public AlunoDTO() {
		
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
