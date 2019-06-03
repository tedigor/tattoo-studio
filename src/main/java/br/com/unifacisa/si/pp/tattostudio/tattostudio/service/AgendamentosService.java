package br.com.unifacisa.si.pp.tattostudio.tattostudio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.AgendamentosDTO;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.exceptions.NaoAchouException;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.mapper.AgendamentosMapper;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Agendamentos;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Cliente;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Profissional;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.repository.AgendamentosRepository;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.repository.ClienteRepository;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.repository.ProfissionalRepository;

@Service
public class AgendamentosService {
	
	private ClienteRepository clienteRepository;
	private ProfissionalRepository profissionalRepository;
	private AgendamentosRepository agendamentoRepository;
	
	@Autowired
	public AgendamentosService(ClienteRepository clienteRepository, ProfissionalRepository profissionalRepository,
			AgendamentosRepository agendamentoRepository) {
		super();
		this.clienteRepository = clienteRepository;
		this.profissionalRepository = profissionalRepository;
		this.agendamentoRepository = agendamentoRepository;
	}
	
	public List<Agendamentos> getAll(){
		return agendamentoRepository.findAll();
	}

	public void save(AgendamentosDTO dto) {
		Agendamentos agendamento = AgendamentosMapper.mapper(dto);
		Profissional profissional = profissionalRepository.getOne(dto.getidProfissional());
		agendamento.setProfissional(profissional);
		Cliente cliente = clienteRepository.getOne(dto.getIdCliente());
		cliente.add(agendamento);
		
		agendamentoRepository.save(agendamento);
		clienteRepository.save(cliente);
	}
	
	public void deleteAgendamentoById(Long id) {
		Agendamentos agendamento= agendamentoRepository.getOne(id); 
		agendamento.setExclusaoLogica(true);
		agendamentoRepository.save(agendamento);
	}
	
	public Agendamentos getById(Long id) {
		return agendamentoRepository.findById(id).orElseThrow(()-> NaoAchouException.build("Não achou"));
	}
	
	public void editar(AgendamentosDTO dto) {
		Agendamentos agendamento = agendamentoRepository.getOne(dto.getId());
		Profissional profissional = profissionalRepository.getOne(dto.getidProfissional());
		agendamento.setProfissional(profissional);
		
		agendamentoRepository.save(agendamento);
	}
}
 