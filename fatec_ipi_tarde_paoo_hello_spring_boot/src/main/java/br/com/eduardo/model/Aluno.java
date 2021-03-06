package br.com.eduardo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Double mediaNotas;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getMediaNotas() {
		return mediaNotas;
	}
	public void setMediaNotas(Double mediaNotas) {
		this.mediaNotas = mediaNotas;
	}
	
	
}
