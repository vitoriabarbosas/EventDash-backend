package br.com.vitoriacorp.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.vitoriacorp.eventdash.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	public Usuario findByEmailOrRacf(String email, String racf);
	
	// gera um select da tabela de usuários onde email = ?? ou racf = ??
	
	// estratégia de geração de query em que a query invocada é derivada do nome do método de query.
	// Podemos criar métodos que usam essa estratégia, mas precisam que o nome do método comece com Find... By... Read... 

	
}
