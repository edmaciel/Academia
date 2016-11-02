package com.br.academia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="tb_escola")
public class Escola {

	@Id
	@SequenceGenerator(name="seq1",sequenceName="seq_escola")
	  @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq1")
	private Long id_escola;
	
	
	
	@Column(name="nome_escola", length=30)
	private String nome;
	
	public Long getId_escola() {
		return id_escola;
	}
	public void setId_escola(Long id_escola) {
		this.id_escola = id_escola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
