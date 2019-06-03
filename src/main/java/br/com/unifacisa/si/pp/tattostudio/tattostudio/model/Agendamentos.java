package br.com.unifacisa.si.pp.tattostudio.tattostudio.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.Servico;

@Entity(name = "agendamentos")
@SequenceGenerator(name = "seq_agendamentos", sequenceName = "seq_agendamentos", initialValue = 1, allocationSize = 1)
public class Agendamentos implements Serializable {

	private static final long serialVersionUID = -199943335533663156L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_agendamentos")
	@Column(name = "id_agendamento", nullable = false)
	private Long id;

	@Column(name = "horario", nullable = false, unique = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date horario;

	@Enumerated(EnumType.STRING)
	@Column(name = "servico", nullable = false)
	private Servico servico;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_profissional")
	private Profissional profissional;

	@Column(name = "exclusao_logica", nullable = false)
	private Boolean exclusaoLogica = false;

	public Agendamentos() {
		super();
	}

	public Agendamentos(Long id, Date horario, Servico servico) {
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

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public Boolean getExclusaoLogica() {
		return exclusaoLogica;
	}

	public void setExclusaoLogica(Boolean exclusaoLogica) {
		this.exclusaoLogica = exclusaoLogica;
	}

}
