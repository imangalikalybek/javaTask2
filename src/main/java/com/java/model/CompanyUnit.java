package com.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class CompanyUnit {

    @Id
    private long id;
    private String name_ru;
    private String name_kz;
    private String name_en;
    private long parent_id;
    private int year;
    private int company_id;
    private String code_index;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
