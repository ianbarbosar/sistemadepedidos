package com.ianbarbosa.sistemadepedidos.repositories;

import com.ianbarbosa.sistemadepedidos.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
