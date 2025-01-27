package com.farma.farmalife.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farma.farmalife.model.Categoria;
import com.farma.farmalife.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findAllByItemContainingIgnoreCase(@Param("item") String item);

}
