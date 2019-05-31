package br.com.unifacisa.si.pp.tattostudio.tattostudio.dto;

import java.time.LocalDateTime;

public class AgendamentosDTO {
	

	
	private LocalDateTime horario;
	
	private Servico servico;

	private Integer id_profissional;
	
	private Integer id_cliente;

	public AgendamentosDTO(LocalDateTime horario, Servico servico, Integer id_profissional, Integer id_cliente) {
		this.horario = horario;
		this.servico = servico;
		this.id_profissional = id_profissional;
		this.id_cliente = id_cliente;
	}

	public AgendamentosDTO() {
		
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Integer getId_profissional() {
		return id_profissional;
	}

	public void setId_profissional(Integer id_profissional) {
		this.id_profissional = id_profissional;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
	
}
