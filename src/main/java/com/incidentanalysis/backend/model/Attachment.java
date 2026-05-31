package com.incidentanalysis.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long entryId;
    private String fileName;
    private String fileType;
    private String filePath;

    public Attachment() {
    }

    public Long getId() {
        return id;
    }

    public Long getEntryId() {
        return entryId;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}