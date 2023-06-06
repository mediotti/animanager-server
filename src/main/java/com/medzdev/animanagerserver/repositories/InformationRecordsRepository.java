package com.medzdev.animanagerserver.repositories;

import com.medzdev.animanagerserver.entities.InformationRecords;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InformationRecordsRepository extends JpaRepository<InformationRecords, UUID> {
}
