package br.com.unifacisa.si.pp.tattostudio.tattostudio.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.AgendamentosDTO;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Agendamentos;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Profissional;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.service.AgendamentosService;

@RestController
@RequestMapping("agendamentos")
public class AgendamentosController {

	@Autowired
	private AgendamentosService service;

	@GetMapping
	public ResponseEntity<List<Agendamentos>> listAll() {
		return new ResponseEntity<List<Agendamentos>>(service.getAll(), HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<Agendamentos> getById(@PathVariable Long id) {
		return new ResponseEntity<Agendamentos>(service.getById(id), HttpStatus.OK);
	}

	@GetMapping("/query")
	public ResponseEntity<List<Agendamentos>> getByProfissionalId(
			@RequestParam(name = "nomeProfissional", required = false) String nomeProfissional,
			@RequestParam(name = "horario", required = false) String horarioAgendamento) {

		return new ResponseEntity<List<Agendamentos>>(service.findBySpecification(nomeProfissional, horarioAgendamento),
				HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Agendamentos> save(@RequestBody @Valid AgendamentosDTO agendamentoDTO) {
		service.save(agendamentoDTO);
		return new ResponseEntity<Agendamentos>(HttpStatus.CREATED);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Profissional> delete(@PathVariable Long id) {
		service.deleteAgendamentoById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Agendamentos> put(@RequestBody @Valid AgendamentosDTO agendamentoDTO) {
		service.editar(agendamentoDTO);
		return new ResponseEntity<Agendamentos>(HttpStatus.OK);
	}

}
