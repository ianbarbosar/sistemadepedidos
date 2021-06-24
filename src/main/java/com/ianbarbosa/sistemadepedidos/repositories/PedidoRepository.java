package com.ianbarbosa.sistemadepedidos.repositories;

import com.ianbarbosa.sistemadepedidos.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
