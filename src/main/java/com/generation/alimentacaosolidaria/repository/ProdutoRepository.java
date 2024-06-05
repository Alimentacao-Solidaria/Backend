package com.generation.alimentacaosolidaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.alimentacaosolidaria.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllBynomeProdutoContainingIgnoreCase(@Param("nomeProduto") String nomeProduto);
}
