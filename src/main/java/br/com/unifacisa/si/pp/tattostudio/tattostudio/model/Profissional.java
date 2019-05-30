package br.com.unifacisa.si.pp.tattostudio.tattostudio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.dto.Especialidade;

@Entity(name = "profissional")
@SequenceGenerator(name = "seq_profissional", sequenceName = "seq_profissional", initialValue = 1, allocationSize = 1)
public class Profissional implements Serializable {

	private static final long serialVersionUID = -7200610876951232112L;

	@Id
	@Column(name = "id_profissional", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_profissional")
	private Integer id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column(name = "especialidade", nullable = false)
	private Especialidade especialidade;

	public Profissional(String nome, Especialidade especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Profissional() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}
