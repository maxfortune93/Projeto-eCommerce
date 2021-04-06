package com.Ecommerce.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Ecommerce.Ecommerce.model.Produto;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto , Long>{


	/*List<Produto> findAllByValorLessThan(Float valor);

	List<Produto> findAllByValorGreaterThanEqual(Float valor);*/
	
	@Query(value = " SELECT * FROM produto WHERE produto.tituloProduto = :tituloProduto", nativeQuery = true)
	public List<Produto>findAllByProduto(@Param("tituloProduto")String tituloProduto);
	

	@Query(value = " SELECT * FROM produto WHERE produto.valor = :valor", nativeQuery = true)
	public List<Produto>findAllByProduto(@Param("valor")Float valor);


	/*@Query(value = " SELECT * FROM produto WHERE produto.urlImagen = :urlImagen", nativeQuery = true)
	public List<Produto>findByProduto(@Param("ulrImagen")String urlImagen);*/
	
	


}
