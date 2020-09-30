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
public class CaseIndex {

    @Id
    private long id;
    private String case_index;
    private String title_ru;
    private String title_kz;
    private String title_en;
    private int storage_type;
    private int storage_year;
    private String note;
    private long company_unit_id;
    private long nomenclature_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;


}
