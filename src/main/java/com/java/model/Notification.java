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
public class Notification {

    @Id
    private long id;
    private String object_type;
    private long object_id;
    private long company_unit_id;
    private long user_id;
    private long created_timestamp;
    private long viewed_timestamp;
    private boolean is_viewed;
    private String title;
    private String text;
    private long company_id;

}
