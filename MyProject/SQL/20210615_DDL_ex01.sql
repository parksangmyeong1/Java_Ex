create table phoneInfo_basic(
    idx NUMBER(6) constraint basic_idx_pk primary key
    fr_name VARCHAR2(20) constraint fr_name_nn not null,
    fr_phonenumber VARCHAR2(20) constraint fr_phonenumber_nn not null,
    fr_email VARCHAR2(20),
    fr_address VARCHAR2(20),
    fr_regdate DATE DEFAULT SYSDATE
);

create table phoneInfo_univ(
    idx NUMBER(6) constraint univ_idx_pk primary key
    fr_u_major VARCHAR2(20) DEFAULT 'N',
    fr_u_year NUMBER(1) constraint fr_u_year_check check (fr_u_year between 0 and 5) DEFAULT 1
    fr_ref NUMBER(7) constraint univ_ref_fk foreign key (fr_ref) references phoneInfo_basic (idx)
);

create table phoneInfo_com(
    idx NUMBER(6) constraint idx_pk primary key
    fr_c_company VARCHAR2(20) DEFAULT 'N',
    fr_ref NUMBER(6) constraint com_ref_fk foreign key (fr_ref) references phoneInfo_basic (idx)
);
