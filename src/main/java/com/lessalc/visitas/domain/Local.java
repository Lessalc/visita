package com.lessalc.visitas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Local {

    private String endereco;
    private int numero;
    private String complemento;
    private Long latitude;
    private Long longitude;
    private String observacoes;
}
