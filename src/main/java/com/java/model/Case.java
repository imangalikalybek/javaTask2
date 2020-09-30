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
public class Case {

    @Id
    private long id;
    private String case_number;
    private String tom_number;
    private String title_case_ru;
    private String title_case_kz;
    private String title_case_en;
    private long origin_date;
    private long final_date;
    private long page_count;
    private boolean flag_signed_ds;
    private String sign_ds;
    private boolean sign_of_sending_naf;
    private boolean deletion_sign;
    private boolean access_restriction_flag;
    private String hash;
    private int version;
    private String id_version;
    private boolean sign_of_activity_of_version;
    private String note;
    private long location_id;
    private long case_index_id;
    private long record_id;
    private long destruction_act_id;
    private long company_unit_id;
    private String case_address_in_blockchain;
    private long adding_date_to_blockchain;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;


}
