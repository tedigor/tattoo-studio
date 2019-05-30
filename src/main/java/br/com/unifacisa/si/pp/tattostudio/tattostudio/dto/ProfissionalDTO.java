package br.com.unifacisa.si.pp.tattostudio.tattostudio.dto;

public class ProfissionalDTO {
	
	private String nome;
	private Especialidade especialidade;
	
	
	public ProfissionalDTO(String nome, Especialidade especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public ProfissionalDTO() {
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
