package com.incidentanalysis.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String location;
    private String category;
    private String severity;
    private String source;
    private String sourceUrl;
    private String status;
    private String date;
    private String color;

    public Incident() {
    }

    public Incident(
            String name,
            String description,
            String location,
            String category,
            String severity,
            String source,
            String sourceUrl,
            String status,
            String date,
            String color) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.category = category;
        this.severity = severity;
        this.source = source;
        this.sourceUrl = sourceUrl;
        this.status = status;
        this.date = date;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public String getSeverity() {
        return severity;
    }

    public String getSource() {
        return source;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public String getColor() {
        return color;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setColor(String color) {
        this.color = color;
    }
}