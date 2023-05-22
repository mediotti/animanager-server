package com.medzdev.animanagerserver.model;

import com.medzdev.animanagerserver.Roles;

import java.util.UUID;

public record InformationRecordsDTO(UUID id, String name, String role) {
    public InformationRecordsDTO(InformationRecords informationRecords){
        this(informationRecords.getId(), informationRecords.getName(), informationRecords.getRecord_role());
    }


}
