package br.com.unifacisa.si.pp.tattostudio.tattostudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Tatuador;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.service.TatuadorService;

@RestController
@RequestMapping("tatuadores")
public class TatuadorController {
	
	@Autowired
	private TatuadorService service;
	
	@GetMapping
	public List<Tatuador> listAll() {
		return service.listAll(new Tatuador("Gordo", "Fine Line"), new Tatuador("Sandro", "Realismo"));
	}
}
