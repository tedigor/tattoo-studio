package br.com.unifacisa.si.pp.tattostudio.tattostudio.dto;

public class AgendamentosDTO {
	
	private Long id;
	
	private Long horario;

	private Servico servico;

	private Integer idProfissional;

	private Integer idCliente;

	public AgendamentosDTO(Long id, Long horario, Servico servico) {
		super();
		this.id = id;
		this.horario = horario;
		this.servico = servico;
	}

		
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public AgendamentosDTO() {
		super();
	}

	public Long getHorario() {
		return horario;
	}

	public void setHorario(Long horario) {
		this.horario = horario;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Integer getidProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
}
