package com.incidentanalysis.backend.repository;

import com.incidentanalysis.backend.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
    List<Attachment> findByEntryId(Long entryId);
}