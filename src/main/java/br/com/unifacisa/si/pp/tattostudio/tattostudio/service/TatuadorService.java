package br.com.unifacisa.si.pp.tattostudio.tattostudio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.unifacisa.si.pp.tattostudio.tattostudio.model.Tatuador;

@Service
public class TatuadorService {
	
	private List<Tatuador> tatuadores = new ArrayList<>();
	
	public List<Tatuador> listAll(Tatuador t1, Tatuador t2){
		
		tatuadores.add(t1);
		tatuadores.add(t2);
	
		return this.tatuadores;
	}
}
