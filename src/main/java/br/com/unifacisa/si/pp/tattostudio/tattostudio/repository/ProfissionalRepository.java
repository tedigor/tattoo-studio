package br.com.unifacisa.si.pp.tattostudio.tattostudio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Integer> {
	
	Profissional findByNome(String nome);
	
	@Query(nativeQuery= true, value = "SELECT * FROM profissionais p WHERE p.exclusao_logica = false")
	List<Profissional> findAll();
}
