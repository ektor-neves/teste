package br.gov.etec.app.dtos;

import java.io.Serializable;

public class CursoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	
	private String nome;
	private String descricao;
	
	public CursoDTO() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "CursoDTO [nome=" + nome + ", descricao=" + descricao + "]";
	}
	
	
}
