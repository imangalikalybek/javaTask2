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
public class Authorization {

    @Id
    private long id;
    private String username;
    private String email;
    private String password;
    private String role;
    private String forgot_password_key;
    private long forgot_password_key_timestamp;
    private long company_unit_id;


}
