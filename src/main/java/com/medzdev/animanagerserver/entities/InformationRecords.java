package com.medzdev.animanagerserver.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "information_records")
@Entity(name = "information_records")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class InformationRecords {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String record_role;

    public InformationRecords(RequestInformationRecordsDTO data){
        this.name = data.name();
        this.record_role = data.role();
    }
}
