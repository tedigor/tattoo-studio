package br.com.unifacisa.si.pp.tattostudio.tattostudio.mapper;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.ClienteDTO;
import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Cliente;

public class ClienteMapper {
	public static Cliente mapper(ClienteDTO dto) {
		return new Cliente(dto.getNome(), dto.getTelefone(), dto.getIdade());
	}
	
	public static ClienteDTO mapper(Cliente cliente) {
		return new ClienteDTO(cliente.getNome(), cliente.getTelefone(), cliente.getIdade());
	}
}
