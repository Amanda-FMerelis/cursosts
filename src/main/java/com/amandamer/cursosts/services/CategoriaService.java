package com.amandamer.cursosts.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.amandamer.cursosts.domain.Categoria;
import com.amandamer.cursosts.repositories.CategoriaRepository;
import com.amandamer.cursosts.services.exceptions.DataIntegrityException;
import com.amandamer.cursosts.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) { 
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())); 
		} 

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	//o inserir e o update são bem parecidos,
	//a diferença é que quando o ID é null, ele insere, qnd não, ele atualiza
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch(DataIntegrityViolationException e) {
			 throw new DataIntegrityException("Não é possivel excluir uma categoria que possui produtos!");
			 
		}
	}
	
}
