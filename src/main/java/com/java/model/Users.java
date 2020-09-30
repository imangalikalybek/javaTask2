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
public class Users {

    @Id
    private long id;
    private long auth_id;
    private String name;
    private String fullName;
    private String surname;
    private String secondName;
    private String status;
    private long company_unit_id;
    private String password;
    private long last_login_timestamp;
    private String iin;
    private boolean is_active;
    private boolean is_activated;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;

}
