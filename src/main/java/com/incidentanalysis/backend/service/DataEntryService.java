package com.incidentanalysis.backend.service;

import com.incidentanalysis.backend.model.DataEntry;
import com.incidentanalysis.backend.repository.DataEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataEntryService {

    private final DataEntryRepository dataEntryRepository;

    public DataEntryService(DataEntryRepository dataEntryRepository) {
        this.dataEntryRepository = dataEntryRepository;
    }

    public List<DataEntry> getEntriesByIncident(Long incidentId) {
        return dataEntryRepository.findByIncidentId(incidentId);
    }

    public DataEntry saveEntry(DataEntry entry) {
        return dataEntryRepository.save(entry);
    }

    public List<DataEntry> getAllEntries() {
        return dataEntryRepository.findAll();
    }

    public DataEntry updateEntry(Long id, DataEntry updatedEntry) {
        DataEntry existingEntry = dataEntryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data entry not found"));

        existingEntry.setIncidentId(updatedEntry.getIncidentId());
        existingEntry.setDescription(updatedEntry.getDescription());
        existingEntry.setSource(updatedEntry.getSource());
        existingEntry.setLocation(updatedEntry.getLocation());
        existingEntry.setCategory(updatedEntry.getCategory());
        existingEntry.setDate(updatedEntry.getDate());
        existingEntry.setLatitude(updatedEntry.getLatitude());
        existingEntry.setLongitude(updatedEntry.getLongitude());
        existingEntry.setSourceUrl(updatedEntry.getSourceUrl());
        existingEntry.setNotes(updatedEntry.getNotes());

        return dataEntryRepository.save(existingEntry);
    }

    public void deleteEntry(Long id) {
        dataEntryRepository.deleteById(id);
    }
}