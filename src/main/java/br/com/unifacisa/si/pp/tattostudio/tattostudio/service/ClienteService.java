package br.com.unifacisa.si.pp.tattostudio.tattostudio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.ClienteDTO;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.exceptions.NaoAchouException;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.mapper.ClienteMapper;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Cliente;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Profissional;
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
	
	public void save(ClienteDTO dto) {
		clienteRepository.save(ClienteMapper.mapper(dto));
	}
	
	public Cliente getById(Integer id) {
		return clienteRepository.findById(id).orElseThrow(()-> NaoAchouException.build("Não achou"));
	}
}
