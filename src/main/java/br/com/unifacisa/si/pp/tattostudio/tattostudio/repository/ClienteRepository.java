package br.com.unifacisa.si.pp.tattostudio.tattostudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	Cliente findByNome(String nome);
	
}
