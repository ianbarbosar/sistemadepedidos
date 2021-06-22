package com.ianbarbosa.sistemadepedidos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria implements Serializable {

    private Integer id;
    private String nome;

}
