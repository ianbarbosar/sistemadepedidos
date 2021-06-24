package com.ianbarbosa.sistemadepedidos.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EstadoPagamento {
    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private int cod;
    private String descricao;

    public static EstadoPagamento toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (EstadoPagamento x : EstadoPagamento.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id Inválido: " + cod);
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }
}
