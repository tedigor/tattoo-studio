package br.com.unifacisa.si.pp.tattostudio.tattostudio.mapper;

import java.util.Date;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.AgendamentosDTO;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Agendamentos;

public class AgendamentosMapper {
	
	public static Agendamentos mapper(AgendamentosDTO dto) {
		return new Agendamentos(dto.getId(), new Date(dto.getHorario()), dto.getServico());
	}
	
	public static AgendamentosDTO mapper(Agendamentos agendamento) {
		return new AgendamentosDTO(agendamento.getId(), agendamento.getHorario().getTime(), agendamento.getServico());
	}
}
