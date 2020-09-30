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
public class Fond {

    @Id
    private long id;
    private String fond_number;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
