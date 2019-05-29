package br.com.unifacisa.si.pp.tattostudio.tattostudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
