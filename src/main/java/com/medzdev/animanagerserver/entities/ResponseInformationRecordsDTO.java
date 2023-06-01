package com.medzdev.animanagerserver.entities;

public record ResponseInformationRecordsDTO(Long id, String name, String role) {
    public ResponseInformationRecordsDTO(InformationRecords informationRecords){
        this(informationRecords.getId(), informationRecords.getName(), informationRecords.getRecord_role());
    }


}
