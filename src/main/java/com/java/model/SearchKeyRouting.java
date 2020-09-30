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
public class SearchKeyRouting {

    @Id
    private long id;
    private long search_key_id;
    private String table_name;
    private long table_id;
    private String type;
}
