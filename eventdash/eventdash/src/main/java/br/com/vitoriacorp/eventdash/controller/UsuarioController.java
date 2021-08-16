package br.com.vitoriacorp.eventdash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitoriacorp.eventdash.dao.UsuarioDAO;
import br.com.vitoriacorp.eventdash.model.Usuario;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	// quero fazer um método de login, para isso preciso enviar infos para o backend
	
	@PostMapping ("/login")
	public Usuario fazerlogin(@RequestBody Usuario dadosLogin) {
		Usuario res = dao.findByEmailOrRacf(dadosLogin.getEmail(), dadosLogin.getRacf());
		return res;
	}
}
