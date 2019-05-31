package br.com.unifacisa.si.pp.tattostudio.tattostudio.dto;

import javax.validation.constraints.Min;

public class ClienteDTO {
	
	private String nome;
	
	@Min(value = 18, message = "O cliente deve possuir mais de 18 anos")
	private Integer idade;
	
	private String telefone;
	
	
	public ClienteDTO() {
	}

	public ClienteDTO(String nome, String telefone, Integer idade) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
