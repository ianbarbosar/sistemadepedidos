package com.ianbarbosa.sistemadepedidos.services;

import com.ianbarbosa.sistemadepedidos.domain.Categoria;
import com.ianbarbosa.sistemadepedidos.repositories.CategoriaRepository;
import com.ianbarbosa.sistemadepedidos.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }


}
