package com.incidentanalysis.backend.repository;

import com.incidentanalysis.backend.model.DataEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataEntryRepository extends JpaRepository<DataEntry, Long> {

    List<DataEntry> findByIncidentId(Long incidentId);
}