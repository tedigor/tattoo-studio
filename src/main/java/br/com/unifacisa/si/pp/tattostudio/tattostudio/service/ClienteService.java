package br.com.unifacisa.si.pp.tattostudio.tattostudio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Cliente;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.repository.ClienteRepository;

@Service
public class ClienteService {

	private ClienteRepository clienteRepository;

	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> getAll() {
		return clienteRepository.findAll();
	}
}
