package com.incidentanalysis.backend.controller;

import com.incidentanalysis.backend.model.DataEntry;
import com.incidentanalysis.backend.service.DataEntryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class DataEntryController {

    private final DataEntryService dataEntryService;

    public DataEntryController(DataEntryService dataEntryService) {
        this.dataEntryService = dataEntryService;
    }

    @GetMapping("/api/incidents/{incidentId}/entries")
    public List<DataEntry> getEntriesByIncident(@PathVariable Long incidentId) {
        return dataEntryService.getEntriesByIncident(incidentId);
    }

    @PostMapping("/api/entries")
    public DataEntry createEntry(@RequestBody DataEntry entry) {
        return dataEntryService.saveEntry(entry);
    }

    @GetMapping("/api/entries")
    public List<DataEntry> getAllEntries() {
        return dataEntryService.getAllEntries();
    }

    @PutMapping("/api/entries/{id}")
    public DataEntry updateEntry(@PathVariable Long id, @RequestBody DataEntry entry) {
        return dataEntryService.updateEntry(id, entry);
    }

    @DeleteMapping("/api/entries/{id}")
    public void deleteEntry(@PathVariable Long id) {
        dataEntryService.deleteEntry(id);
    }
}