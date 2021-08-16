package br.com.vitoriacorp.eventdash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itmn_alarme")

public class Alarme {
	
	@Column(name="id_alarme") //definindo o nome da coluna
	@Id //define que o atributo é uma pk
	@GeneratedValue(strategy=GenerationType.IDENTITY) //pra dizer que é auto-incremente
	private int id;
	
	@Column(name="nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name="descricao", length = 200, nullable = false)
	private String descricao;

	// as classes do model nao tem construtor, pq o JPA é um framework
	//ou é um construtor vazio, ou nao cria construtor
	
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
		
	
}
