package br.com.unifacisa.si.pp.tattostudio.tattostudio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Agendamentos;

@Repository
public interface AgendamentosRepository extends JpaRepository<Agendamentos, Long> {
	
	@Query(nativeQuery = true, value = "SELECT * FROM agendamentos a WHERE a.exclusao_logica = false")
	List<Agendamentos> findAll();
	
}
