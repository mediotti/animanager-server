package com.medzdev.animanagerserver.model;

import java.util.UUID;

public record ResponseInformationRecordsDTO(Long id, String name, String role) {
    public ResponseInformationRecordsDTO(InformationRecords informationRecords){
        this(informationRecords.getId(), informationRecords.getName(), informationRecords.getRecord_role());
    }


}
