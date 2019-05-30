package br.com.unifacisa.si.pp.tattostudio.tattostudio.mapper;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.ProfissionalDTO;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Profissional;

public class ProfissionalMapper {
	
	
	public static Profissional mapper(ProfissionalDTO dto) {
		return new Profissional(dto.getNome(), dto.getEspecialidade());
	}
	
	public static ProfissionalDTO mapper(Profissional profissional) {
		return new ProfissionalDTO(profissional.getNome(), profissional.getEspecialidade());
	}
}
