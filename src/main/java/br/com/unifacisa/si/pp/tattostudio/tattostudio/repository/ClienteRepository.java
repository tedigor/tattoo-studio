package br.com.unifacisa.si.pp.tattostudio.tattostudio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	Cliente findByNome(String nome);
	
	@Query(nativeQuery = true, value = "SELECT * FROM clientes c WHERE c.exclusao_logica = false")
	List<Cliente> findAll();
	
}
