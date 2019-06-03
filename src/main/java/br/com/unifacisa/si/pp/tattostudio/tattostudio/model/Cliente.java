package br.com.unifacisa.si.pp.tattostudio.tattostudio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity(name = "clientes")
@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", initialValue = 1, allocationSize = 1)
public class Cliente implements Serializable {

	private static final long serialVersionUID = 8454810021314044883L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
	@Column(name = "id_cliente", nullable = false)
	private Integer id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "telefone", nullable = false)
	private String telefone;

	@Column(name = "idade", nullable = false)
	private Integer idade;

	@OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_cliente")
	private List<Agendamentos> agendamentos = new ArrayList<>();

	@Column(name = "exclusao_logica", nullable = false)
	private Boolean exclusaoLogica = false;

	public Cliente(String nome, String telefone, Integer idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
	}

	public Cliente() {
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Agendamentos> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamentos> agendamentos) {
		this.agendamentos = agendamentos;
	}

	public void add(Agendamentos agendamento) {
		getAgendamentos().add(agendamento);
	}

}
