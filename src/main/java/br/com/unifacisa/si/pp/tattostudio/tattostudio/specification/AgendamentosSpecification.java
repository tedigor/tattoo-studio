package br.com.unifacisa.si.pp.tattostudio.tattostudio.specification;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Agendamentos;

public class AgendamentosSpecification {
	 public static Specification<Agendamentos> byFilter(String nomeProfissional, String horarioAgendamento){
		 
		 return new Specification<Agendamentos>() {

			@Override
			public Predicate toPredicate(Root<Agendamentos> root, CriteriaQuery<?> query,
					CriteriaBuilder criteriaBuilder) {
				
				List<Predicate> predicates = new ArrayList<>(); 
				
				if (nomeProfissional != null && !nomeProfissional.isEmpty()) {
					
					predicates.add(criteriaBuilder.equal(root.get("profissional").get("nome"), nomeProfissional));
					
				}
				
				if (horarioAgendamento != null && !horarioAgendamento.isEmpty()) {
					predicates.add(criteriaBuilder.equal(root.get("horario").as(String.class), horarioAgendamento));
				}
				
				return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		 };
	 }
}
