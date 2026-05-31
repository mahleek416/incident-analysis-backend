package com.incidentanalysis.backend.controller;

import com.incidentanalysis.backend.model.Incident;
import com.incidentanalysis.backend.service.IncidentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class IncidentController {

    private final IncidentService incidentService;

    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @GetMapping("/api/incidents")
    public List<Incident> getIncidents() {
        return incidentService.getAllIncidents();
    }

    @PostMapping("/api/incidents")
    public Incident createIncident(@RequestBody Incident incident) {
        return incidentService.saveIncident(incident);
    }

    @DeleteMapping("/api/incidents/{id}")
    public void deleteIncident(@PathVariable Long id) {
        incidentService.deleteIncident(id);
    }

    @PutMapping("/api/incidents/{id}")
    public Incident updateIncident(
            @PathVariable Long id,
            @RequestBody Incident incident) {
        return incidentService.updateIncident(id, incident);
    }

}