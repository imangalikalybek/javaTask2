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
public class Share {

    @Id
    private long id;
    private long request_id;
    private String note;
    private long sender_id;
    private long receiver_id;
    private long share_timestamp;
}
