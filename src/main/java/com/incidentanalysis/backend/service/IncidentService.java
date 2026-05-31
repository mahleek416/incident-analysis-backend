package com.incidentanalysis.backend.service;

import com.incidentanalysis.backend.model.Incident;
import com.incidentanalysis.backend.repository.IncidentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentService {

    private final IncidentRepository incidentRepository;

    public IncidentService(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    private String normalizeCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            return category;
        }

        String[] words = category.trim().toLowerCase().split("\\s+");

        StringBuilder normalized = new StringBuilder();

        for (String word : words) {
            normalized.append(
                    Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }

        return normalized.toString().trim();
    }

    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }

    public Incident saveIncident(Incident incident) {

        incident.setCategory(
                normalizeCategory(incident.getCategory()));

        return incidentRepository.save(incident);
    }

    public void deleteIncident(Long id) {
        incidentRepository.deleteById(id);
    }

    public Incident updateIncident(Long id, Incident updatedIncident) {
        Incident existingIncident = incidentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Incident not found"));

        existingIncident.setName(updatedIncident.getName());
        existingIncident.setDescription(updatedIncident.getDescription());
        existingIncident.setLocation(updatedIncident.getLocation());

        existingIncident.setCategory(
                normalizeCategory(updatedIncident.getCategory()));

        existingIncident.setSeverity(updatedIncident.getSeverity());
        existingIncident.setSource(updatedIncident.getSource());
        existingIncident.setSourceUrl(updatedIncident.getSourceUrl());
        existingIncident.setDate(updatedIncident.getDate());
        existingIncident.setStatus(updatedIncident.getStatus());
        existingIncident.setColor(updatedIncident.getColor());

        return incidentRepository.save(existingIncident);
    }
}