package com.incidentanalysis.backend.controller;

import com.incidentanalysis.backend.model.Attachment;
import com.incidentanalysis.backend.service.AttachmentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class AttachmentController {

    private final AttachmentService attachmentService;

    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    @PostMapping("/api/entries/{entryId}/attachments")
    public Attachment uploadAttachment(
            @PathVariable Long entryId,
            @RequestParam("file") MultipartFile file) throws Exception {

        String uploadDir = "uploads/";
        String fileName = System.currentTimeMillis() + "-" + file.getOriginalFilename();

        Path filePath = Paths.get(uploadDir + fileName);
        Files.write(filePath, file.getBytes());

        Attachment attachment = new Attachment();
        attachment.setEntryId(entryId);
        attachment.setFileName(file.getOriginalFilename());
        attachment.setFileType(file.getContentType());
        attachment.setFilePath(filePath.toString());

        return attachmentService.saveAttachment(attachment);
    }

    @GetMapping("/api/entries/{entryId}/attachments")
    public List<Attachment> getAttachments(@PathVariable Long entryId) {
        return attachmentService.getAttachmentsByEntry(entryId);
    }
}