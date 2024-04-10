package com.lessalc.visitas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Realizacao {

    private Instant data_visita;
    private String observacoes;
    private String parecer;
    private boolean nova_visita_necessaria;
}
