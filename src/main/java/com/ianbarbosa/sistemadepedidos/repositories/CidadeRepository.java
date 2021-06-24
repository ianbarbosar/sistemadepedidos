package com.ianbarbosa.sistemadepedidos.repositories;

import com.ianbarbosa.sistemadepedidos.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
