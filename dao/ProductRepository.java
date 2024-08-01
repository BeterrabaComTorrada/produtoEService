package br.com.produtosES.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.produtosES.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
