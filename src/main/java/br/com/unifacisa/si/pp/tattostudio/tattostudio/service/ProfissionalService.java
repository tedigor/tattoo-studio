package br.com.unifacisa.si.pp.tattostudio.tattostudio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.ProfissionalDTO;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.mapper.ProfissionalMapper;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Profissional;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.repository.ProfissionalRepository;

@Service
public class ProfissionalService {
	
	private ProfissionalRepository profissionalRepository;

	@Autowired
	public ProfissionalService(ProfissionalRepository profissionalRepository) {
		super();
		this.profissionalRepository = profissionalRepository;
	}
	
	public List<Profissional> getAll(){
		return profissionalRepository.findAll();
	}
	
	public Profissional save(ProfissionalDTO dto) {
		return profissionalRepository.save(ProfissionalMapper.mapper(dto));
	}
	
	public void deleteProfissionalById(Integer id) {
		 profissionalRepository.deleteById(id);
	}
	
}
