package br.com.unifacisa.si.pp.tattostudio.tattostudio.model;

public class Tatuador {
	
	private String nome;
	private String estilo;
	
	public Tatuador(String nome, String estilo) {
		this.nome = nome;
		this.estilo = estilo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	
	
	
}
