package br.com.unifacisa.si.pp.tattostudio.tattostudio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.repository.AgendamentosRepository;

@Service
public class AgendamentosService {
	
	@Autowired
	private AgendamentosRepository agendamentosRepository;
	
	
}
