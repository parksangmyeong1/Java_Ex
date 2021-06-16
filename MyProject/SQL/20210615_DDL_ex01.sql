drop table phoneInfo_basic;
drop table phoneInfo_univ;
drop table phoneInfo_com;

create table phoneInfo_basic(
    idx NUMBER(6) constraint basic_idx_pk primary key,
    fr_name VARCHAR2(20) constraint fr_name_nn not null,
    fr_phonenumber VARCHAR2(20) constraint fr_phonenumber_nn not null,
    fr_email VARCHAR2(20),
    fr_address VARCHAR2(20),
    fr_regdate DATE DEFAULT SYSDATE
);

create table phoneInfo_univ(
    idx NUMBER(6) constraint univ_idx_pk primary key,
    fr_u_major VARCHAR2(20) DEFAULT 'N' constraint fr_u_major_nn not null,
    fr_u_year NUMBER(1) default 1 constraint fr_u_year_nn not null
    constraint fr_u_year_check check (fr_u_year between 0 and 5),
    fr_ref NUMBER(7) constraint univ_fr_ref_nn not null
    constraint univ_ref_fk references phoneInfo_basic (idx)
);

create table phoneInfo_com(
    idx NUMBER(6) constraint idx_pk primary key,
    fr_c_company VARCHAR2(20) DEFAULT 'N' constraint fr_c_company_nn not null,
    fr_ref NUMBER(6) constraint com_ref_fk references phoneInfo_basic (idx)
                    constraint com_fr_ref_nn not null
);

desc phoneInfo_basic;
desc phoneInfo_univ;
desc phoneInfo_com;

drop table phoneInfo_univ;
drop table phoneInfo_com;
drop table phoneInfo_basic;
