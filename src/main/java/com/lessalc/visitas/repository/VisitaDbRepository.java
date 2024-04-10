package com.lessalc.visitas.repository;

import com.lessalc.visitas.integration.VisitaDb;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VisitaDbRepository extends MongoRepository<VisitaDb, String> {
}
