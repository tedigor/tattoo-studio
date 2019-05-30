package br.com.unifacisa.si.pp.tattostudio.tattostudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.ProfissionalDTO;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Profissional;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.service.ProfissionalService;

@RestController
@RequestMapping("profissionais")
public class ProfissionalController {

	@Autowired
	private ProfissionalService service;

	@GetMapping
	public ResponseEntity<List<Profissional>> listAll() {
		return new ResponseEntity<List<Profissional>>(service.getAll(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Profissional> save(@RequestBody ProfissionalDTO dto){
		Profissional profissional = service.save(dto);
		return new ResponseEntity<>(profissional, HttpStatus.CREATED);
	}
}
