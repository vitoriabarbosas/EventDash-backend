package br.com.vitoriacorp.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.vitoriacorp.eventdash.model.Alarme;

public interface AlarmeDAO extends CrudRepository<Alarme, Integer>{
// uma interface precisa de uma classe para implementar a interface
	 
}

// elemento que se utiliza do model para fazer as instruções SQL 
// a gnt poderia manualmente criar as instruções dentro do controller 
// nao é uma boa prática pq a gnt nao consegue separar responsabilidades
// o model armazena os atributos e mapeia o banco de dados
// o dao vai apontar as instruções SQL
// 