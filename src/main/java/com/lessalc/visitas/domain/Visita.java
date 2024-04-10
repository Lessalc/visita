package com.lessalc.visitas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Visita {


    private Long id_executante;
    private Long id_servico;
    private Local local;
    private Instant data_prevista;
    private List<Realizacao> visitas;

}
