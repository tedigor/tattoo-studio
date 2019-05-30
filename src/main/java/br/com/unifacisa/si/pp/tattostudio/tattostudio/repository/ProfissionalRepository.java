package br.com.unifacisa.si.pp.tattostudio.tattostudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Integer> {
	
	Profissional findByNome(String nome);
}
