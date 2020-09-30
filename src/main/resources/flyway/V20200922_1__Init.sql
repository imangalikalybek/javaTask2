Drop table if exists fond;
create table fond(
    id serial not null constraint fond_pk unique,
    fond_number varchar default 128,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
Drop table if exists company;
create table company(
    id serial not null constraint company_id unique,
    name_ru varchar default 128,
    name_kz varchar default 128,
    name_en varchar default 128,
    bin varchar default 32,
    parent_id int8 ,
    fond_id int8 constraint company_font_id_fk references fond (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
Drop table if exists company_unit;
create table company_unit(
    id serial not null  constraint company_unit_pk unique,
    name_ru varchar default 128,
    name_kz varchar default 128,
    name_en varchar default 128,
    parent_id int8,
    year int4,
    company_id int4 constraint company_unit_company_id_fk references company (id),
    index varchar default 16,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
DROP Table if exists auth;
create table auth (
    id serial not null constraint auth_id unique,
    login varchar unique default 255,
    email varchar default 255,
    password varchar default 128,
    role varchar default 255,
    forgot_password_key varchar default 255,
    forgot_password_key_timestamp int8,
    company_unit_id int8 constraint auth_company_unit_id_fk references company_unit (id)
);
Drop table if exists users;
create table users(
    id serial not null constraint user_pk unique,
    auth_id int8 constraint user_auth_id_fk references auth (id),
    name varchar default 128,
    fullname varchar default 128,
    surname varchar default 128,
    secondname varchar default 128,
    status varchar default 128,
    company_unit_id int8 constraint user_company_unit_id_fk references company_unit_id (id),
    password varchar default 128,
    last_login_timestamp int8,
    iin varchar default 32,
    is_active boolean,
    is_activated boolean,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
Drop table if exists record;
create table record(
    id serial not null constraint record_pk unique,
    number varchar default 128,
    type varchar default 128,
    company_unit_id int8 constraint record_company_unit_id_fk references company_unit_id (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists nomenclature_summary;
create table nomenclature_summary(
    id serial not null constraint nomenclature_summary_pk unique,
    number varchar default 128,
    year int4,
    company_unit_id int8 constraint nomenclature_summary_company_unit_id_fk references company_unit_id (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
Drop table if exists nomenclature;
create table nomenclature(
    id serial not null constraint nomenclature_pk unique,
    number varchar default 128,
    year int4,
    nomenclature_summary_id int8 constraint nomenclature_nomenclature_summary_id_fk references nomenclature_summary (id),
    company_unit_id int8 constraint nomenclature_company_unit_id_fk references company_unit_id (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
Drop table if exists case_index;
create table case_index(
    id serial not null constraint case_index_pk unique,
    case_index varchar default 128,
    title_ru varchar default 128,
    title_kz varchar default 128,
    title_en varchar default 128,
    storage_type int4,
    storage_year int4,
    note varchar default 128,
    company_unit_id int8 constraint case_index_company_unit_id_fk references company_unit_id (id),
    nomenclature_summary_id int8 constraint case_index_nomenclature_id_fk references nomenclature_summary (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
Drop table if exists act_destroy;
create table act_destroy(
    id serial not null constraint act_destroy_pk unique,
    number varchar default 128,
    reason varchar default 256,
    company_unit_id int8 constraint act_destroy_company_unit_id_fk references company_unit_id (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists location;
create table location(
    id serial not null constraint location_pk unique,
    row varchar default 64,
    line varchar default 64,
    column varchar default 64,
    box varchar default 64,
    company_unit_id int8 constraint location_company_unit_id_fk references company_unit_id (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists tempfiles;
create  table tempfiles(
    id serial not null constraint tempfiles_pk unique,
    file_binary text,
    file_binary_byte bytea
);
drop table if exists files;
create table files (
    id serial not null constraint file_pk unique,
    name varchar default 128,
    type varchar default 128,
    size int8,
    page_count int4,
    hash varchar default 128,
    is_deleted boolean,
    file_binary_id int8 constraint file_file_binary_id_fk references tempfiles (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists file_routing;
create table file_routing(
    id serial not null constraint file_routing_pk unique,
    file_id int8 constraint file_routing_file_id_fk references files (id),
    table_name varchar default 128,
    table_id int8,
    type varchar default 128
);
drop table if exists case;
create table case(
    id serial not null constraint case_pk unique,
    number varchar default 128,
    vol_number varchar default 128,
    title_ru varchar default 128,
    title_kz varchar default 128,
    title_en varchar default 128,
    date_start int8,
    date_finish int8,
    page_count int8,
    is_active_eds boolean,
    eds text,
    is_delivered_naf boolean,
    is_deleted boolean,
    is_restricted boolean,
    hash varchar default 128,
    version int4,
    version_id varchar default 128,
    is_active_version boolean,
    note varchar default 255,
    location_id int8 constraint case_location_id_fk references location (id),
    case_index_id int8 constraint case_case_index_id_fk references case_index (id),
    record_id int8 constraint case_record_id_fk references record (id),
    act_destroy_id int8 constraint case_act_destroy_id_fk references act_destroy (id),
    company_unit_id int8 constraint case_company_unit_id_fk references company_unit_id (id),
    blockchain_address varchar default 128,
    blockchain_create_date int8,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists catalog;
create table catalog(
    id serial not null constraint catalog_pk unique,
    name_ru varchar default 128,
    name_kz varchar default 128,
    name_en varchar default 128,
    parent_id int8,
    company_unit_id int8 constraint catalog_company_unit_id_fk references company_unit_id (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists catalog_case;
create table catalog_case(
    id serial not null constraint catalog_case_pk unique,
    case_id int8 constraint catalog_case_case_id_fk references casee (id),
    catalog_id int8 constraint catalog_case_catalog_id_fk references catalog (id),
    company_unit_id int8 constraint catalog_case_company_unit_id_fk references company_unit_id (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists request;
create table request(
    id serial not null constraint request_pk unique,
    request_user_id int8 constraint request_user_id_fk references users (id),
    response_user_id int8 constraint response_user_id_fk references users (id),
    case_id int8 constraint request_case_id_fk references casee (id),
    case_index_id int8 constraint request_case_index_id_fk references case_index (id),
    created_type varchar default 64,
    comment varchar default 255,
    status varchar default 64,
    created_date int8,
    sharestart int8,
    sharefinish int8,
    favorite boolean,
    update_date int8,
    update_by int8,
    decline_note varchar default 255,
    company_unit_id int8 constraint request_company_unit_id_fk references company_unit_id (id),
    from_request_id int8
);
drop table if exists share;
create table share(
    id serial not null constraint share_pk unique,
    request_id  int8 constraint request_id_fk references request (id),
    note varchar default 255,
    sender_id int8 constraint share_sender_id_fk references users (id),
    receiver_id int8 constraint share_receive_id_fk references users (id),
    share_date int8
);
drop table if exists request_history;
create table request_history(
    id serial not null constraint request_history_pk unique,
    request_id  int8 constraint request_history_request_id_fk references request (id),
    status varchar default 64,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists activity_journal;
create table activity_journal(
    id serial not null constraint activity_journal_pk unique,
    event_type varchar default 128,
    object_type varchar default 128,
    object_id int8,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists notification;
create table notification(
    id serial not null constraint notification_pk unique,
    object_type varchar default 128,
    object_id int8,
    company_unit_id int8 constraint notification_company_unit_id_fk references company_unit_id (id),
    user_id int8 constraint notification_user_id_fk references users(id),
    created_timestamp int8,
    viewed_timestamp int8,
    is_viewed boolean,
    title varchar default 255,
    text varchar default 255,
    company_id int8 constraint notification_company_id_fk references company (id)
);

drop table if exists searchkey;
create table searchkey(
    id serial not null constraint searchkey_pk unique,
    name varchar default 128,
    company_unit_id int8 constraint searchkey_company_unit_id_fk references company_unit_id (id),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
drop table if exists searchkey_routing;
create table searchkey_routing(
    id serial not null constraint searchkey_routing_pk unique,
    searchkey_id int8 constraint searchkey_routing_searchkey_id_fk references searchkey (id),
    table_name varchar default 128,
    table_id int8,
    type varchar default 128
);
