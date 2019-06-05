package br.com.unifacisa.si.pp.tattostudio.tattostudio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Agendamentos;

@Repository
public interface AgendamentosRepository extends JpaRepository<Agendamentos, Long>, PagingAndSortingRepository<Agendamentos, Long>, JpaSpecificationExecutor<Agendamentos> {
	
	@Query(nativeQuery = true, value = "SELECT * FROM agendamentos a WHERE a.exclusao_logica = false")
	List<Agendamentos> findAll();
	
}
