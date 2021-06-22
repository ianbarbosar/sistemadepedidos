package com.ianbarbosa.sistemadepedidos.resources;

import com.ianbarbosa.sistemadepedidos.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ianbarbosa.sistemadepedidos.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    CategoriaService categoriaService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Categoria obj = categoriaService.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
