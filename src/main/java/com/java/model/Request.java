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
public class Request {

    @Id
    private long id;
    private long request_user_id;
    private long response_user_id;
    private long case_id;
    private long case_index_id;
    private String created_type;
    private String comment;
    private String status;
    private long timestamp;
    private long shareStart;
    private long shareFinish;
    private boolean favorite;
    private long updated_timestamp;
    private long updated_by;
    private String declineNote;
    private long company_unit_id;
    private long from_request_id;

}
