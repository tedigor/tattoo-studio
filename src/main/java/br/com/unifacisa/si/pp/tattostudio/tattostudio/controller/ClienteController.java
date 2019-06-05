package br.com.unifacisa.si.pp.tattostudio.tattostudio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.ClienteDTO;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Cliente;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listAll(){
		return new ResponseEntity<List<Cliente>>(service.getAll(),HttpStatus.OK); 
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Cliente> getById(@PathVariable Integer id) {
		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteDTO clienteDTO){
		service.save(clienteDTO);
		return new ResponseEntity<Cliente>(HttpStatus.CREATED); 
	}
}
