package com.incidentanalysis.backend.service;

import com.incidentanalysis.backend.model.Attachment;
import com.incidentanalysis.backend.repository.AttachmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentService {

    private final AttachmentRepository attachmentRepository;

    public AttachmentService(AttachmentRepository attachmentRepository) {
        this.attachmentRepository = attachmentRepository;
    }

    public Attachment saveAttachment(Attachment attachment) {
        return attachmentRepository.save(attachment);
    }

    public List<Attachment> getAttachmentsByEntry(Long entryId) {
        return attachmentRepository.findByEntryId(entryId);
    }
}