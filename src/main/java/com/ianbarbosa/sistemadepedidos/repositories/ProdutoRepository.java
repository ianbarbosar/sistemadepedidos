package com.ianbarbosa.sistemadepedidos.repositories;

import com.ianbarbosa.sistemadepedidos.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
