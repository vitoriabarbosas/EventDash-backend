package br.com.vitoriacorp.eventdash.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.vitoriacorp.eventdash.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer>{
	public ArrayList<Evento> findAllByDataEventoBetween(LocalDate inicio, LocalDate fim);
}
