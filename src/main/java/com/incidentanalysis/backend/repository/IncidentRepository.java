package com.incidentanalysis.backend.repository;

import com.incidentanalysis.backend.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepository extends JpaRepository<Incident, Long> {

}