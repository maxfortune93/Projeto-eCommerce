package com.Ecommerce.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Ecommerce.Ecommerce.model.Produto;

@Repository

public interface LojaRepository {

	@Query(value = " SELECT * FROM loja WHERE loja.nomeDaLoja = :nomeDaLoja AND descricao = :descricao", nativeQuery = true)
	public List<Produto>findAllByLoja(@Param("nomeDaLoja")String nomeDaLoja,
			@Param("descricao")String descricao);

}
