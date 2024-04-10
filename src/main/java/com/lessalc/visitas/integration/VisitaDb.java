package com.lessalc.visitas.integration;

import com.lessalc.visitas.domain.Visita;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "visita")
public class VisitaDb {
    @Id
    private String id;

    private Visita visita;
}
