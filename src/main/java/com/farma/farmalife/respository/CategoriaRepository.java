package com.farma.farmalife.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farma.farmalife.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
				
	public List <Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
